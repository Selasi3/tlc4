package com.company;

import java.util.function.Function;

public class Main {


//    public  class FuncDriver {
//        public static int doIt(int n, Function<Integer, Integer> f) {
//            return f.apply(n);
//        }
//    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(new DoubleIt().apply(9));
        System.out.println("------------------------------");
       System.out.println(FuncDriver.doIt(3, new DoubleIt()));
        System.out.println("------------------------------");
       System.out.println(FuncDriver.doIt(3, new SquareIt()));
        System.out.println("------------------------------");

        System.out.println("Using Lambda");
        Function<Integer, Integer> squareIt2  = i -> i*i;
        System.out.println(FuncDriver.doIt(4,squareIt2));
        System.out.println("------------------------------");
        System.out.println("Impementing funcTest");
        FuncTest ft = new FuncTest();
        ft.r1.run();
        ft.r2.accept(10);
        System.out.println("------------------------------");
        System.out.println("Impementing Lambda");


    }
}

