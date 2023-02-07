public class Daily_2469 {
     public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;

        return new double[] {kelvin, fahrenheit};
     }
}
