package Lessons._04_ChapterFour.Return;

public class ObjectOfVehicleForReturn{

    public static void main(String args[]){


        //Since class is created, an object of a class cna be instantiated / called / created
        VehicleForReturn minivan = new VehicleForReturn();
        VehicleForReturn sportscar = new VehicleForReturn();

        int minivanrange, sportscarrange;//initialise variables of a range


        //assigning values to fields in new object of vehicle = minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assigning values to fields in new object of vehicle = sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 11;
        sportscar.mpg = 13;

        minivanrange = minivan.range();
        sportscarrange = sportscar.range();


        //So the below variable is not needed  anymore since the calculation has already happened in the method of tha class
        //range = minivan.fuelcap * minivan.mpg;
        //READ line 12 of code

        //This is the one way of doing it (calling variables  created that hold the return values
        System.out.println("This car can carry " + minivan.passengers + " passengers, and it can have the range of " + minivan.range() + " km.");
        System.out.println("This car can carry " + sportscar.passengers + " passengers, and it can have the range of " + sportscar.range() + " km.\n");

        //OR

        //This is the otehr way of doing it (calling methods from other class
        System.out.println("This car can carry " + minivan.passengers + " passengers, and it can have the range of " + minivanrange + " km.");
        System.out.println("This car can carry " + sportscar.passengers + " passengers, and it can have the range of " + sportscarrange + " km.\n");


        if (minivanrange > sportscarrange) System.out.println("Minivan range is greater than the sportscar range");


    }

}
