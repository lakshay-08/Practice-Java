package org.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instructor {
    @Id
    @Column(name = "ins_id")
    private String Id;
    @Column(name = "ins_name")
    private String Name;
    @Column(name = "ins_course")
    private String Course;
    public Instructor() { }
    public Instructor(String id, String name, String course) {
        Id = id;
        Name = name;
        Course = course;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Course='" + Course + '\'' +
                '}';
    }
}