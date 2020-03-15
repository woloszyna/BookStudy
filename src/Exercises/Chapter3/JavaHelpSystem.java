package Exercises.Chapter3;

import java.io.IOException;

class JavaHelpSystem {

    public static void main(String args[]) throws IOException {

        char choice, ignore;

        do {

            System.out.println("Help on;");
            System.out.println("STATEMENT CONTROL");
            System.out.println("  1. If");
            System.out.println("  2. Switch");
            System.out.println("  3. For");
            System.out.println("  4. While");
            System.out.println("  5. Do-while");

            System.out.println("CLASSES and METHODS");
            System.out.println("  6. Object");
            System.out.println("  7. Method()");
            System.out.println("");
            System.out.print("Choose one: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '7');

        switch (choice) {

            case '1':
                System.out.println("The If:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch (expression) {");
                System.out.println("case constant:");  //where CONSTANT is the option
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("    //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The For:\n");
                System.out.print("for (init; condition; iteration)");
                System.out.println("  statement;");
                break;
            case '4':
                System.out.println("The While:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("  statements;");  //where CONSTANT is the option
                System.out.println("} while condition");
                break;
            case '6':
                System.out.println("Object of a Class:\n");
                System.out.println("Class NameOfAnObject = new Class()");
                System.out.println("NameOfAnObject.OriginalClassVariable = <value>");
                System.out.println("MethodName  {");
                System.out.println("");
                System.out.println("(...)");
                System.out.println("");
                System.out.println("     }");
                break;
            case '7':
                System.out.println("Method():\n");
                System.out.println("OriginalClassName NameOfAnObject = new OriginalClassName();\n");
                System.out.println("NameOfAnObject.OriginalClassVariable1 = <value 1>");
                System.out.println("NameOfAnObject.OriginalClassVariable2 = <value 2>\n");
                System.out.println("MethodName(){");
                System.out.println("");
                System.out.println("body of a method");
                System.out.println("");
                System.out.println("     }");
                break;

            /*

            There is no need to use default case.

             default:
                System.out.println("Choose either option 1 or option 4");

            The following:

             while (choice < '1' | choice > '5');

            ensures, that no other chars than specified in menu will be used.

             */

        }

    }

}
