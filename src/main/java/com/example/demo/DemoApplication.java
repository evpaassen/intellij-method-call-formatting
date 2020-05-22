package com.example.demo;

public class DemoApplication {

    public static void main(String[] args) {
        someMethodWithALongName(anotherMethodWithALongName(DemoApplication.class,
                "this is argument 2",
                "argument 3 goes here",
                "and finally argument 4"
        ));
    }

    public static void someMethodWithALongName(String str) {
    }

    public static String anotherMethodWithALongName(Class<?> type, String str1, String str2, String str3) {
        return "test";
    }
}
