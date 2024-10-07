// Ejercicio 4: Calculadora de IMC con Recomendaciones
// Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego calcule su Índice de
// Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo peso, peso normal, sobrepeso, obesidad).

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su peso en kilogramos: ");
            float peso = scanner.nextFloat();

            System.out.print("Ingrese su altura en metros: ");
            float altura = scanner.nextFloat();

            if (peso <= 0 || altura <= 0) {
                throw new IllegalArgumentException("El peso y la altura deben ser valores positivos.");
            }

            float imc = peso / (altura * altura);
            System.out.printf("Su IMC es: %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Recomendación: Bajo peso.");
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("Recomendación: Peso normal.");
            } else if (imc >= 25 && imc < 29.9) {
                System.out.println("Recomendación: Sobrepeso.");
            } else {
                System.out.println("Recomendación: Obesidad.");
            }

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
