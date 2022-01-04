package com.company.lambdas;

public class RunnableLambdaExample{
    public static void main(String[] args) {
        /**
         * prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        //Java 8 up lambda

        Runnable runnableLambda = () -> System.out.println("Inside Runnable 2");

        new Thread(runnableLambda).start();
        new Thread(() -> System.out.println("Inside Runnable 3")).start();

    }

}
