package fh.campus02;

public class TemperatureConversion {
    public static void main(String[] args) {
        double temperatureInCelsius =36.6;
        double temperaturInFahrenheit= 98;
        System.out.println(celciusToFahrenheit(temperatureInCelsius) );
        System.out.println( fahrenheitToCelsius(temperaturInFahrenheit));

    }
    public static double celciusToFahrenheit (double temperatureInCelsius)
    { return (temperatureInCelsius*9/5)+32;}
    public static double fahrenheitToCelsius ( double temperaturInFahrenheit)
    {return (temperaturInFahrenheit-32)*5/9;}
}
