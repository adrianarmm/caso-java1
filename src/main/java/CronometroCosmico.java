public class CronometroCosmico {

    private static final double DIA_PLANETA_HORAS = 24.6; // Ejemplo: 24.6 horas terrestres equivale a un día en el nuevo planeta
    private static final double AÑO_PLANETA_DIAS = 687; // Ejemplo: 687 días terrestres equivalen a un año en el nuevo planeta

    public static void main(String[] args) {
        // Tiempo en la Tierra
        int segundos = 60; // 1 minuto
        int minutos = 60; // 1 hora
        int horas = 24; // 1 día
        int dias = 365; // 1 año

        // Convertir tiempo terrestre a tiempo del nuevo planeta
        double diasPlaneta = horas / DIA_PLANETA_HORAS;
        double añosPlaneta = dias / AÑO_PLANETA_DIAS;

        // Mostrar tiempo en la Tierra y en el nuevo planeta
        System.out.println("Tiempo en la Tierra: " + segundos + " segundos, " + minutos + " minutos, " + horas + " horas, " + dias + " días, " + "1 año");
        System.out.println("Equivalente en el nuevo planeta: " + diasPlaneta + " días del planeta, " + añosPlaneta + " años del planeta");

        // Mostrar mayores valores representables para diferentes tipos de datos en Java
        System.out.println("Mayor valor para byte: " + Byte.MAX_VALUE);
        System.out.println("Mayor valor para short: " + Short.MAX_VALUE);
        System.out.println("Mayor valor para int: " + Integer.MAX_VALUE);
        System.out.println("Mayor valor para long: " + Long.MAX_VALUE);
        System.out.println("Mayor valor para float: " + Float.MAX_VALUE);
        System.out.println("Mayor valor para double: " + Double.MAX_VALUE);
    }
}

