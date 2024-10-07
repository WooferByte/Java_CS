// Ejercicio 5: Juego de Piedra, Papel o Tijera
// Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa elige una opción
// al azar y determina quién gana. Imprime el resultado del juego.

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.print("Elige piedra, papel o tijera: ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        String eleccionComputadora = opciones[random.nextInt(3)];

        System.out.println("La computadora eligió: " + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
}
