package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static class A {
        public static String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        //@Override
        public static String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args){
        B objB=new B();
        String ans=objB.meth();

        System.out.println(ans);
    }
  
}