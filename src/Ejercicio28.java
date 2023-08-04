//Ejercicio No. 28: 
//Suma de elementos: Escribir un programa que calcule la suma de todos los elementos en un arreglo de enteros.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
            int cantidadElementos = scanner.nextInt();
            
            if (cantidadElementos <= 0) {
                System.out.println("Ingrese un valor positivo para la cantidad de elementos");
            } else {
                int[] arreglo = new int[cantidadElementos];
                
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                
                int suma = calcularSumaElementos(arreglo);
                System.out.println("La suma de los elementos en el arreglo es: " + suma);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese valores válidos");
        }
        
        scanner.close();
    }
    
    public static int calcularSumaElementos(int[] arreglo) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}
