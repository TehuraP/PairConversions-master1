package fh.campus02;

public class DistanceConversion {
    public static void main(String[] args) {
    double kilometers= kilometersToMiles(560);
    double miles = milesToKilometers(45);
        System.out.println(kilometers);
        System.out.println(miles);
    }
    public static double kilometersToMiles (double kilometers) {
    return kilometers * 0.621371;
    }
    public static double milesToKilometers (double miles ) {
        return miles * 1.609344;

    }
}
