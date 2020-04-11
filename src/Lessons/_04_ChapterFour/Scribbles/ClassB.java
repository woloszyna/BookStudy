package Lessons._04_ChapterFour.Scribbles;

class CompFuel {

    public static void main(String[] args){

        VehicleForReturnWithParams minivan = new VehicleForReturnWithParams();
        VehicleForReturnWithParams sportscar = new VehicleForReturnWithParams();
        double gallons;
        int dist = 1000000;

        //assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles, minivan needs " + gallons + " gallons of Fuel.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles, sportscar needs " + gallons + " gallons of Fuel.");

    }

}