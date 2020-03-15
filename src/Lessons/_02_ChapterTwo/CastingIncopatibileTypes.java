package Lessons._02_ChapterTwo;

class CastingIncopatibileTypes {

    public static void main(String args[]){

                double D1;
                double D2;
                int I1;

                System.out.println("Here, three variables were declared, two of the \'double\' type and one of the \'int\'type.\n\n" +
                        "double D1;\n" +
                        "double D2;\n" +
                        "int I1;\n\n");

                D1 = 6.4;
                D2 = 2.6;


                System.out.println("Then variables of type of double were then assigned to values\n\n" +
                        "D1 = 6.4;\n" +
                        "D2 = 2.6;\n\n");


                I1 = (int) (D1 / D2);


                System.out.print("The next operation calculates D1 / D2 AND casts the result of the operation to the 'I' that has the type of int.\n\n" +
                        "If the \'I1\' was of type double as well, the result of that exercise would be 2.4615(...),\n" +
                        "however, when the following statement is executed: \n\n" +
                        "I1 = (int) (D1 / D2);\n\n" +
                        "the I1 is called, the result of (D1 / D2) is casted to type of double\n" +
                        "by using the (target-type) of \"(int)\".\n" +
                        "So, the result of the following operation:\n\n" +
                        "I1 = (int) (D1 / D2);\n\n" +
                        "is: ");


                System.out.println(I1 +"\n\n" +
                        "The decimals are not displayed at all, therefore, they are lost");


    }
}
