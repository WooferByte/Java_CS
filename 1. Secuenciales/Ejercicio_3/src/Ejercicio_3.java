// Ejercicio 3: Generador de Rutinas de Ejercicio
// Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio, avanzado) y luego
// genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y duraciones.

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        String condicion;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Porfavor, ingrese su condición física: (principiante, intermedio, avanzado)");
            condicion = scanner.nextLine();
        }while(!condicion.equals("principiante") && !condicion.equals("intermedio") && !condicion.equals("avanzado"));

        switch (condicion.toLowerCase()) {
            case "principiante" ->
                System.out.print("""
                        Lunes: Cardio
                        
                        20 minutos de caminata rápida o trote suave.
                        Martes: Fuerza
                        
                        3 series de 10 repeticiones de flexiones de brazos (puedes hacerlas de rodillas si es necesario).
                        3 series de 10 repeticiones de sentadillas.
                        3 series de 10 repeticiones de abdominales.
                        Miércoles: Descanso o Yoga
                        
                        30 minutos de estiramientos o yoga suave.
                        Jueves: Cardio
                        
                        20 minutos de bicicleta estática o natación suave.
                        Viernes: Fuerza
                        
                        3 series de 10 repeticiones de press de hombros con mancuernas.
                        3 series de 10 repeticiones de elevaciones de talones.
                        3 series de 10 repeticiones de plancha (mantén 20-30 segundos).
                        Sábado: Cardio
                        
                        30 minutos de caminata o senderismo.
                        Domingo: Descanso""");

            case "intermedio" ->
                System.out.print("""
                        Lunes: Cardio
                        
                        30 minutos de trote moderado o elíptica.
                        Martes: Fuerza
                        
                        4 series de 12 repeticiones de flexiones de brazos.
                        4 series de 12 repeticiones de sentadillas con peso (puedes usar mancuernas).
                        3 series de 15 repeticiones de abdominales con giro.
                        Miércoles: HIIT (Entrenamiento Interválico de Alta Intensidad)
                        
                        20 minutos (1 minuto de ejercicio intenso seguido de 1 minuto de descanso). Ejemplos: burpees, saltos, sprints en el lugar.
                        Jueves: Cardio
                        
                        30 minutos de natación o ciclismo a un ritmo moderado.
                        Viernes: Fuerza
                        
                        4 series de 12 repeticiones de press de banca.
                        4 series de 12 repeticiones de peso muerto con mancuernas.
                        3 series de 30 segundos en posición de plancha.
                        Sábado: Cardio
                        
                        40 minutos de caminata rápida o senderismo en terreno irregular.
                        Domingo: Descanso o yoga""");

            case "avanzado" ->
                System.out.print("""
                        Lunes: Cardio
                        
                        40 minutos de trote a un ritmo intenso.
                        Martes: Fuerza
                        
                        5 series de 10 repeticiones de flexiones de brazos (puedes probar con variaciones).
                        5 series de 10 repeticiones de sentadillas con peso (más de 20 kg).
                        4 series de 15 repeticiones de abdominales con peso.
                        Miércoles: HIIT
                        
                        25 minutos (30 segundos de ejercicio intenso seguido de 30 segundos de descanso). Ejemplos: kettlebell swings, saltos de caja, burpees.
                        Jueves: Cardio
                        
                        40 minutos de ciclismo a un ritmo alto o natación con intervalos.
                        Viernes: Fuerza
                        
                        5 series de 8 repeticiones de press de banca.
                        5 series de 8 repeticiones de peso muerto.
                        4 series de 30-45 segundos en posición de plancha con variaciones (levantando un brazo o una pierna).
                        Sábado: Cardio
                        
                        1 hora de senderismo en montaña o correr a un ritmo sostenido.
                        Domingo: Descanso activo
                        
                        Yoga, estiramientos o actividad ligera.
                        """);

            default -> System.out.print("Condición fisica no reconocida!");
        }

    }
}