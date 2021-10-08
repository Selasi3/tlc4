package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // Runnable r = new RunnableImpl ();
        subThread newThread = new subThread();
        newThread.start();
    }
}
