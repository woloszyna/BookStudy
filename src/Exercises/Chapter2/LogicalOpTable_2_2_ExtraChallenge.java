package Exercises.Chapter2;

public class LogicalOpTable_2_2_ExtraChallenge {

    public static void main(String args[]){

        System.out.println("The previous exercise listed the Logical Operators Table in the following format:\n\n");
        System.out.println("System.out.println(\"P\\t\\tQ\\t\\tAND\\t\\tOR\\t\\tXOR\\t\\tNOT\");\n" +
                "\n" +
                "        p = true; q = true;\n" +
                "\n" +
                "        //System.out.println(\"p = true; q = true;\");\n" +
                "        System.out.print(p + \"\\t\" + q  + \"\\t\");\n" +
                "        System.out.print((p&q) + \"\\t\" + (p|q)  + \"\\t\");\n" +
                "        System.out.println((p^q) + \"\\t\" + (!p)+ \"| p = true; q = true;\");\n" +
                "\n" +
                "        p = true; q = false;\n" +
                "\n" +
                "        //System.out.println(\"p = true; q = false;\");\n" +
                "        System.out.print(p + \"\\t\" + q  + \"\\t\");\n" +
                "        System.out.print((p&q) + \"\\t\" + (p|q)  + \"\\t\");\n" +
                "        System.out.println((p^q) + \"\\t\" + (!p) + \"| p = true; q = true;\");\n" +
                "\n" +
                "        p = false; q = true;\n" +
                "\n" +
                "        //System.out.println(\"p = false; q = true;\");\n" +
                "        System.out.print(p + \"\\t\" + q  + \"\\t\");\n" +
                "        System.out.print((p&q) + \"\\t\" + (p|q)  + \"\\t\");\n" +
                "        System.out.println((p^q) + \"\\t\" + (!p) + \" | p = false; q = true;\");\n" +
                "\n" +
                "        p = false; q = false;\n" +
                "\n" +
                "        //System.out.println(\"p = false; q = false;\");\n" +
                "        System.out.print(p + \"\\t\" + q  + \"\\t\");\n" +
                "        System.out.print((p&q) + \"\\t\" + (p|q)  + \"\\t\");\n" +
                "        System.out.println((p^q) + \"\\t\" + (!p) + \" | p = false; q = false;\");\n\n" +
                "" +
                "The outcome was the following table populated:");



        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;

        //System.out.println("p = true; q = true;");
        System.out.print(p + "\t" + q  + "\t");
        System.out.print((p&q) + "\t" + (p|q)  + "\t");
        System.out.println((p^q) + "\t" + (!p)+ "| p = true; q = true;");

        p = true; q = false;

        //System.out.println("p = true; q = false;");
        System.out.print(p + "\t" + q  + "\t");
        System.out.print((p&q) + "\t" + (p|q)  + "\t");
        System.out.println((p^q) + "\t" + (!p) + "| p = true; q = true;");

        p = false; q = true;

        //System.out.println("p = false; q = true;");
        System.out.print(p + "\t" + q  + "\t");
        System.out.print((p&q) + "\t" + (p|q)  + "\t");
        System.out.println((p^q) + "\t" + (!p) + " | p = false; q = true;");

        p = false; q = false;

        //System.out.println("p = false; q = false;");
        System.out.print(p + "\t" + q  + "\t");
        System.out.print((p&q) + "\t" + (p|q)  + "\t");
        System.out.println((p^q) + "\t" + (!p) + " | p = false; q = false;");




        System.out.println("\n\nThis time, the task is to express true as '1' and the false as '0'\n\n" +
                "In order to do that the if statements are required and it can be achieved by doing the following: \n\n" +
                "boolean p1, q1;\n" +
                        "\n" +
                        "        System.out.println(\"P\\tQ\\tAND\\tOR\\tXOR\\tNOT\");\n" +
                        "\n" +
                        "        p1 = true; q1 = true;\n" +
                        "\n" +
                        "\n" +
                        "        //System.out.println(\"p = true; q = true;\");\n" +
                        "\n" +
                        "        if(p1) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if(q1) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if((p1&q1)) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if((p1|q1)) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if(!(p1^q1)) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if(!(!p1)) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        System.out.println(\"| p = true; q = true;\");\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        p = true; q = false;\n" +
                        "\n" +
                        "        if(p1) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if(!(!(q1))) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if(!(!(p1&q1))) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if((p1|q1)) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if(!(p1^q1)) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if(!(!p1)) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        System.out.println(\"| p = true; q = false;\");\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "        p1 = false; q1 = true;\n" +
                        "\n" +
                        "        if(!(p1)) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if(q1) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if(!(p1&q1)) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if((p1|q1)) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if(!(!(p1^q1))) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        if(!p1) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        System.out.println(\"| p = false; q = true;\");\n" +
                        "\n" +
                        "\n" +
                        "        p1 = false; q1 = false;\n" +
                        "\n" +
                        "        if(!(p1)) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if(!(q1)) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if((!(p1&q1))) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if(!((p1|q1))) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if(!((p1^q1))) System.out.print(\"0\"); System.out.print(\"\\t\");\n" +
                        "        if(!p1) System.out.print(\"1\"); System.out.print(\"\\t\");\n" +
                        "        System.out.println(\"| p = false; q = false;\");\n"
                );



        boolean p1, q1;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p1 = true; q1 = true;


        //System.out.println("p = true; q = true;");

        if(p1) System.out.print("1"); System.out.print("\t");
        if(q1) System.out.print("1"); System.out.print("\t");
        if((p1&q1)) System.out.print("1"); System.out.print("\t");
        if((p1|q1)) System.out.print("1"); System.out.print("\t");
        if(!(p1^q1)) System.out.print("0"); System.out.print("\t");
        if(!(!p1)) System.out.print("0"); System.out.print("\t");
        System.out.println("| p = true; q = true;");



        p = true; q = false;

        if(p1) System.out.print("1"); System.out.print("\t");
        if(!(!(q1))) System.out.print("0"); System.out.print("\t");
        if(!(!(p1&q1))) System.out.print("0"); System.out.print("\t");
        if((p1|q1)) System.out.print("1"); System.out.print("\t");
        if(!(p1^q1)) System.out.print("1"); System.out.print("\t");
        if(!(!p1)) System.out.print("0"); System.out.print("\t");
        System.out.println("| p = true; q = false;");



        p1 = false; q1 = true;

        if(!(p1)) System.out.print("0"); System.out.print("\t");
        if(q1) System.out.print("1"); System.out.print("\t");
        if(!(p1&q1)) System.out.print("0"); System.out.print("\t");
        if((p1|q1)) System.out.print("1"); System.out.print("\t");
        if(!(!(p1^q1))) System.out.print("1"); System.out.print("\t");
        if(!p1) System.out.print("1"); System.out.print("\t");
        System.out.println("| p = false; q = true;");


        p1 = false; q1 = false;

        if(!(p1)) System.out.print("0"); System.out.print("\t");
        if(!(q1)) System.out.print("0"); System.out.print("\t");
        if((!(p1&q1))) System.out.print("0"); System.out.print("\t");
        if(!((p1|q1))) System.out.print("0"); System.out.print("\t");
        if(!((p1^q1))) System.out.print("0"); System.out.print("\t");
        if(!p1) System.out.print("1"); System.out.print("\t");
        System.out.println("| p = false; q = false;");


           }


}
