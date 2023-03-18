package com.example;

public class SingletonClass {
    private static  final SingletonClass  instance = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance(){

       System.out.println("Returning instance...");
       return  instance;
    }


}
