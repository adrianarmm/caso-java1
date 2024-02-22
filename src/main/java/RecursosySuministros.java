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

    private static double[] calcularConsumo(int dias, int personas) {
        double agua = CONSUMO_AGUA_DIA * dias * personas;
        double comida = CONSUMO_COMIDA_DIA * dias * personas;
        double oxigeno = CONSUMO_OXIGENO_DIA * dias * personas;
        return new double[]{agua, comida, oxigeno};
    }
    private static void verificarAlerta(double[] consumo, int dias) {
        // Suponiendo capacidades de recursos (ejemplo simplificado)
        double capacidadAgua = 500; // 500 litros
        double capacidadComida = 200; // 200 kg
        double capacidadOxigeno = 150; // 150 m^3
    }

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
    double mediaAguaporPersona = consumo[0] / (dias * personas);