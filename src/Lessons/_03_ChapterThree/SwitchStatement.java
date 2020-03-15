package Lessons._03_ChapterThree;

import java.io.IOException;

public class SwitchStatement {

    public static void main(String chars[]) throws IOException {

        char letter;
        char answer;

        answer = 'k';

        System.out.print("Guess the letter that I have in mind: ");

        letter = (char) System.in.read();

        switch(letter) {

            case 'a': //<--this could be written as a letter or a number
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'x':
            case 'y':
            case 'z':
                System.out.print("INCORRECT, the answer was \""  + answer + "\"! Your choice was \"" + letter + "\"!");
                break;
            case 'k':
                System.out.print("CORRECT, the answer was \""  + answer + "\"! Your choice was k!");
                break;
            default:
                System.out.print("You have provided " + letter + ". Try again.");
        }

    }
}
