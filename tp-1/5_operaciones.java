package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        // validacion de division por cero
        String division;
        if (num2 != 0) {
            division = String.valueOf((double) num1 / num2);
        } else {
            division = "No se puede dividir por cero";
        }

        // Mostrar resultados
        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        scanner.close();
    }

}
