//Ejercicio No. 29: 
//Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
            int cantidadElementos = scanner.nextInt();
            
            if (cantidadElementos <= 0) {
                System.out.println("Ingrese un valor positivo para la cantidad de elementos.");
            } else {
                int[] arreglo = new int[cantidadElementos];
                
                for (int i = 0; i < cantidadElementos; i++) {
                    System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                }
                
                int numeroMasGrande = encontrarNumeroMasGrande(arreglo);
                System.out.println("El número más grande en el arreglo es: " + numeroMasGrande);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese valores válidos.");
        }
        
        scanner.close();
    }
    
    public static int encontrarNumeroMasGrande(int[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }
}
