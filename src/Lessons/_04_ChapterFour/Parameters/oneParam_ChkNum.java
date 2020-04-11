package Lessons._04_ChapterFour.Parameters;

class oneParam_ChkNum {

    //return true if fx is even
    boolean isEven(int x) {  //<-- Calling a method true/false and passing a numeric parameter called x into it
        if((x % 2) == 0)return true; //<-- if the rest after dividing x by 2 will return 0.00 (so 10 % 2 = 0) then it is true
        else return false; //<-- Otherwise if the rest after dividing x by 2 will not return 0.00 (so 9 % 2 = 1) then it is false
    }
}
