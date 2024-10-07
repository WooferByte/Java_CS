// Ejercicio 6: Evaluador de Hábitos Saludables
// Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace ejercicio y cuántas
// comidas saludables consume al día. Luego, imprime una evaluación de sus hábitos saludables basada en estos datos.

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horasSueno , horasEjercicio , comidasSaludables;

        while (true) {
            System.out.print("¿Cuántas horas al día duermes?: ");
            horasSueno = scanner.nextInt();
            if (horasSueno >= 0) {
                break;
            }
            System.out.println("Las horas de sueño no pueden ser negativas.");
        }

        while (true) {
            System.out.print("¿Cuántas horas al día haces ejercicio?: ");
            horasEjercicio = scanner.nextInt();
            if (horasEjercicio >= 0) {
                break;
            }
            System.out.println("Las horas de ejercicio no pueden ser negativas.");
        }

        while (true) {
            System.out.print("¿Cuántas comidas saludables consumes al día?: ");
            comidasSaludables = scanner.nextInt();
            if (comidasSaludables >= 0) {
                break;
            }
            System.out.println("El número de comidas saludables no puede ser negativo.");
        }

        if (horasSueno >= 7 && horasEjercicio >= 1 && comidasSaludables >= 3) {
            System.out.println("¡Tienes hábitos muy saludables!");
        } else if (horasSueno == 6 || horasEjercicio >= 1 || comidasSaludables >= 2) {
            System.out.println("Tus hábitos son buenos, pero podrías mejorarlos.");
        } else {
            System.out.println("Deberías mejorar tus hábitos para llevar una vida más saludable.");
        }
    }
}
