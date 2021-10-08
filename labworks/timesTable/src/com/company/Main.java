package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
   for (int index = 1;index<13;index++){
       for(int base =1;base<13;base++){
           int product = index*base;
           System.out.println(index + "x" + base + "=" + product);
       }
       System.out.println("--------------------------------------------------");
   }
    }
}
