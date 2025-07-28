package com.db.setDemo;

import java.util.Objects;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //    @Override
//    public boolean equals(Object obj) {
//        System.out.println("**************************");
//       if(obj instanceof  Student && this.name==((Student)obj).name)
//            return true;
//       else
//           return false;
//    }
//    @Override
//    public int hashCode(){
//        System.out.println("=====================");
//        return name.length();
//    }
}
