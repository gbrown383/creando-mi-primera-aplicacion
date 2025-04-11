public class Main {
    public static void main(String[] args) {
        System.out.println("Conversor de temperatura de grados Celsius a Fahrenheit");

        double temperaturaCelsius = 31.6;
        double temperaturafahrenheit =(temperaturaCelsius * 1.8)+32;
        int resultado = (int) temperaturafahrenheit;
        System.out.println(temperaturaCelsius + " Grados Celsius  = " + resultado +" Grados Fahrenheit");
    }
}