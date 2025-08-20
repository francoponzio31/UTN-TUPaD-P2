package javaapplication1;
import java.util.Scanner;


public class JavaApplication1 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        double num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        double num2 = scanner.nextInt();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("Resultado (int): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }

}
