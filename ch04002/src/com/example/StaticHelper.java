package com.example;

import java.time.LocalDate;


public class StaticHelper {
    public static void printMessage(String message)
    {
        System.out.println("Message for "+ LocalDate.now()+": " +message);
    }
}
