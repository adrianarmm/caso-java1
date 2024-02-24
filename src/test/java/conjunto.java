
import java.util.Scanner;
public class conjunto {
    public static void conjunto (String[] args) {
    Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("\nBienvenido al Software Integral de la Misión Espacial");
        System.out.println("1. Cronómetro Cósmico");
        System.out.println("2. Recursos y Suministros");
        System.out.println("3. Sistema de Monitoreo");
        System.out.println("4. Planificador de Tareas");
        System.out.println("5. Navegador Estelar");
        System.out.println("6. Comunicador Interplanetario");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                CronometroCosmico.main(null);
                break;
            case 2:
                RecursosySuministros.main(null);
                break;
            case 3:
                SistemaMonitoreo.main(null);
                break;
            case 4:
                PlanificadordeTareas.main(null);
                break;
            case 5:
                NavegadorEstelar.main(null);
                break;
            case 6:
                ComunicadorInterplanetario.main(null);
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                System.exit(0);

            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");

        }
    }
}
}


