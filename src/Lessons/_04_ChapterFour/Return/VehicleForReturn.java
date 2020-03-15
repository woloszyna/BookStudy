package Lessons._04_ChapterFour.Return;

//First define a class
class VehicleForReturn {


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


}


//Now open ObjectOfVehicleForReturn
