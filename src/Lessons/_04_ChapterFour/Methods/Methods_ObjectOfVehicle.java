package Lessons._04_ChapterFour.Methods;

public class Methods_ObjectOfVehicle{

    public static void main(String args[]){


        //Since class is created, an object of a class can be instantiated / called / created. In this example, we will
        //create two objects on the class
        Methods_Vehicle minivan = new Methods_Vehicle();
        Methods_Vehicle sportscar = new Methods_Vehicle();

        int minivanrange, sportscarrange;

        //assigning values to fields in new object of vehicle = minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assigning values to fields in new object of vehicle = sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 11;
        sportscar.mpg = 13;


        //BEFORE this was done
        /*
        //compute the range using members of the class
        range = minivan.fuelcap * minivan.mpg;

        System.out.println("This car can carry " + minivan.passengers + " passengers, and it can have the range of " + range + "km.");

         */

        //THIS TIME, we will use the object and method from that object will perform all calculations, etc

        System.out.println("Minivan can carry " + minivan.passengers + " passengers.");
        minivan.range();

        System.out.println("Sportscar can carry " + sportscar.passengers + " passengers.");
        sportscar.range();

    }

}
