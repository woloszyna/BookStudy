package Lessons._03_ChapterThree;

class DeclaringVarInsideTheForLoop {

    //One can declare a variable inside the loop and use it ONLY there.

    public static void main(String args[]) {

        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++) { //variable i is only declared within the for loop, so it is known here

            sum += i;
            /*
            Breakdown of the equation
            sum(0)+1
            sum(1)+2
            sum(3)+3
            sum(6)+4
            sum(10)+5
            sum  = 15
             */

            fact *= i;
            /*
            Breakdown of the equation
            fact(1)*1
            fact(1)*2
            fact(2)*3
            fact(6)*4
            fact(24)*5
            fact = 120
             */

        }

        //variable i is only declared within the for loop, so it is dropped here

        System.out.println("Sum is " + sum);
        System.out.println("The factorial is " + fact);
        //System.out.println("The factorial is " + i); This would never run as the i is not known.

    }

}
