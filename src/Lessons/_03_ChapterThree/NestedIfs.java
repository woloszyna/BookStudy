package Lessons._03_ChapterThree;

import java.io.IOException;

public class NestedIfs {

    public static void main(String chars[]) throws IOException {

        char letter;
        char answer;

        answer = 'k';

        System.out.print("Guess the letter that I have in mind: ");

        letter = (char) System.in.read();
        if (letter == answer) {
            System.out.print("Correct! You have chosen \"" + letter + "\".");
        }
        else {
            System.out.print("Wrong! You have chosen \"" + letter + "\"!\n");

            if (letter < answer){ //<--this block of code instantiates the nested if
                System.out.println("Try answer higher letter in the alphabet");
            }
            else{
                System.out.println("Try answer lower letter in the alphabet");
            }
        }


    }

}
