package org.example.dao;
import org.example.Entity.Instructor;
import org.example.Exception.InstructornotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class InstructorDaoImpl implements InstructorDao{
    private SessionFactory sessionFactory;
    private static Scanner scanner = new Scanner(System.in);
    private Session session;

    {
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).buildSessionFactory();
    }
    @Override
    public void createInstructor(Instructor instructor) {

        try {
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            session.save(instructor);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("duplicate id.");
        }

    }

    @Override
    public List<Instructor> getInstructor() {
        session=sessionFactory.openSession();
        Query query=session.createQuery("FROM Instructor");
        return query.getResultList();
    }

    @Override
    public Instructor getById(String id) {
        session=sessionFactory.openSession();
        Instructor c = session.get(Instructor.class,id);
        if(c==null)
        {
            throw new InstructornotFoundException("No Data found for ID:"+id);
        }
        return c;
    }

    @Override
    public List<Instructor> getByName(String n) {
        session=sessionFactory.openSession();
        Query q=session.createQuery("FROM Instructor c where c.Name = :cnam");
        q.setParameter("cnam",n);
        return q.getResultList();
    }

    @Override
    public Instructor UpdateById(String id) {
        session=sessionFactory.openSession();
        Instructor c = session.get(Instructor.class,id);
        if(c==null)
        {
            throw new InstructornotFoundException("No Data found for ID:"+id);
        }
        System.out.print("Updated NAME: ");
        String nan = scanner.next();
        System.out.println("Updated Course");
        String co = scanner.next();
        c.setName(nan);
        c.setCourse(co);
        session.getTransaction().begin();
        session.merge(c);
        session.getTransaction().commit();
        return c;
    }

    @Override
    public Instructor DeleteById(String id) {
        session=sessionFactory.openSession();
        Instructor c = session.get(Instructor.class,id);
        if(c==null)
        {
            throw new InstructornotFoundException("No Data found for ID:"+id);
        }
        session.getTransaction().begin();
        session.delete(c);
        session.getTransaction().commit();
        return c;
    }
}
