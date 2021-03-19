package org.example;

import org.example.model.Instructor;
import org.example.model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class App 
{

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

        while(true) {
            System.out.println("1: CREATE\n0: EXIT");
            int ch = scanner.nextInt();
            switch(ch) {
                case 1: System.out.println("Name");
                        String n = scanner.next();
                        System.out.println("Youtube channel");
                        String yt = scanner.next();
                        Session session=factory.getCurrentSession();
                        Instructor tempInstructor = new Instructor(n);
                        InstructorDetail tempInstructorDetail = new InstructorDetail(yt);
                        tempInstructor.setInsd_id(tempInstructorDetail);
                        session.getTransaction().begin();
                        session.save(tempInstructor);
                        session.getTransaction().commit();
                        break;
                case 0: System.exit(0);
            }
        }
    }
}
