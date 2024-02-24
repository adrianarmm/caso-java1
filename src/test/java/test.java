
// implementacion de pruebas unitarias con JUnit
import org.junit.jupiter.api.Test;
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
            double[] consumo = {250, 100, 75};
            assertTrue(RecursosySuministros.verificarAlerta(consumo, 500, 200, 150));

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

