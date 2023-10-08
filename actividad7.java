import java.util.Scanner;

public class actividad7    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos un arreglo para almacenar los números enteros
        int[] numerosEnteros = new int[20];

        // Leemos 20 números enteros desde el teclado
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número entero " + (i + 1) + ": ");
            numerosEnteros[i] = scanner.nextInt();
        }

        // Mostramos cada elemento del arreglo junto con su cuadrado y su cubo
        System.out.println("Número\tCuadrado\tCubo");
        for (int numero : numerosEnteros) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }
    }
}