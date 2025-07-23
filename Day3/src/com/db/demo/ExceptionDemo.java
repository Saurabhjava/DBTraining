package com.db.demo;


import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.next();
        int arr[]={2,4,7,8,9};
        try {
            System.out.println("Hello");
            System.out.println(10/2);
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Error1");
        }
        catch(ArithmeticException e2){
            System.out.println("Error1");
        }
        catch(Exception e) {
            System.out.println("Error--->"+e.getMessage());
        }
        finally {
            sc.close();
        }
        System.out.println("End Of Main");
    }
}
