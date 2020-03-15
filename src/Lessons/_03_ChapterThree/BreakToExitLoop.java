package Lessons._03_ChapterThree;

import java.io.IOException;

class BreakToExitLoop {

    public static void main(String args[]) throws IOException {


        //break terminates the loop when (i * i  >= num). Try to increase the num and see the results.
        int num;
        num = 100;

        for (int i = 0; i < 100; i++){

            if (i * i  >= num) break;
            System.out.print(i + " ");

        }

        System.out.println("Loop Complete.\n");



        //Another example of break terminating statement. The infinite (;;) loop will go forever until correct (ch == 'k') letter will be provided.
        char ch;

        for (;;){

            ch = (char) System.in.read();
            if (ch == 'k') break;
        }
        System.out.println("Loop Complete.\n" +
                "You have pressed the \"" + ch + "\".");

    }

}
