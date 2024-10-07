// Ejercicio 3: Sistema de Recomendación de Libros
// Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance, ciencia ficción) y
// luego recomiende un libro basado en su elección.

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Ingrese su género de libro favorito (fantasía, misterio, romance, ciencia ficción):");
            String genero = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas para simplificar comparaciones

            if (!genero.equals("fantasía") && !genero.equals("misterio") &&
                    !genero.equals("romance") && !genero.equals("ciencia ficción")) {
                throw new IllegalArgumentException("Género no válido, elija entre fantasía, misterio, romance, ciencia ficción.");
            }

            switch (genero) {
                case "fantasía":
                    System.out.println("Te recomiendo leer 'El Señor de los Anillos' de J.R.R. Tolkien.");
                    break;
                case "misterio":
                    System.out.println("Te recomiendo leer 'Sherlock Holmes: Estudio en Escarlata' de Arthur Conan Doyle.");
                    break;
                case "romance":
                    System.out.println("Te recomiendo leer 'Orgullo y Prejuicio' de Jane Austen.");
                    break;
                case "ciencia ficción":
                    System.out.println("Te recomiendo leer 'Dune' de Frank Herbert.");
                    break;
                default:
                    throw new IllegalArgumentException("Error inesperado.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
