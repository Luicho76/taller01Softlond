//Ejercicio No. 5:
//Realizar un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    try {
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = scanner.nextInt();
            
            if (numero1 > numero2) {
                System.out.println("El mayor número es: " + numero1);
            } else if (numero2 > numero1) {
                System.out.println("El mayor número es: " + numero2);
            } else {
                System.out.println("Ambos números son iguales");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese números enteros válidos");
        }
    
    scanner.close();
}
}
