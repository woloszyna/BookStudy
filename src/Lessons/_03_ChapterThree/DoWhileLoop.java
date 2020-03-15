package Lessons._03_ChapterThree;

import java.io.IOException;

class DoWhileLoop {

    public static void main(String args[]) throws IOException {

        char letter;

        do {
            System.out.println("What is the letter that I have in mind?");
            letter = (char) System.in.read();

            //System.out.println("Incorrect letter. We were thinking about something else.");
        }

        while (letter != 'k');
        System.out.println("Correct letter!! We were also thinking about \"" + letter + "\"");

    }


}



