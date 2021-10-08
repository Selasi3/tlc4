package com.company;

public class TickTocks2 extends Thread{
    private String word;
    private int delay;


    public TickTocks2(String word, int delay) {
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

    TickTocks2 tt1 = new TickTocks2("tick", 50);
    TickTocks2 tt2 = new TickTocks2("tock", 100);
    tt1.start();
    }
}

