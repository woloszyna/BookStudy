package Lessons._04_ChapterFour.Parameters;

public class multipleParam_Factor {

    boolean isFactor(int a, int b) { //<--Two params created, both int for numeric values

        if ((b % a) == 0) return true;
        else return false;
    }

}
