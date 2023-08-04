//Ejercicio No. 32: 
//Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra). 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio32 {
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
                
                System.out.print("Ingrese el número a buscar: ");
                int numeroABuscar = scanner.nextInt();
                
                int indice = buscarNumeroEnArreglo(arreglo, numeroABuscar);
                
                if (indice != -1) {
                    System.out.println("El número se encuentra en el índice: " + indice);
                } else {
                    System.out.println("El número no se encuentra en el arreglo.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese valores válidos.");
        }
        
        scanner.close();
    }
    
    public static int buscarNumeroEnArreglo(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return i;
            }
        }
        return -1; // Esto indica que el número no se encontró en el arreglo
    }
}
