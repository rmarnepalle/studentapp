package com.rcode.demos.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String args[]){
        Employee emp3 = new Employee("sam","125");
        Employee emp = new Employee("Aryan","33");
        Employee emp2 = new Employee("Bob","34");
        Employee emp4 = new Employee("ryan","5");
        Employee emp1 = new Employee("Aadi","123");

        List list = new ArrayList<Employee>();
        list.add(emp3);
        list.add(emp);
        list.add(emp2);
        list.add(emp4);
        list.add(emp1);

        Collections.sort(list);
        int i=0;
        for (; list.iterator().hasNext();){
            Employee em = (Employee) list.get(i);
              System.out.println("Name = " +em.name + "  "+"Id = "+em.id);
              i++;
        }

    }

    @Override
    public int compareTo(Employee e) {
        return id.compareTo(e.id);
    }
}
