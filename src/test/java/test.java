
// implementacion de pruebas unitarias con JUnit
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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

