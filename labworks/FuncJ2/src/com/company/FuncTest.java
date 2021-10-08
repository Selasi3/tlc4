package com.company;

import java.util.function.Consumer;

public class FuncTest {
Runnable r1 = ()->
        System.out.println(this.toString());
        Consumer<Integer> r2 = x -> System.out.println(x);

        public String toString(){
            return "FunctTest";
        }


    }

