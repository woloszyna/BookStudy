package Exercises.Chapter1;

class GalToLitTable_1_2 {

    public static void main(String args[]){

        double gallons, litres;
        int counter;

        counter = 0;

        for(gallons = 1; gallons <=100; gallons++) {

            litres = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + litres + " litres.");

            counter++;

            if (counter == 10) {

                System.out.println();

                counter = 0;

            }

        }

    }

}
