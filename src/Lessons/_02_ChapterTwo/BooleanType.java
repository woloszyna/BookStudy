package Lessons._02_ChapterTwo;

class BooleanType {

    public static void main(String args[]){

        boolean b = true;
        System.out.println("This is " + b + " because the b in the code line earlier was set to true");


        b = false;
        System.out.println("This is " + b + " because this time, the b in the code line earlier was set to false");


        b = true;

        if(b) System.out.println("Because the if() method was used this is executed only when for is true since no additional parameter " +
                "was given in it.");


        System.out.print("10 is smaller that 9 is " + (10<9));
        System.out.print(", however, ");
        System.out.println("10 is greater that 9 is " + (10>9));
    }

}
