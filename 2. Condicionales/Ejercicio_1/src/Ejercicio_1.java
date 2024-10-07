// Ejercicio 1: Sistema de Recomendación de Películas
// Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama, ciencia ficción) y
// luego recomiende una película basada en su elección.

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su género de película favorito: ");
            String genero = scanner.nextLine();

            String Genero = genero.toLowerCase();

            switch (Genero){
                case "acción" , "accion" ->
                    System.out.print("""
                    Acción:
                    
                    1) Mad Max: Fury Road
                    2) John Wick
                    3) Die Hard
                    """);
                case "comedia" ->
                    System.out.print("""
                    Comedia:
                    
                    1) Superbad
                    2) The Hangover
                    3) Dumb and Dumber
                    """);
                case "drama" ->
                    System.out.print("""
                    Drama:
                    
                    1) The Shawshank Redemption
                    2) Forrest Gump
                    3) The Pursuit of Happyness
                    """);
                case "ciencia ficción" , "ciencia ficcion" ->
                    System.out.print("""
                    Ciencia Ficción:
                    
                    1) Inception
                    2) The Matrix
                    3) Blade Runner 2049
                    """);
                default ->
                    System.out.print("Género no encontrado!");
            }
        } catch (Exception e) {
            System.out.println("Dato mal ingresado!");
        }
    }
}