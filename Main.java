package com.clearfaun;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hellooo world");

        //farmer is the subject
        FarmerDude zekeTheFarmerDude = new FarmerDude();


        //animals are the observers
        //they want to know their feeding time
        //farmerzeke is passed to the animals so they can find out when they will get fed
        Animal piggyLongStockings = new Pig(zekeTheFarmerDude);
        Animal bigMomaSheep = new Sheep(zekeTheFarmerDude);


        //changes feeding time
        zekeTheFarmerDude.setTimeTillDinner();

        //updates all the listners
        zekeTheFarmerDude.notifyObserver();

        zekeTheFarmerDude.setTimeTillDinner();
        zekeTheFarmerDude.notifyObserver();
    }
}
