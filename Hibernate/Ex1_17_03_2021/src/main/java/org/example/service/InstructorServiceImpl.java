package org.example.service;

import org.example.Entity.Instructor;
import org.example.dao.InstructorDao;
import org.example.dao.InstructorDaoImpl;

import java.util.List;

public class InstructorServiceImpl implements InstructorService{
    private InstructorDao instructorDao;
    {
        instructorDao=new InstructorDaoImpl();
    }
    @Override
    public void createInstructor(Instructor instructor) { instructorDao.createInstructor(instructor); }

    @Override
    public List<Instructor> getInstructor() {
        return instructorDao.getInstructor();
    }

    @Override
    public Instructor getById(String id) {
        return instructorDao.getById(id);
    }

    @Override
    public List<Instructor> getByName(String n) {
        return instructorDao.getByName(n);
    }

    @Override
    public Instructor UpdateById(String id) {
        return instructorDao.UpdateById(id);
    }

    @Override
    public Instructor DeleteById(String id) {
        return instructorDao.DeleteById(id);
    }
}
