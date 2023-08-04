//Ejercicio No. 17: 
//Pedir al usuario dos números enteros y mostrar todos los números primos que se encuentran en ese rango

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = scanner.nextInt();
            
            if (numero1 > numero2) {
                int temp = numero1;
                numero1 = numero2;
                numero2 = temp;
            }
            
            System.out.println("Números primos entre " + numero1 + " y " + numero2 + ":");
            mostrarNumerosPrimosEnRango(numero1, numero2);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese números enteros válidos.");
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
    
    public static void mostrarNumerosPrimosEnRango(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

