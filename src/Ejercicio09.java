//Ejercicico No. 9:
//Escribir un programa que solicite al usuario un número entero positivo y calcule su factorial.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    try {
        System.out.print("Ingrese un número entero positivo: ");
        long numero = scanner.nextLong();
        
        if (numero < 0) {
            System.out.println("Ingrese un número entero positivo.");
        } else {
            long factorial = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    } catch (InputMismatchException e) {
        System.out.println("Error: Ingrese un número entero válido.");
    }
    
    scanner.close();
}

  public static long calcularFactorial(long n) {
    long factorial = 1;
    
    for (long i = 1; i <= n; i++) {
        factorial *= i;
    }
    
    return factorial;
  }
}
