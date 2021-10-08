package com.company;

public class LambdaStuff {
    int val1 = 100;

    Runnable r3 = ( ) -> {
        val1 += 1;
      System.out.println("Value: "+ val1);


    };
}
