//Ejercicio No. 7:
//Crear un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        try {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                System.out.println("Ingrese un número entero positivo.");
            } else {
                System.out.println("Tabla de multiplicar del " + numero + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
        }
    
        scanner.close();
    }
}
