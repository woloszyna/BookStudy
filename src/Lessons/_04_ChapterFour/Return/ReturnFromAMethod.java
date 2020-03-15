package Lessons._04_ChapterFour.Return;

public class ReturnFromAMethod {

    public static void main(String args[]) {

        int i;


        //Here, the for loop runs from 1 to 10 value of 'i'
        for (i = 1; i <= 10; i++) {


            if (i == 2) {

                System.out.print("This is " + i + ".");
                System.out.println(" Just some random statement to practice the 'if' statements :P");

            }

            //However, when 'i'  = 7, statement is terminated.
            if (i == 7) {
                System.out.println("The count is over here, because i = 7 and the return kicks in.");
                return;
                //the returns's role is to terminate a statement when the line of code with the return; is reached.
            }

            System.out.println("This is " + i + ".");

        }

    }
}
