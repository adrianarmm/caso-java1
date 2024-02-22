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



