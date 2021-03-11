package com.example;

import java.util.regex.Pattern;
import java.util.regex.*;
public class UserMainCode {
    public static boolean validate(String p)
    {
     String test = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+_-]).{8,}$";
     Pattern p1 = Pattern.compile(test);
     Matcher m = p1.matcher(p);
     return m.matches();
    }
}
