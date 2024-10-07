// Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego genere una
// lista de reproducción con canciones sugeridas para ese estado de ánimo.

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        String animo;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Ingrese su estado de ánimo:");
            animo = scanner.nextLine();
        }while(!animo.equals("feliz") && !animo.equals("triste") && !animo.equals("enérgico")
                && !animo.equals("relajado") && !animo.equals("energico"));

        switch (animo){
            case "feliz" ->
                System.out.print("Canciones felices");
            case "triste" ->
                System.out.print("Canciones trsites");
            case "enérgico", "energico" ->
                System.out.print("Canciones enérgicas");
            case "relajado" ->
                System.out.print("Canciones tranquilas");
        }
    }
}