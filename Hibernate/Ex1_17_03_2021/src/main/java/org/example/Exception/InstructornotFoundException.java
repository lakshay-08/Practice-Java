package org.example.Exception;

public class InstructornotFoundException extends RuntimeException{
    private String message;

    public InstructornotFoundException(String message1) { this.message = message1; }
    @Override
    public String getMessage(){return message;}
}
