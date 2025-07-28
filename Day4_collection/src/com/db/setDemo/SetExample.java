package com.db.setDemo;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
//        Set<String> emails=new HashSet<>();
//        emails.add("abc@hotmail.com");
//        emails.add("saurabh@gmail.com");
//        emails.add("raj@gmail.com");
//        emails.add("saurabh@gmail.com");

        Set<Student> s=new HashSet<>();
        s.add(new Student("Amit")); //4
        s.add(new Student("Rashmi")); //6
        s.add(new Student("Priyanshi")); //9
        s.add(new Student("Ayush")); //5
        s.add(new Student("Amit")); //4
        s.add(new Student("Raja")); //4

        System.out.println(s);
    }
}
