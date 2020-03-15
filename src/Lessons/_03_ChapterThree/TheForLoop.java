package Lessons._03_ChapterThree;

import java.io.IOException;

class TheForLoop {

    public static void main (String args[]) throws IOException {

        double num, sroot, rerr;

        for (num = 1; num <= 100000; num++) {

            //square root calculation
            sroot = Math.sqrt(num);
            System.out.println("the square root of " + num + " is " + sroot + ".");

            //compute rounding error
            rerr = num - (sroot * sroot);
            System.out.println("The compute rounding error is " + rerr + ".");
            System.out.println();

        }

        for (num = 100; num > 0; num = num -5) {
            System.out.println(num + " is too high");
        }

        if (num == 0) {
            System.out.println("OK");

        }
        int x, y;

        for (x = 0, y = 10; x < y; x++, y--) {

            System.out.println("the x and y are : " + x + "," + y);

        }

        int i;

        System.out.println("What is the letter?");
        for (i = 0; (char) System.in.read() != 's'; i++)
        System.out.println("PASS #"+i);

    }

}
