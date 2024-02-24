import java.util.ArrayList;
import java.util.List;

public class conjunto {

    //ejercicio 1
    public class CronometroCosmico {

        // Duraciones en la Tierra
        private static final long SEGUNDOS_EN_MINUTO = 60;
        private static final long MINUTOS_EN_HORA = 60;
        private static final long HORAS_EN_DIA = 24;
        private static final long DIAS_EN_AÑO = 365;

        // Duración de un día y un año en el nuevo planeta (ejemplo: Marte)
        private static final double HORAS_POR_DIA_PLANETA = 24.65; // Un día en Marte es aproximadamente 24.65 horas terrestres
        private static final double DIAS_POR_AÑO_PLANETA = 687; // Un año en Marte es aproximadamente 687 días terrestres

        public static void main(String[] args) {
            // Calcular y mostrar tiempo en la Tierra
            long segundos = SEGUNDOS_EN_MINUTO * MINUTOS_EN_HORA * HORAS_EN_DIA * DIAS_EN_AÑO; // Segundos en un año
            System.out.println("Un año en la Tierra tiene " + segundos + " segundos.");

            // Convertir tiempo terrestre a tiempo del nuevo planeta
            double diasPlaneta = DIAS_EN_AÑO;
            double añosPlaneta = diasPlaneta / DIAS_POR_AÑO_PLANETA;
            System.out.println("Un año en la Tierra equivale a " + añosPlaneta + " años en el nuevo planeta.");

            // Visualizar mayores valores representables para diferentes tipos de datos
            visualizarLimitesDatos();
        }

        private static void visualizarLimitesDatos() {
            System.out.println("Mayor valor para byte: " + Byte.MAX_VALUE);
            System.out.println("Mayor valor para short: " + Short.MAX_VALUE);
            System.out.println("Mayor valor para int: " + Integer.MAX_VALUE);
            System.out.println("Mayor valor para long: " + Long.MAX_VALUE);
            System.out.println("Mayor valor para float: " + Float.MAX_VALUE);
            System.out.println("Mayor valor para double: " + Double.MAX_VALUE);
        }
    }

    //ejercicio 2
    public class RecursosySuministros {
        // Recursos y suministros para una expedición espacial
        private static final double CONSUMO_AGUA_DIA = 1.5; // 1.5 litros
        private static final double CONSUMO_COMIDA_DIA = 0.5; // 0.5 kg
        private static final double CONSUMO_OXIGENO_DIA = 0.84; // 0.84 m^3 de oxígeno

        private static final double UMBRAL_SEGURO = 50; // Porcentaje mínimo seguro de recursos

        public static void main(String[] args) {
            int dias = 5; // Ejemplo de múltiplo de 5 días
            int personas = 4;
            double[] consumoTotal = calcularConsumo(dias, personas);

            System.out.println("Consumo total para " + personas + " personas en " + dias + " días:");
            System.out.println("Agua: " + consumoTotal[0] + " litros");
            System.out.println("Comida: " + consumoTotal[1] + " kg");
            System.out.println("Oxígeno: " + consumoTotal[2] + " m^3");

            verificarAlerta(consumoTotal);

            double[] estadisticas = calcularEstadisticas(consumoTotal, dias, personas);
            System.out.println("Estadísticas de consumo diario por persona:");
            System.out.println("Media de consumo diario: Agua = " + estadisticas[0] + " litros, Comida = " + estadisticas[1] + " kg, Oxígeno = " + estadisticas[2] + " m^3");
        }

        private static double[] calcularConsumo(int dias, int personas) {
            double agua = CONSUMO_AGUA_DIA * dias * personas;
            double comida = CONSUMO_COMIDA_DIA * dias * personas;
            double oxigeno = CONSUMO_OXIGENO_DIA * dias * personas;
            return new double[]{agua, comida, oxigeno};
        }

        private static void verificarAlerta(double[] consumo) {
            double capacidadAgua = 500; // 500 litros
            double capacidadComida = 200; // 200 kg
            double capacidadOxigeno = 150; // 150 m^3

            double porcentajeAgua = (consumo[0] / capacidadAgua) * 100;
            double porcentajeComida = (consumo[1] / capacidadComida) * 100;
            double porcentajeOxigeno = (consumo[2] / capacidadOxigeno) * 100;

            if (porcentajeAgua < UMBRAL_SEGURO || porcentajeComida < UMBRAL_SEGURO || porcentajeOxigeno < UMBRAL_SEGURO) {
                System.out.println("Alerta: Los niveles de recursos están por debajo del umbral seguro.");
            } else {
                System.out.println("Los niveles de recursos son seguros.");
            }
        }

