public class TemperatureConverter {
    public static void main(String[] args) {
        Converter.convertToKelvin(25);
        Converter.convertToCelsius(345);
    }
}

class Converter {

    public static void convertToKelvin(int celsiusDegree) {
        double kelvinDegree;
        kelvinDegree = celsiusDegree + 273;
        System.out.printf("%d Celsius degree is %.2f Kelvin", celsiusDegree, kelvinDegree);
    }

    public static void convertToCelsius(int kelvinDegree) {
        double celsiusDegree;
        celsiusDegree = kelvinDegree - 273;
        System.out.printf("\n%d Kelvin degree is %.2f  Celsius", kelvinDegree, celsiusDegree);
    }
}