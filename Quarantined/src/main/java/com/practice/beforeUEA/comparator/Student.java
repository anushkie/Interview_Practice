package com.practice.beforeUEA.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }


    public String toString() {
        return this.rollNo + " " + this.name + " " + this.address;
    }
}

    class SortByRoll implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.rollNo - o2.rollNo;
        }
    }

    class SortByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    class Driver {

        public static void main(String[] args) {
            ArrayList<Student> arrayList = new ArrayList<>();
            arrayList.add(new Student(1,"Mungi", "norwich"));
            arrayList.add(new Student(2, "Sangu", "leicester"));
            arrayList.add(new Student(3,"qwerty", "italy"));

            Collections.sort(arrayList, new SortByName());
        }


    }

