package com.clearfaun;

/**
 * Created by SpencerDepas on 3/10/16.
 */
public class Sheep extends Animal implements Observer{

    private Subject farmer;


    public Sheep(Subject farmer){
        this.farmer = farmer;

        farmer.register(this);
    }

    public void unsubscribe(){
        farmer.unRegister(this);
    }

    @Override
    void display() {
        System.out.println("I am a Sheep. BAHHHHHHHH BAA");
    }

    @Override
    public void update(String feeingTime) {
        System.out.println();
        System.out.println("I am a Sheep. BAHHHHHHHH BAA");

        System.out.println(feeingTime);

    }
}
