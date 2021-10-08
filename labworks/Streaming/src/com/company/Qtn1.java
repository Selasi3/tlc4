package com.company;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.stream.Stream;

public class Qtn1 {

    public static void getData(String path){
        try (Stream<String> stream = Files.lines(Paths.get(path))){
            stream.forEach(System.out::println);

        } catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {

        String getFile = "./Trades.txt";

        getData(getFile);

    }
}



