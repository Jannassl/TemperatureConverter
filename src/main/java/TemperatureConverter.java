public class TemperatureConverter {

    /**
     * Converts Fahrenheit to Celsius.
     *
     * @param fahrenheit The temperature in Fahrenheit.
     * @return The temperature in Celsius.
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Checks if the given Celsius temperature is extreme.
     *
     * @param celsius The temperature in Celsius.
     * @return True if the temperature is below -40 or above 50, otherwise false.
     */
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static float kelvinToCel(double kel){
        return (float) (kel - 273.15);
    }

    public static double kelvinToFah(double kelvin) {
        return (kelvin - 273.15) * 9.0 / 5.0 + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("32°F to Celsius: " + converter.fahrenheitToCelsius(32));
        System.out.println("0°C to Fahrenheit: " + converter.celsiusToFahrenheit(0));
        System.out.println("300K to Celsius: " + kelvinToCel(300));
        System.out.println("300K to Fahrenheit: " + kelvinToFah(300));
    }
}