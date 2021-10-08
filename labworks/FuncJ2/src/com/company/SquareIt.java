package com.company;

import java.util.function.Function;

public class SquareIt implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer t){
        return  t*t;
    }
}

