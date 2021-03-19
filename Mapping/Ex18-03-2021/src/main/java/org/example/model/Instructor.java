package org.example.model;

import javax.persistence.*;

@Entity
@Table(name="instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="ins_name")
    private String ins_name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "insd_id")
    private InstructorDetail insd_id;

    public Instructor(String ins_name) {
        this.ins_name = ins_name;
    }

    public Instructor() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIns_name() {
        return ins_name;
    }

    public void setIns_name(String ins_name) {
        this.ins_name = ins_name;
    }

    public InstructorDetail getInsd_id() {
        return insd_id;
    }

    public void setInsd_id(InstructorDetail insd_id) {
        this.insd_id = insd_id;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", ins_name='" + ins_name + '\'' +
                ", insd_id=" + insd_id +
                '}';
    }
}
