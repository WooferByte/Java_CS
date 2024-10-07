// Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un plan de estudio
// semanal distribuyendo esas horas en diferentes materias.

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese la cantidad de horas que puede estudiar diariamente: ");
            float horas = scanner.nextFloat();
            if(horas <= 0){
                throw new IllegalArgumentException("Las horas deben ser positivas!");
            }

            float tiempo = (float) (Math.round(horas * 10) / 10.0);

            if (tiempo % 2 == 0){
                System.out.printf("""
                        Rutina de Estudio para %.0f Horas de estudio:
                        - Total de horas: %.0f horas.
                        - Bloques de estudio: 50 minutos de estudio + 10 minutos de descanso por bloque.
                        - Pausa larga: 30 minutos después de dos bloques.
                        
                        Ejemplo para 4 horas:
                        - Bloque 1 (50 minutos): Teoría o lectura de conceptos nuevos.
                        Meta: Aprender nuevas ideas, fórmulas o conceptos (como excepciones en Java o patrones de diseño).
                        Descanso (10 minutos): Levántate, camina, y descansa la mente.
                        
                        - Bloque 2 (50 minutos): Ejercicios prácticos básicos.
                        Meta: Aplicar los conceptos a problemas o ejercicios pequeños.
                        Descanso largo (30 minutos): Come algo, relájate un poco más.
                        
                        - Bloque 3 (50 minutos): Ejercicios avanzados o desarrollo de proyectos.
                        Meta: Desarrollar una solución a un problema más complejo, como un proyecto de Java o una tarea del TP.
                        Descanso (10 minutos):
                        
                        - Bloque 4 (50 minutos): Repaso y resolución de dudas.
                        Meta: Revisión de errores, dudas o material adicional sobre lo que has estudiado.
                        """, tiempo, tiempo);
            }else if (tiempo % 2 != 0){
                System.out.printf("""
                        Rutina de Estudio para %.0f Horas (Ej: 3, 5, 7 horas)
                        - Total de horas: %.0f horas.
                        - Bloques de estudio: 45 minutos de estudio + 15 minutos de descanso.
                        - Pausa larga: 30 minutos después de dos bloques.
                        
                        Ejemplo para 3 horas:
                        - Bloque 1 (45 minutos): Revisión de material estudiado previamente.
                        Meta: Repasar conceptos anteriores para fortalecer la base.
                        Descanso (15 minutos): Moverte y despejar la mente.
                        
                        - Bloque 2 (45 minutos): Aplicación de conceptos.
                        Meta: Resolver ejercicios prácticos o trabajos prácticos, enfocándote en práctica directa.
                        Descanso largo (30 minutos):
                        
                        - Bloque 3 (45 minutos): Pruebas y simulación de exámenes.
                        Meta: Realizar preguntas tipo examen o simulaciones, para poner a prueba el conocimiento adquirido.
                        Descanso final o cierre: Reflexión sobre lo que has aprendido, apuntar dudas para la próxima sesión.
                        """, tiempo, tiempo);
            }else{
                throw new IllegalArgumentException("Error inesperado!");
            }

        } catch (RuntimeException e) {
            System.out.print("Dato ingresado incorrectamente!");
        }
    }
}