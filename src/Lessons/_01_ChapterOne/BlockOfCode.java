package Lessons._01_ChapterOne;

class BlockOfCode {

    public static void main(String args[]){

        double i, j, d;

        i = 5;
        j = 10;


        /*
        The whole point of the block of code is to execute together of
        what is within the block of code (if the IF statement is true
         */


        if(i != 0) //here the IF statement checks if the 'i' has a value other than zero.
                   // If so (and it has value of 5 assigned) the following block of code is executed.

        {

            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i equals " + d);


            //EXERCISE: change the i to 0 and execute the statement. The IF statement will fail and the block of code will not execute.

        }

    }

}
