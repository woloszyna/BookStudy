package Lessons._03_ChapterThree;

import java.io.IOException;

public class SimplerIfElseFromJohn {

    public static void main(String[] chars) throws IOException {

        char letter;
        char answer;

        answer = 'k';

        System.out.print("Guess the letter that I have in mind: ");

        letter = (char) System.in.read();
        if (letter == answer) {
            System.out.print("Correct! You have chosen \"" + letter + "\".");
        } else{
            System.out.println("Incorrect! You picked a " + letter + "!");
        }
    }
}
