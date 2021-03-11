package com.example;

public class State implements Comparable{
 private String name;

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        State s = (State) o;
        return this.getName().compareTo(s.getName());
    }
}
