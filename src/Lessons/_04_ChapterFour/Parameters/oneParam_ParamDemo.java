package Lessons._04_ChapterFour.Parameters;

public class oneParam_ParamDemo {

    public static void main(String[] params){

        oneParam_ChkNum e = new oneParam_ChkNum();

        if(e.isEven(1)) System.out.println("1 is even"); //not even
        if(e.isEven(2)) System.out.println("2 is even"); //even
        if(e.isEven(3)) System.out.println("3 is even"); //not even
        if(e.isEven(4)) System.out.println("4 is even"); //even
        if(e.isEven(5)) System.out.println("5 is even"); //not even
        if(e.isEven(6)) System.out.println("6 is even"); //even
        if(e.isEven(7)) System.out.println("7 is even"); //not even
        if(e.isEven(8)) System.out.println("8 is even"); //even
        if(e.isEven(9)) System.out.println("9 is even"); //not even
        if(e.isEven(10)) System.out.println("10 is even"); //even
    }
}
