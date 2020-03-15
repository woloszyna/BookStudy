package Lessons._03_ChapterThree;

        import java.io.IOException;

class InputCharsFromKeyboard {

    public static void main(String args[]) throws IOException {

        char text;

        System.out.print("Type a character and press ENTER: ");

        text = (char) System.in.read();

        System.out.print("You have pressed " + text + ".");



    }

}
