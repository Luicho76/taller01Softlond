//Ejercicico No.: 12
//Realizar un programa que pida al usuario un número entero y determine si es un número primo o no

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
        }
        
        scanner.close();
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
