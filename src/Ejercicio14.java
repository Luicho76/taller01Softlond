//Ejercicio No. 14:
//Escribir un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();
            
            if (numero <= 0) {
                System.out.println("Ingrese un número entero positivo.");
            } else {
                if (esNumeroPerfecto(numero)) {
                    System.out.println(numero + " es un número perfecto.");
                } else {
                    System.out.println(numero + " no es un número perfecto.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
        }
        
        scanner.close();
    }
    
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        
        return sumaDivisores == numero;
    }
}

