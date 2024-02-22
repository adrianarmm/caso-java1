import java.util.ArrayList;
import java.util.List;

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


