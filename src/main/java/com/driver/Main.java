package com.driver;

import java.sql.SQLOutput;

public class Main {

    public static class ClassA {

        public static String meth(){
            return "Invoking method from class A";

        }
    }
    public static class ClassB extends ClassA {
        //@Override
        public static String meth(){
            return "Method is overridden in Extendend class B";

        }

    }

    public static void main(String[] args){
        ClassB objB=new ClassB();
        String ans=objB.meth();

        System.out.println(ans);
    }
  
}