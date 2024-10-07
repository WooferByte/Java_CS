// Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de combustible del vehículo
// en litros por kilómetro y el precio del combustible por litro, y luego calcule e imprima el costo total del viaje.

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese la distancia del viaje en kilómetros: ");
            float distancia = scanner.nextFloat();
            if (distancia <= 0) {
                throw new IllegalArgumentException("La distancia debe ser positiva.");
            }

            System.out.print("Ingrese el consumo del vehículo en litros por kilómetro: ");
            float consumo = scanner.nextFloat();
            if (consumo <= 0) {
                throw new IllegalArgumentException("El consumo debe ser positivo.");
            }

            System.out.print("Ingrese el precio del combustible por litro: ");
            float precio = scanner.nextFloat();
            if (precio <= 0) {
                throw new IllegalArgumentException("El precio debe ser positivo.");
            }

            float costoTotal = distancia * consumo * precio;
            System.out.println("El costo total del viaje es: " + costoTotal);

        } catch (Exception e) { // Captura cualquier tipo de excepción
            System.out.println("Error: " + e.getMessage());
        }
    }
}