package Lessons._02_ChapterTwo;

class ShortCircuitLogicalOperators {

    public static void main(String args[]) {

        int n, d, q;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n);

        System.out.println("Change \"d\" to 0.\n");

        d = 0;


        if (d != 0 && (n % d) == 0) System.out.println(d + " is a factor of " + n + "\n");

        System.out.println("Code does not fail, it stops after the first operand fails as d is not other than 0.\n" +
                "The rest of the statement does not execute so the error will never get created.\n");

        System.out.println("Now, let's try the same without Short circuit operator &&.\n");

        n = 10;
        d = 2;

        if (d != 0 & (n % d) == 0) System.out.println(d + " is a factor of " + n);

        System.out.println("Change \"d\" to 0.\n");

        d = 0;


        System.out.println("Code is expected to fail, it does not stop after the first operand (d !=  0) fails.\n" +
                "The rest of the statement executes and will cause java exception as follows.\n");


        if (d != 0 & (n % d) == 0) {
            System.out.println(d + " is a factor of " + n + "\n");
        }

    }

}
