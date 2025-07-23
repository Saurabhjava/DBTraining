package com.db.model.interfacedemo;

public class StringTest {
    public static void main(String[] args) {
        String str="Hello";
        StringBuffer sb=new StringBuffer(str);
        sb.append(" Java").insert( 5," DB").delete(2,4);
        System.out.println(sb);

    }
}
