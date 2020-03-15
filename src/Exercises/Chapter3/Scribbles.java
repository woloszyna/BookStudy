package Exercises.Chapter3;

import java.io.IOException;

class Scribbles {

    //Creating the for loop

    public static void main(String args[]) {


        int i;
        int sum = 0;

        for(i = 1; i <= 5; sum += i++) ; //This loop  does not have a body {...}
        /*
        The rationale for the expression in the loop:

        When sum =  0 (as var created) and i = 1, and i++ means to increase value anytime, also i <= is to stop when i = 5,
        then the sum += i++ means: The (initial) sum 0 plus increased i which because is handled without the loop,
        equals to 1 + 2 + 3 + 4 + 5.

        So the whole equation will be 0 + 1 + 2 + 3 + 4 + 5 and the result is 15
         */

            System.out.println("The sum is " + sum);


        }

    }

