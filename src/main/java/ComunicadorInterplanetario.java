public class ComunicadorInterplanetario {

    public static void main(String[] args) {
        String mensaje = "La Tierra es planeta más denso del Sistema Solar.";

        System.out.println("Mensaje Original: " + mensaje);
        System.out.println("Cantidad de vocales: " + contarVocales(mensaje));
        System.out.println("Mensaje Invertido: " + invertirMensaje(mensaje));
        System.out.println("¿Es Palíndromo?: " + esPalindromo(mensaje));
    }
}

int contador = 0;
for (char c : mensaje.toLowerCase().toCharArray())
{
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
contador++;
        }
        }
        return contador;
}

public static String invertirMensaje(String mensaje) {
    return new StringBuilder(mensaje).reverse().toString();
}

public static boolean esPalindromo(String mensaje) {
    String mensajeLimpio = mensaje.toLowerCase().replaceAll("\\s+", "");
    return mensajeLimpio.equals(new StringBuilder(mensajeLimpio).reverse().toString());
}
}
