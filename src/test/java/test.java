
// implementacion de pruebas unitarias con JUnit
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

// ejercicio 1
class CronometroCosmicoTest {

    @Test
    void testCalcularSegundosEnUnAñoTerrestre() {
        assertEquals(31536000, CronometroCosmico.calcularSegundosEnUnAñoTerrestre());
    }

    @Test
    void testCalcularAñosPlaneta() {
        // Considerando la precisión en los cálculos de punto flotante
        assertEquals(0.531, CronometroCosmico.calcularAñosPlaneta(365), 0.001);
    }
}

// ejercicio 2


class RecursosySuministrosTest {

        @Test
        void testCalcularConsumo() {
            double[] esperado = {7.5, 2.5, 4.2};
            assertArrayEquals(esperado, RecursosySuministros.calcularConsumo(5, 1), 0.01);
        }

        @Test
        void testVerificarAlerta() {
            double[] consumo = {7.5, 2.5, 4.2};
            assertFalse(RecursosySuministros.verificarAlerta(consumo, 500, 200, 150));

        }

        @Test
        void testCalcularEstadisticas() {
            double[] consumo = {7.5, 2.5, 4.2};
            double[] esperado = {1.5, 0.5, 0.84};
            assertArrayEquals(esperado, RecursosySuministros.calcularEstadisticas(consumo, 5, 1), 0.01);
        }
// manejo de excepciones
    public static double[] calcularConsumo(int dias, int personas) {
        if (dias < 0 || personas < 0) {
            throw new IllegalArgumentException("Los días y las personas no pueden ser negativos.");
        }

        return new double[0];
    }
}

// ejercicio 3
// implementacion de pruebas unitarias con JUnit


class SistemaMonitoreoTest {

    @Test
    void testEsPrimo() {
        assertTrue(SistemaMonitoreo.esPrimo(5));
        assertFalse(SistemaMonitoreo.esPrimo(4));
    }

    @Test
    void testListarPrimerosNPrimos() {
        assertEquals(List.of(2, 3, 5, 7, 11), SistemaMonitoreo.listarPrimerosNPrimos(5));
    }

    @Test
    void testDescomponerEnFactoresPrimos() {
        assertEquals(List.of(2, 2, 3, 5), SistemaMonitoreo.descomponerEnFactoresPrimos(60));
    }

    // manejo de excepciones

}

// ejercicio 4
// implementacion de pruebas unitarias con JUnit

class PlanificadordeTareasTest {

    @Test
    void testProductoEscalar() {
        int[] tareas = {2, 3, 2};
        int[] horas = {5, 5, 5};
        assertEquals(35, PlanificadordeTareas.productoEscalar(tareas, horas));
    }

    // manejo de excepciones
    private static int productoEscalar(int[] tareas, int[] horas) {
        if (tareas == null || horas == null) {
            throw new IllegalArgumentException("Los arreglos de tareas y horas no pueden ser nulos.");
        }
        if (tareas.length != horas.length) {
            throw new IllegalArgumentException("Los arreglos de tareas y horas deben tener el mismo tamaño.");
        }
        int producto = 0;
        for (int i = 0; i < tareas.length; i++) {
            producto += tareas[i] * horas[i];
        }
        return producto;
    }
}

// ejercicio 5
// implementacion de pruebas unitarias con JUnit


class NavegadorEstelarTest {

    @Test
    void testMultiplicarMatrices() {
        int[][] a = {
                {1, 2},
                {3, 4}
        };
        int[][] b = {
                {2, 0},
                {1, 2}
        };
        int[][] esperado = {
                {4, 4},
                {10, 8}
        };
        assertArrayEquals(esperado, NavegadorEstelar.multiplicarMatrices(a, b));
    }

    // manejo de excepciones
    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int filasA = a.length;
        int columnasA = a[0].length;
        int filasB = b.length;

        if (columnasA != filasB) {
            throw new IllegalArgumentException("Las matrices no son compatibles para la multiplicación.");
        }

        int[][] resultado = new int[filasA][b[0].length];

        // Lógica de multiplicación de matrices...

        return resultado;
    }
}

// ejercicio 6
// implementacion de pruebas unitarias con JUnit

class ComunicadorInterplanetarioTest {

    @Test
    void testContarVocales() {
        assertEquals(13, ComunicadorInterplanetario.contarVocales("La Tierra es planeta más denso del Sistema Solar"));
    }

    @Test
    void testInvertirMensaje() {
        assertEquals("raloS ametS leD osned sám atenalp se arreiT aL", ComunicadorInterplanetario.invertirMensaje("La Tierra es planeta más denso del Sistema Solar"));
    }

    @Test
    void testEsPalindromo() {
        assertFalse(ComunicadorInterplanetario.esPalindromo("La Tierra es planeta más denso del Sistema Solar"));
        assertTrue(ComunicadorInterplanetario.esPalindromo("Anita lava la tina"));
    }

    // manejo de excepciones
    public static int contarVocales(String mensaje) {
        if (mensaje == null) throw new IllegalArgumentException("El mensaje no puede ser nulo.");
        // Resto de la implementación...
        return 0;
    }


}





