package SelfTests.ChapterTwo;

class ChapterTwo10 {

    public static void main(String args[]) {

        //Find Prime numbers between 1 and 100

        int i, j;
        boolean isprime;

        //get all numbers from 2 to 100
        for (i = 2; i < 1000000; i++) {
            isprime = true;

            //see if number is evenly divisible
            for (j = 2; j <= i / j; j++) {

                //if it is, then it is not prime
                if ((i % j) == 0) isprime = false;

                if (isprime) System.out.println(i + " is  prime.");

            }


        }
    }
}

