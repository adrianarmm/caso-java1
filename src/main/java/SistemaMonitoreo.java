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
}
