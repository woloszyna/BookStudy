package Lessons._03_ChapterThree;

import java.io.IOException;

class doElseLetterGameImprovement {

    public static void main(String args[]) throws IOException {


        char letter, ignore, answer = 'k';

        do {

            System.out.println("Guess the letter that I have in mind.");
            letter = (char) System.in.read();

            do {

                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (letter == answer) {

                System.out.println("Great, I was thinking about \"" + answer + "\".");

            } else {

                System.out.print("Wrong! I was thinking about something else. You are ");

                if (letter < answer) {

                    System.out.print("too low.");

                } else {

                    System.out.print("too high.");

                }

                System.out.println(" Try again!");
            }

        }

        while (answer != letter);

    }


}
