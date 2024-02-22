import java.util.Arrays;

public class PlanificadordeTareas {
    public static void main(String[] args) {
        // Ejemplo de miembros de la tripulación y sus tareas asignadas
        String[] miembros = {"Alice", "Bob", "Charlie"};
        int[][] tareasAsignadas = {
                {2, 3, 2}, // Tareas asignadas a Alice
                {1, 4, 3}, // Tareas asignadas a Bob
                {3, 3, 1}  // Tareas asignadas a Charlie
        };
        visualizarTablasDeTareas(miembros, tareasAsignadas);

        int[] horasDisponibles = {5, 5, 5}; // Horas disponibles por miembro
        calcularCargaTrabajoOptima(miembros, tareasAsignadas, horasDisponibles);
    }
    private static void visualizarTablasDeTareas(String[] miembros, int[][] tareasAsignadas) {
        System.out.println("Distribución de Tareas:");
        for (int i = 0; i < miembros.length; i++) {
            System.out.println(miembros[i] + "'s Tareas:");
            for (int j = 0; j < tareasAsignadas[i].length; j++) {
                System.out.println("Tarea " + (j + 1) + ": " + tareasAsignadas[i][j]);
            }
        }
    }

    private static void calcularCargaTrabajoOptima(String[] miembros, int[][] tareasAsignadas, int[] horasDisponibles) {
        System.out.println("\nCarga de Trabajo Óptima:");
        for (int i = 0; i < miembros.length; i++) {
            int cargaTrabajo = productoEscalar(tareasAsignadas[i], horasDisponibles);
            System.out.println(miembros[i] + ": " + cargaTrabajo + " unidades de trabajo.");
        }
    }