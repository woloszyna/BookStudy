package Lessons._03_ChapterThree;

import java.io.IOException;

public class IfElseIfLadder {

    public static void main(String[] chars) throws IOException {

        char letter;
        char answer;

        answer = 'k';

        System.out.print("Guess the letter that I have in mind: ");

        letter = (char) System.in.read();
        if (letter == answer) {
            System.out.print("Correct! You have chosen \"" + letter + "\".");
        }
        else if (letter == 'a') {
            System.out.print("Wrong! You have chosen \"a\"");
        }
        else if (letter == 'b') {
            System.out.print("Wrong! You have chosen \"b\"");
        }
        else if (letter == 'c'){
            System.out.print("Wrong! You have chosen \"c\"");
        }
        else if (letter == 'd') {
            System.out.print("Wrong! You have chosen \"d\"");
        }
        else if (letter == 'e') {
            System.out.print("Wrong! You have chosen \"e\"");
        }
        else if (letter == 'f') {
            System.out.print("Wrong! You have chosen \"g\"");
        }
        else if (letter == 'h') {
            System.out.print("Wrong! You have chosen \"h\"");
        }
        else if (letter == 'i'){
            System.out.print("Wrong! You have chosen \"i\"");
        }
        else if (letter == 'j'){
            System.out.print("Wrong! You have chosen \"j\"");
        }
        else if (letter == 'k') {
            System.out.print("Wrong! You have chosen \"k\"");
        }
        else if (letter == 'l') {
            System.out.print("Wrong! You have chosen \"l\"");
        }
        else if (letter == 'm'){
            System.out.print("Wrong! You have chosen \"m\"");
        }
        else if (letter == 'n') {
            System.out.print("Wrong! You have chosen \"n\"");
        }
        else if (letter == 'o') {
            System.out.print("Wrong! You have chosen \"p\"");
        }
        else if (letter == 'q') {
            System.out.print("Wrong! You have chosen \"r\"");
        }
        else if (letter == 's') {
            System.out.print("Wrong! You have chosen \"s\"");
        }
        else if (letter == 't'){
            System.out.print("Wrong! You have chosen \"t\"");
        }
        else if (letter == 'u') {
            System.out.print("Wrong! You have chosen \"v\"");
        }
        else if (letter == 'x') {
            System.out.print("Wrong! You have chosen \"x\"");
        }
        else if (letter == 'y') {
            System.out.print("Wrong! You have chosen \"y\"");
        }
        else if (letter == 'z') {
            System.out.print("Wrong! You have chosen \"z\"");
        }
            else{
                System.out.println("You did not choose a letter!");
        }
     }
}
