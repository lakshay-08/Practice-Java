package org.example;

import org.example.Entity.Instructor;
import org.example.Exception.InstructornotFoundException;
import org.example.service.InstructorService;
import org.example.service.InstructorServiceImpl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
/*
Prerequisite
Create a database named hr in Mysql
Create a table instructor in hr
with
id Varchar
name Varchar
course Varchar
 */
public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static InstructorService instructorService;

    static {
        instructorService = new InstructorServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println("Loading data from the file.......");
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            for (String line; (line = br.readLine()) != null; ) {
                String[] vals = line.split(",");
                if(vals.length!=2)
                {
                    System.err.println("Corrupt Data in File");
                }
                else {
                    UUID uuid = UUID.randomUUID();
                    instructorService.createInstructor(new Instructor(uuid.toString(), vals[0], vals[1]));
                }
            }
        }catch (Exception e){}
        System.out.println("Data Loaded Successfully from the file!!!");
        while (true) {
            System.out.println("1:Create\n2:Display\n3:Get by ID\n4:Get By Name\n5:Update\n6:Delete\n0:Exit");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:System.out.println("Instructor Name:");
                       String n = scanner.next();
                       System.out.println("Course");
                       String c = scanner.next();
                       UUID uuid = UUID.randomUUID();
                       instructorService.createInstructor(new Instructor(uuid.toString(),n,c));
                       break;
                case 2: List<Instructor> list = instructorService.getInstructor();
                        Iterator<Instructor> iterator = list.listIterator();
                        while (iterator.hasNext()) { System.out.println(iterator.next());}
                        break;
                case 3: System.out.print("ID: ");
                        String id = scanner.next();
                        Instructor c2 = instructorService.getById(id);
                        System.out.println("Customer Found:"+c2);
                        break;
                case 4: System.out.print("Name: ");
                        String n1 = scanner.next();
                        List<Instructor> l = instructorService.getByName(n1);
                        if(l.isEmpty())
                        {
                            throw new InstructornotFoundException("Instructor not Found!!!");
                        }
                        for(Instructor t: l)
                        {
                            System.out.println(t);
                        }
                        break;
                case 5:System.out.print("ID :");
                       String id1 = scanner.next();
                       Instructor c1= instructorService.UpdateById(id1);
                       System.out.println("Updated Complete");
                       System.out.println(c1);
                       break;
                case 6:System.out.print("ID :");
                       String id2 = scanner.next();
                       Instructor c3 = instructorService.DeleteById(id2);
                       System.out.println(c3);
                       System.out.println("Deleted");
                       break;
                       case 0:System.exit(0);
            }
        }
    }
}
