package org.example.dao;

import org.example.Entity.Instructor;

import java.util.List;

public interface InstructorDao {
    public void createInstructor(Instructor instructor);
    public List<Instructor> getInstructor();
    public Instructor getById(String id);
    public List<Instructor> getByName(String n);
    public Instructor UpdateById(String id);
    public Instructor DeleteById(String id);
}
