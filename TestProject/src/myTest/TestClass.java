package myTest;

import java.util.Random;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        String mensaje = generarMensajeAleatorio(n);

        System.out.println("Mensaje generado:");
        System.out.println(mensaje);

        scanner.close();
    }

    // Genera un texto aleatorio con la longitud indicada
    public static String generarMensajeAleatorio(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        return sb.toString();
    }
}
