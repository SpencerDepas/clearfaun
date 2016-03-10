package com.clearfaun;

/**
 * Created by SpencerDepas on 3/10/16.
 */
public class Pig extends Animal implements  Observer{


    private Subject farmer;

    public Pig(Subject farmer){
        this.farmer = farmer;

        //the famrer adds the pig to the set of observables
        farmer.register(this);
    }

    public void unsubscribe(){
        farmer.unRegister(this);
    }



    @Override
    void display() {
        System.out.println("I am a pig, Oink, Oink");
    }

    @Override
    public void update(String feeingTime) {
        //whenever we the farmer gets an update to when he will be feeding the animals
        //all the animals get updated
        System.out.println();
        System.out.println("I am a pig, Oink, Oink");

        System.out.println(feeingTime);
    }
}