        private static double[] calcularEstadisticas(double[] consumo, int dias, int personas) {
            // Corrección: Asegurar que el cálculo se hace correctamente
            double mediaAgua = consumo[0] / (dias * personas);
            double mediaComida = consumo[1] / (dias * personas);
            double mediaOxigeno = consumo[2] / (dias * personas);
            // Retornar los resultados en un nuevo array
            return new double[]{mediaAgua, mediaComida, mediaOxigeno};
        }
    }

    //ejercicio 3

    public class SistemaMonitoreo {
        public static void main(String[] args) {

            monitorearRadiacion(5.2); // Valor seguro
            monitorearRadiacion(15.6); // Valor extremo

            monitorearTemperatura(22); // Valor seguro
            monitorearTemperatura(-5); // Valor extremo

            monitorearPresion(101.325); // Valor seguro
            monitorearPresion(50.5); // Valor extremo

            listarPrimerosNPrimos(5); // Listar los primeros 5 números primos

            System.out.println("Factores primos de 60: " + descomponerEnFactoresPrimos(60));
        }
        private static void monitorearRadiacion(double nivelRadiacion) {
            if (nivelRadiacion > 10) { // Supongamos que 10 es el máximo seguro
                System.out.println("Alerta: Nivel de radiación crítico. Sugerencia: Incrementar el aislamiento.");
            } else {
                System.out.println("Nivel de radiación seguro.");
            }
        }

        private static void monitorearTemperatura(double temperatura) {
            if (temperatura < 0 || temperatura > 30) { // Rango seguro entre 0 y 30 grados Celsius
                System.out.println("Alerta: Temperatura fuera de rango seguro. Sugerencia: Ajustar sistemas de soporte vital.");
            } else {
                System.out.println("Temperatura dentro de rango seguro.");
            }
        }

        private static void monitorearPresion(double presion) {
            if (presion < 90 || presion > 110) { // Rango seguro en kPa
                System.out.println("Alerta: Presión fuera de rango seguro. Sugerencia: Verificar sellado de la estación.");
            } else {
                System.out.println("Presión dentro de rango seguro.");
            }
        }

        private static void listarPrimerosNPrimos(int n) {
            List<Integer> primos = new ArrayList<>();
            int numero = 2;
            while (primos.size() < n) {
                if (esPrimo(numero)) {
                    primos.add(numero);
                    System.out.println(numero + " es un número primo.");
                }
                numero++;
            }
        }

        private static boolean esPrimo(int numero) {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
        private static List<Integer> descomponerEnFactoresPrimos(int numero) {
            List<Integer> factores = new ArrayList<>();
            for (int i = 2; i <= numero; i++) {
                while (numero % i == 0) {
                    factores.add(i);
                    numero /= i;
                }
            }
            return factores;
        }
    }

    //ejercicio 4


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
        private static int productoEscalar(int[] tareas, int[] horas) {
            int producto = 0;
            for (int i = 0; i < tareas.length; i++) {
                producto += tareas[i] * horas[i];
            }
            return producto;
        }
    }

    //ejercicio 5
    public class NavegadorEstelar {
        public static void main(String[] args) {
            // Representación simplificada del terreno como una matriz
            int[][] terreno = {
                    {1, 1, 0, 2},
                    {1, 0, 0, 1},
                    {2, 0, 1, 1},
                    {1, 1, 1, 0}
            };
// Matrices para demostrar la optimización de rutas (simplificadas)
            int[][] conexiones = {
                    {0, 1, 1, 0},
                    {1, 0, 0, 1},
                    {1, 0, 0, 1},
                    {0, 1, 1, 0}
            };

            int[][] costos = {
                    {1, 2, 3, 4},
                    {2, 1, 4, 3},
                    {3, 4, 1, 2},
                    {4, 3, 2, 1}
            };

            // Multiplicación de matrices para optimizar rutas y recursos
            int[][] optimizacion = multiplicarMatrices(conexiones, costos);

            System.out.println("Matriz de Optimización de Rutas y Recursos:");
            for (int i = 0; i < optimizacion.length; i++) {
                for (int j = 0; j < optimizacion[i].length; j++) {
                    System.out.print(optimizacion[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Método para multiplicar dos matrices
        public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
            int filasA = a.length;
            int columnasA = a[0].length;
            int columnasB = b[0].length;

            int[][] resultado = new int[filasA][columnasB];

            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    for (int k = 0; k < columnasA; k++) {
                        resultado[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            return resultado;
        }
    }



}
