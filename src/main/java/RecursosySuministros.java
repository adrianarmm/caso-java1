import java.util.ArrayList;
import java.util.List;

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

        verificarAlerta(consumoTotal, dias);
        System.out.println("Estadísticas de consumo diario por persona:");
        double[] estadisticas = calcularEstadisticas(consumoTotal, dias, personas);
        System.out.println("Media de consumo diario: Agua = " + estadisticas[0] + " litros, Comida = " + estadisticas[1] + " kg, Oxígeno = " + estadisticas[2] + " m^3");
        // Para mínimo y máximo, puedes expandir este sistema agregando más datos históricos o simulaciones.
    }


    }