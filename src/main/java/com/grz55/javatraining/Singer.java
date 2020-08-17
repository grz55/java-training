package com.grz55.javatraining;

public class Singer implements Runnable { //or extends Thread

    @Override
    public void run() {
        System.out.println("method running in a thread");
    }
}
