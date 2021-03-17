package org.example.service;
import org.example.Entity.*;
import java.util.List;

public interface InstructorService {
    public void createInstructor(Instructor instructor);
    public List<Instructor> getInstructor();
    public Instructor getById(String id);
    public List<Instructor> getByName(String n);
    public Instructor UpdateById(String id);
    public Instructor DeleteById(String id);
}
