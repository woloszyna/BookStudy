package Lessons._02_ChapterTwo;

class TypeConversionInAssignments {

    public static void main(String args[]){

        System.out.println("Only compatible types will convert from one to another.\n" +
                "Let's run an exercise when we will convert int type into a float type\n" +
                "Look at the code under this comment\n\n");

        System.out.println("The code: \n\n" +
                "int i;\n" +
                "float f;\n" +
                "\n" +
                "i = 100;\n\n");

        int i;
        float f;

        i = 100;

                System.out.println("Ath this point the \'i\' is of a int Type, so when the statement is ran\n" +
                        "it will not display any decimal points as they do not exist in the int type\n" +
                        "The result of the statement is: " + i +"\n\n" +
                        "Let's convert the \'i\' to \'f\' of a float type\n\n" +
                        "f = i;\n");



        f = i;


        System.out.println("When java is executed, the \'f\' is now the \'i\' converted to a float type and should display a decimal zero: " + f + " as the float type does.\n\n" +
                "Remember! In the \'f = i;\' statement, the left value ALWAYS takes from the right value, therefore, the \'i\' has become and \'f\', not the other way around.");


    }

}
