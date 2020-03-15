package Lessons._02_ChapterTwo;

class RelationalAndLogicalOperators {

    public static void main(String args[]){

        int a, b;
        boolean b1,b2;


        a = 10;
        b = 11;

        if(a < b) System.out.println("a < b");
        if (a <= b) System.out.println("a <= b");
        if (a != b) System.out.println("i != b");
        if (a == b) System.out.println ("This will not execute");
        if (a >= b) System.out.println("This will not execute");
        if (a > b) System.out.println("This will not execute");


        b1 = true;
        b2 = false;

        if (b1 & b2) System.out.println("s will not execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if (b1 | b2) System.out.println("b1 | b2 is true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 is true");

    }



}
