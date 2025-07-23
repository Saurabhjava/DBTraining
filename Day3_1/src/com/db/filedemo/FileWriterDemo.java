package com.db.filedemo;

import java.io.*;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.next();
        System.out.println("Enter Email");
        String email=sc.next();

        try {
            FileWriter fw=new FileWriter("d://Data.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            //fw.write(name+"\t"+email+"\n");
            PrintWriter out=new PrintWriter(bw);
            out.println(name+"\t"+email);
            out.flush();
            out.close();;
            //fw.flush();
            //fw.close();
            System.out.println("Data Saved");
        } catch (IOException e) {
            System.out.println("Error in File--->"+e.getMessage());
        }
    }
}
