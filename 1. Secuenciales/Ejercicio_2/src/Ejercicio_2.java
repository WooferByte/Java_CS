// Ejercicio 2: Calculadora de Calorías Quemadas
// Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en minutos y el tipo de
// ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las calorías quemadas. Utiliza diferentes
// tasas de calorías quemadas por minuto para cada tipo de ejercicio.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.##");

        try {
            System.out.print("Ingrese su peso en Kg:");
            float Peso = scanner.nextFloat();

            while(Peso <= 0){
                System.out.print("Porfavor, ingrese un valor real de su peso corporal:");
                Peso = scanner.nextFloat();
            }
            scanner.nextLine(); // Consume el salto de línea tras el 'Enter' del usuario! (Desaparece del Buffer)

            System.out.print("Ingrese su actividad fisica:");
            String Actividad = scanner.nextLine();
            String actividad = Actividad.toLowerCase();

            System.out.print("Duración del ejercicio en minutos:");
            int Tiempo = scanner.nextInt();

            while(Tiempo <= 0){
                System.out.print("Porfavor, ingrese un valor real de tiempo:");
                Tiempo = scanner.nextInt();
            }

            // System.out.print(Peso + " " + Actividad + " " + Tiempo);

            switch (actividad) {
                case "natacion", "natación" -> {
                    float tiempo = (float) Tiempo;
                    float Rta = 7 * Peso * (tiempo / 60);
                    System.out.print("Tus calorías quemadas en Natación: " + decimal.format(Rta));
                }
                case "correr" -> {
                    float tiempo = (float) Tiempo;
                    double Rta = 9.8 * Peso * (tiempo / 60);
                    System.out.print("Tus calorías quemadas Corriendo: " + decimal.format(Rta));
                }
                case "bicicleta" -> {
                    float tiempo = (float) Tiempo;
                    float Rta = 8 * Peso * (tiempo / 60);
                    System.out.print("Tus calorías quemadas Andando en Bicicleta: " + decimal.format(Rta));
                }
                default -> System.out.print("Actividad fisica no reconocida!");
            }

        } catch (Exception e) {
            System.out.print("Valores mal ingresado!");
        }
    }
}