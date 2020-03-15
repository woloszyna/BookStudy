package Lessons._04_ChapterFour.Methods;

//1. This is a basic class created

class Methods_Vehicle {

    int passengers; //how many passengers it  can carry
    int fuelcap; //fuel capacity in gallons
    int mpg; //miles per gallon

    //Within the class, we can also create a method (also called function)
//2. So this time (from Lessons._04_ChapterFour.HowObjectsAreCreated.Vehicle) rather than performing operation in
//the main class, we can actually perform all actions in the method.

    //void return type = does not return any value.
    void range() {

        System.out.println("The range is " + fuelcap * mpg + ".");

    }


}
