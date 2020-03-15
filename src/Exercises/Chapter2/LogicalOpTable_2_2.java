package Exercises.Chapter2;

class LogicalOpTable_2_2 {

    public static void main(String args[]){

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

    }

}
