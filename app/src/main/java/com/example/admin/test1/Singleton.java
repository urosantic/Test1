package com.example.admin.test1;

/**
 * Created by Admin on 12/3/2017.
 */

public class Singleton {

    private static  Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance()  {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
