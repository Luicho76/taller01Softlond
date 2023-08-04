//Ejercicio No. 31: 
//Ordenar elementos: Implementar un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente. 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio31 {
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
                
                ordenarArregloSeleccion(arreglo);
                
                System.out.println("Arreglo ordenado:");
                for (int elemento : arreglo) {
                    System.out.print(elemento + " ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese valores válidos.");
        }
        
        scanner.close();
    }
    
    public static void ordenarArregloSeleccion(int[] arreglo) {
        int n = arreglo.length;
        
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            int temp = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}
