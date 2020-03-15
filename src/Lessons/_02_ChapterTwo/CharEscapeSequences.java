package Lessons._02_ChapterTwo;

public class CharEscapeSequences {

    public static void main (String args[]){
        int first, second;

        first = 1;
        second = 2;


        System.out.println("This  is the " + first + " line,\nAnd this is the " + second  + " line.\n\n" +
                "This all is to show how the moving text to new line escape character works.\n" +
                "Please note the \"\\n\" in the code above.\n" +
                "By using this we do not have to use another System.out.println() in the code, keeping it neater.\n");


        System.out.println("Other interesting escape literal is \"\\t\", which then introduces a tab between characters.\n" +
                "The good example is in the exercise below.\n");


        System.out.println("A\tB\tC\tD\n");

        System.out.println("As visible, there has been now a tab placed in between characters");

    }


}
