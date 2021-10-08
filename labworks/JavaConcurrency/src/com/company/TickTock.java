package com.company;

public class TickTock implements Runnable {
    private String word;
    private int delay;


    public TickTock(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    public void run(){
        while(!Thread.interrupted()){
            try{

                    System.out.println(word + " ");
                    Thread.sleep(delay);


            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }


    public static void  main(String[] args){

        Thread tt1 = new Thread(new TickTock("tick", 50));
        Thread tt2 = new Thread(new TickTock("tock", 50));


            tt1.start();
            tt2.start();

    }
}

