package com.db.filedemo;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args)  {
        try {
            FileReader fr=new FileReader("D://Data.txt");
            BufferedReader br=new BufferedReader(fr);
            br.skip(50);
            String str=null;
            while((str=br.readLine())!=null)
                System.out.println(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
