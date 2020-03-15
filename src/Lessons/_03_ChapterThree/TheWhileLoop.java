package Lessons._03_ChapterThree;

class TheWhileLoop {

    public static void main(String args[]){

        /*
        General form of the while loop is:

        while(condition) statement;

         */

        char letter;

        //Print the alphabet using a while loop.
        letter = 'a';

        while (letter <= 'z') {

            System.out.println(letter);
            letter++;

        }



    }

}
