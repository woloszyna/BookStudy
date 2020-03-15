package Lessons._04_ChapterFour.HowObjectsAreCreated;

import Lessons._04_ChapterFour.HowObjectsAreCreated.Vehicle;

public class ObjectOfVehicle{

    public static void main(String args[]){


        //Since class is created, an object of a class cna be instantiated / called / created by
        Vehicle minivan = new Vehicle();
        int range;


        //assigning values to fields in new objects
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //compute the range using members of the class
        range = minivan.fuelcap * minivan.mpg;

        System.out.println("This car can carry " + minivan.passengers + " passengers, and it can have the range of " + range + "km.");

    }

}
