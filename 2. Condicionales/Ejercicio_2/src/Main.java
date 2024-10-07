// Ejercicio 2: Calculadora de Descuentos
// Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
// (estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y 15% para jubilados.
// Imprime el precio final después del descuento.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float Rta;

        try {

            System.out.print("Precio del Producto: ");
            float precio = scanner.nextFloat();
            scanner.nextLine();

            while(precio <= 0){
                System.out.print("Ingrese un precio real de Producto: ");
                precio = scanner.nextFloat();
                scanner.nextLine();
            }

            System.out.print("Catengoría del cliente: ");
            String categoria = scanner.nextLine();

            switch (categoria){
                case "estudiante" -> {
                    Rta = precio - ((precio * 10) / 100);
                    System.out.println("Precio final con el descuento aplicado: " + Rta);
                }
                case "adulto" -> {
                    Rta = precio - ((precio * 5)/100);
                    System.out.println("Precio final con el descuento aplicado: " + Rta);
                }
                case "jubilado" -> {
                    Rta = precio - ((precio * 15)/100);
                    System.out.println("Precio final con el descuento aplicado: " + Rta);
                }
                default ->
                    System.out.println("Categoría no encontrada!");
            }

        } catch (Exception e) {
            System.out.println("Dato mal ingresado!");
        }
    }
}