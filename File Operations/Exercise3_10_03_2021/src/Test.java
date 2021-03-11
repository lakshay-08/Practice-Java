import com.example.Employee;
import com.example.EmployeeFactory;

import java.io.*;
import java.util.List;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter comma separated values containing Employee ID,First Name,Last Name,Email");
        System.out.println("Enter done to complete the entry");
        try(PrintWriter fw = new PrintWriter(new File("employee.txt")))
        {
            String line ;
            while((line = scan.nextLine()) != null)
            {
                if((line.trim().equalsIgnoreCase("Done")))
                {
                    System.out.println("Input complete");
                    break;
                }
                fw.println(line);
            }

        }catch(FileNotFoundException e){};
        EmployeeFactory ef = new EmployeeFactory();
        List<Employee> empObjs = ef.createEmployee();
        for(int i=0;i<empObjs.size();i++)
        {
            empObjs.get(i).display();
            System.out.println("*********************");
        }
    }
}
