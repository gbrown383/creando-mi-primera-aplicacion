import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100); // Número entre 0 y 99
        Scanner scanner = new Scanner(System.in);

        int intentosMaximos = 5; // Máximo de intentos permitidos
        int intentosRealizados = 0; // Contador de intentos realizados

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("He generado un número entre 0 y 100. Tienes 5 intentos para adivinarlo.");

        // Bucle para controlar los intentos
        while (intentosRealizados < intentosMaximos) {
            System.out.print("Intento #" + (intentosRealizados + 1) + ": Ingresa tu número: ");
            int numeroIngresado = scanner.nextInt(); // Leer el número ingresado por el usuario
            intentosRealizados++; // Incrementar el contador de intentos

            if (numeroIngresado == numeroAleatorio) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentosRealizados + " intentos.");
                break; // Salir del ciclo si el usuario acierta
            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número ingresado es MENOR que el número generado.");
            } else {
                System.out.println("El número ingresado es MAYOR que el número generado.");
            }

            // Verificar si todavia hay intentos
            if (intentosRealizados == intentosMaximos) {
                System.out.println("¡Lo siento! Has agotado tus 5 intentos. El número era: " + numeroAleatorio);
            }
        }

        scanner.close(); // Cerrar el objeto Scanner
    }
}