package com.nitiz.Exception;


import java.io.FileNotFoundException;

public class ExceptionPropagation {
    // Exception propagates along its call stack

    void m1 (){
        System.out.println("inside m1");
        m2();
    }
    void m2(){
        System.out.println("inside m2");
        m3();

    }
    void m3() throws FileNotFoundException{
        System.out.println("inside m3");
       // throw new RuntimeException("Method throws runtime exception: TestException");
        // either we can handle this exception here inside this method
        // or we can handle from a method who calls this method as exception
        // is transferred to calling method
        try{
            throw new FileNotFoundException();

        }catch (Exception e){
            System.out.println("Exception occured:"+e);
        }

    }

    public static void main(String[] args) {
        System.out.println("Inside main method..");
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.m1();  // expection propagates from m3 -> m2-> m1-> main
        System.out.println("Program ends normally .. ");
    }

}
