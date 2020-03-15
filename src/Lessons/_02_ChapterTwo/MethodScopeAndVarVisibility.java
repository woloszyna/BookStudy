package Lessons._02_ChapterTwo;

public class MethodScopeAndVarVisibility {


    public static void main (String args[]){

        int x;
        x = 10;

        System.out.println("The initial value of \"x\" that was declared in the outer scope was " + x +"\n");

        //The curly brace here opens a new scope

        if (x == 10) {

            System.out.println("Then the inner scope was opened,");

            x = 20; //calling and changing variable x is possible because
                    //it is allowed to use variables from the outer scope in the inner scope. No error is expected.

            System.out.println("where the initial value of \"x\" was increased to " + x + "\n");

            int y = 30;

            int z = x + y;

            //int x = 100; //When declaring a variable in  the inner scope that has the same name as the variable in the outer scope,
                         //then the error will be created because it is forbidden to use the same names.
                         //Uncomment the int x now and re-run the code.


            System.out.println("X + y: " + x + " + " + y + " = " + z + "\n");

        } //This curly brace has closed the scope

       //y = 200;  //calling variable 'y' here causes an error because it is coming from the inner scope.
                  //This operation is not allowed, therefore there is an error.
                  // More in "Java: A Beginner's Guide, chapter 2: Introducing Data Types and Operators chapter
                  //(Page 45: Paragraph: The Scope and Lifetime of Variables).
                  //Please uncomment out the y variable within this scope and re-run the code.

        System.out.println("The \"x\" increased by the inner scope is printed in the outer scope."); //+ y); <--Uncomment to see the full example

    }

}


