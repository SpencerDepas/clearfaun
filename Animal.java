package com.clearfaun;

/**
 * Created by SpencerDepas on 3/10/16.
 */
public abstract class Animal {

    public void eat(){
        System.out.println("I am eating");
    }


    public void sleep(){
        System.out.println("I am sleeping");
    }


    abstract void display();

}
