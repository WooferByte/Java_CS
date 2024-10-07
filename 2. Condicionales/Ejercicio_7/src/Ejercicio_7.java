// Ejercicio 7: Sistema de Recomendación de Actividades
// Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego recomiende una
// actividad basada en su estado de ánimo.

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Recomendación: Sal a disfrutar del aire libre o comparte el momento con tus amigos.");
                break;
            case "triste":
                System.out.println("Recomendación: Mira una película reconfortante o haz algo que te relaje, como leer un libro.");
                break;
            case "enérgico":
                System.out.println("Recomendación: Aprovecha la energía para hacer ejercicio, correr o practicar algún deporte.");
                break;
            case "relajado":
                System.out.println("Recomendación: Escucha música suave, medita o da un paseo tranquilo.");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido. Intenta con 'feliz', 'triste', 'enérgico' o 'relajado'.");
                break;
        }
    }
}
