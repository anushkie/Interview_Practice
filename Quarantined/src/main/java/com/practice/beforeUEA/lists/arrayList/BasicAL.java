package com.practice.beforeUEA.lists.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicAL {

    public static void main(String[] args) {

        Student s1 = new Student(1, "mui", 23);
        Student s2 = new Student(2, "asnsn", 27);
        Student s3 = new Student(3, "mvmss", 75);

        //creating arraylist
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            System.out.println(student.rollNo + " " + student.name + " " + student.age);
        }
    }

}
