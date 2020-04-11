package Lessons._04_ChapterFour.Scribbles;

class VehicleForReturnWithParams {

    //Added parameterized fuelneeded(int miles) method was created and added to calculate how much of fuel is needed to travel x miles

    int passengers; //how many passengers it  can carry
    int fuelcap; //fuel capacity in gallons
    int mpg; //miles per gallon

    //In a class, a method can be defined to return a value
    //note that previously the method was a return type of void (void range() {...)

    //This time the return type will change
    int range() {

        //return statement will be used to return a value from the calculation
        return mpg * fuelcap;
    }

    //This parameterized method returns fuel needed for a distance
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }

}


//Now open ObjectOfVehicleForReturn