package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class country implements Comparable {
    private String name;
    List<State> stateList = new ArrayList<State>();

    public country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addState(String s)
     {
         stateList.add(new State(s));
     }
     public List getStateList()
     {
         Collections.sort(this.stateList);
         return this.stateList;
     }

    @Override
    public int compareTo(Object o) {
        country s = (country) o;
        return this.getName().compareTo(s.getName());
    }
}
