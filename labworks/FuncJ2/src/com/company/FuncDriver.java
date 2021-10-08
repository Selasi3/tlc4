package com.company;

import java.util.function.Function;

public class FuncDriver {
    public static int doIt(int n, Function<Integer, Integer> f) {
           return f.apply(n);
    }
}
