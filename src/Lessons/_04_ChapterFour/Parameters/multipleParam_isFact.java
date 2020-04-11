package Lessons._04_ChapterFour.Parameters;

public class multipleParam_isFact {

    public static void main(String[] params) {

        multipleParam_Factor a = new multipleParam_Factor();

        if (a.isFactor(1, 10)) System.out.println("1 is factor");
        if (a.isFactor(2, 10)) System.out.println("2 is factor");
        if (a.isFactor(3, 10)) System.out.println("3 is factor");
        if (a.isFactor(4, 10)) System.out.println("4 is factor");
        if (a.isFactor(5, 10)) System.out.println("5 is factor");
        if (a.isFactor(6, 10)) System.out.println("6 is factor");
        if (a.isFactor(7, 10)) System.out.println("7 is factor");
        if (a.isFactor(8, 10)) System.out.println("8 is factor");
        if (a.isFactor(9, 10)) System.out.println("9 is factor");
        if (a.isFactor(10, 10)) System.out.println("10 is factor");


    }
}
