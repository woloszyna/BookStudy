package Lessons._01_ChapterOne;

class TheForLoopExample {

    public static void main (String args[]){

        int count;

        //for (count = 0; count < 10000001; count = count +1 ) //less professional
        for (count = 0; count < 10000001; count++ ) //more professional
        System.out.println("This is count: " + count);
        System.out.println();
        System.out.println("Now we are square.");
    }
}
