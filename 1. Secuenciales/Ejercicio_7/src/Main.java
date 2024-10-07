// Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la vida, nivel de
// estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un índice de felicidad basado en
// esos factores.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nivel de Satisfacción:");
            int Satisfaccion = scanner.nextInt();

            if(Satisfaccion < 1 || Satisfaccion > 10){
                throw new IllegalArgumentException("Nivel de Satisfacción incorrecto, debe ser del 1 al 10");
            }

            System.out.println("Nivel de Estrés:");
            int Estres = scanner.nextInt();

            if(Estres < 1 || Estres > 10){
                throw new IllegalArgumentException("Nivel de Estres incorrecto, debe ser del 1 al 10");
            }

            System.out.println("Nivel de Salud:");
            int Salud = scanner.nextInt();

            if(Salud < 1 || Salud > 10){
                throw new IllegalArgumentException("Nivel de Salud incorrecto, debe ser del 1 al 10");
            }

            float Rta = (float) (Satisfaccion - Estres + Salud)/2;
            System.out.println("Su indice de felicidad es de " + (Math.round(Rta*10)/10));

        } catch (Exception e) {
            System.out.println("Datos mal ingresados!");
        }
    }
}