// Ejercicio 1: Generador de Horóscopo
// Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego imprima su signo del
// zodiaco y un mensaje de horóscopo correspondiente.

import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio_1 {

    public static void main(String[] args) {

        LocalDate fecha;

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Introduce una fecha (DD/MM/AAAA): ");
        String fechaInput = scanner.nextLine();


        try{
            fecha = LocalDate.parse(fechaInput, formatter);
            System.out.println("Fecha ingresada correctamente: " + fecha);

            int mesIngresado = fecha.getMonthValue();
            int diaIngresado = fecha.getDayOfMonth();

            if ((mesIngresado == 3 && diaIngresado >= 21) || (mesIngresado == 4 && diaIngresado <= 19)) {
                System.out.println("Aries");
            }
            if((mesIngresado == 4 && diaIngresado >= 20) || (mesIngresado == 5 && diaIngresado <= 20)){
                System.out.println("Tauro");
            }
            if((mesIngresado == 5 && diaIngresado >= 21) || (mesIngresado == 6 && diaIngresado <= 20)){
                System.out.println("Géminis");
            }
            if((mesIngresado == 6 && diaIngresado >= 21) || (mesIngresado == 7 && diaIngresado <= 22)){
                System.out.println("Cáncer");
            }
            if((mesIngresado == 7 && diaIngresado >= 23) || (mesIngresado == 8 && diaIngresado <= 22)){
                System.out.println("Leo");
            }
            if((mesIngresado == 8 && diaIngresado >= 23) || (mesIngresado == 9 && diaIngresado <= 22)){
                System.out.println("Virgo");
            }
            if((mesIngresado == 9 && diaIngresado >= 23) || (mesIngresado == 10 && diaIngresado <= 22)){
                System.out.println("Libra");
            }
            if((mesIngresado == 10 && diaIngresado >= 23) || (mesIngresado == 11 && diaIngresado <= 21)){
                System.out.println("Escorpio");
            }

            if((mesIngresado == 11 && diaIngresado >= 22) || (mesIngresado == 12 && diaIngresado <= 21)) {
                System.out.println("Sagitario");
            }

            if((mesIngresado == 12 && diaIngresado >= 22) || (mesIngresado == 1 && diaIngresado <= 19)) {
                System.out.println("Capricornio");
            }

            if((mesIngresado == 1 && diaIngresado >= 20) || (mesIngresado == 2 && diaIngresado <= 18)) {
                System.out.println("Acuario");
            }

            if((mesIngresado == 2 && diaIngresado >= 19) || (mesIngresado == 3 && diaIngresado <= 20)){
                System.out.println("Piscis");
            }
        }catch (DateTimeParseException e){
            System.out.println("Formato de fecha invalido.");
        }
    }
}