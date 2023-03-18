package com.example;

public final class DbConfigSingleton {
    private final String hostname;
    private final String dbName;

    private  static final DbConfigSingleton intance=new DbConfigSingleton();

    private DbConfigSingleton(){
        //Values loaded from file in practice

        hostname="dbhost.example.com";
        //
        dbName="TestDb";
        System.out.println(hostname);
        System.out.println(dbName);
    }

    public  static  DbConfigSingleton getInstance()
    {

        return intance;
    }

}
