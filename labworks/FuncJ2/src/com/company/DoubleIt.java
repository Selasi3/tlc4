package com.company;

import java.util.function.Function;

public class DoubleIt implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer t){
        return  t*2;
    }
}
