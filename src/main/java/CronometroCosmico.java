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

    public static int calcularSegundosEnUnAñoTerrestre() {
        return (int) (SEGUNDOS_EN_MINUTO * MINUTOS_EN_HORA * HORAS_EN_DIA * DIAS_EN_AÑO);
    }
}
