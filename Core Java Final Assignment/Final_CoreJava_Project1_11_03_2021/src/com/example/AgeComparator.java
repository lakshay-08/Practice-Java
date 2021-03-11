package com.example;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Employee employee1=(Employee) o;
        Employee employee2=(Employee) t1;
        if(employee1.getAge()==employee2.getAge())
        {
            if(employee1.getDateOfJoining().equals(employee2.getDateOfJoining()))
            {
                return 0;
            }
            else if(employee1.getDateOfJoining().before(employee1.getDateOfJoining()))
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else if (employee1.getAge()<employee2.getAge())
            return 1;
        else
            return -1;

    }
}
