public class ComunicadorInterplanetario {
    public static void main(String[] args) {
        String mensaje = "La Tierra es planeta más denso del Sistema Solar.";

        System.out.println("Mensaje Original: " + mensaje);
        System.out.println("Cantidad de vocales: " + contarVocales(mensaje));
        System.out.println("Mensaje Invertido: " + invertirMensaje(mensaje));
        System.out.println("¿Es Palíndromo?: " + esPalindromo(mensaje));
    }
}
