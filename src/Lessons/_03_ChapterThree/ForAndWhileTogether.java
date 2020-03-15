package Lessons._03_ChapterThree;

class ForAndWhileTogether {

    public static void main(String args[]) {

        int e;
        int result;


        for (int i = 0; i <= 10; i++) {

            result = 1; //initial result (it will change with the subsequent while loop operation)
            e = i;
            /*
            e = 0
            e = 1
            e = 2
            e = 3
            e = 4
            e = 5
            e = 6
            e = 7
            e = 8
            e = 9
            e = 10
             */

            while (e > 0) {

                result *= 2;

                /*
                while e, then(new)result = (old)result * 2;
                while e = 0, statement does not run (e is not greater than 0)
                while e = 1, result(new) = result(1) * 2(this value comes from the new, increased e) = 2(new result)
                while e = 2, result(new) = result(2) * 2 = 4
                while e = 3, result(new) = result(4) * 2 = 8
                while e = 4, result(new) = result(8) * 2 = 16
                while e = 5, result(new) = result(16) * 2 = 32
                while e = 6, result(new) = result(32) * 2 = 64
                while e = 7, result(new) = result(64) * 2 = 128
                while e = 8, result(new) = result(128) * 2 = 256
                while e = 9, result(new) = result(256) * 2 = 512
                while e = 10, result(new) = result(512) * 2 = 1024
                 */

                e--;

            }

            System.out.println("2 to the " + i + " power is " + result);

        }

    }

}
