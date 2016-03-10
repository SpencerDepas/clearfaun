package com.clearfaun;

/**
 * Created by SpencerDepas on 3/10/16.
 */
public interface Subject {

    public void register(Observer o);
    public void unRegister(Observer o);
    public void notifyObserver();

}
