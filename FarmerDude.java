package com.clearfaun;

import java.util.ArrayList;

/**
 * Created by SpencerDepas on 3/10/16.
 */
public class FarmerDude implements Subject {

    private String timeTillDinner = "you will be fed in 10 minuets";
    private ArrayList<Observer> observers;



    public FarmerDude() {
        //this is where all the obserables are stores
        observers = new ArrayList<Observer>();
    }

    public String getTimeTillDinner() {
        return timeTillDinner;
    }

    public void setTimeTillDinner( ) {
        //random generator for dinner time
        int randomNum = 1 + (int)(Math.random() * 99);
        timeTillDinner = "you will be fed in " + randomNum +" minuets";
    }


    public void speak() {
        System.out.println("I am a farmer dude. I like to farm and drink beer");
    }


    @Override
    public void register(Observer newObserver) {
        //this is what adds the listners to the Subject
        observers.add(newObserver);



    }

    @Override
    public void unRegister(Observer deleteObserver) {
        //this removes the listners from the subject

        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex + 1) + " has been deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        //this sends out infomation to all the listners of the subject


        for (Observer observer : observers) {
            observer.update(timeTillDinner);

        }

    }

}
