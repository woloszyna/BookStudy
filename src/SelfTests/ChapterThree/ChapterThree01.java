package SelfTests.ChapterThree;

import java.io.IOException;

class ChapterThree01 {

    //this is to read a character from the keyboard until a period is received. Have the program to coint number of spaces used.
    //Print such number at the end of the code

    public static void main(String args[]) throws IOException {

        char letter = '.';


        System.out.println("First type in a char other than a period.");

        letter = (char) System.in.read();

        do {


            System.out.println("Nope, I was thinking of something else.");
        }

        while (letter != '.');


        System.out.println("You have guessed the dot");

    }


}


