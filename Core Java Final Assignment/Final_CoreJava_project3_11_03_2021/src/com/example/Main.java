package com.example;

import java.util.*;

public class Main {
    public static void main(String args[])
    {
        List<country> co = new ArrayList<country>();
      Scanner ob = new Scanner(System.in);
      int x = ob.nextInt();
      String temp = "";
      for(int i = 0; i<x; i++)
      {
          String s = ob.next();
          String[] l = s.split("\\|");
          if(temp.equals(l[0]))
          {
              co.get(co.size()-1).addState(l[1]);
          }
          else
          {
              temp = l[0];
              co.add(new country(l[0]));
              co.get(co.size()-1).addState(l[1]);
          }
      }
      Collections.sort(co, new Comparator<country>() {
          @Override
          public int compare(country o1, country o2) {
              return o1.getName().compareTo(o2.getName());
          }
      });
      for(int i= 0;i<co.size();i++)
      {
          System.out.println(co.get(i).getName());
          ArrayList<State> sl = (ArrayList<State>) co.get(i).getStateList();
          for(int j = 0;j<sl.size();j++)
          {
              System.out.println("--"+sl.get(j).getName());
          }
      }
    }
}
