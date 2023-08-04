//Ejercicio No. 33: 
//Frecuencia de elementos: Escribir un programa que cuente la frecuencia de cada elemento en un arreglo.

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio33 {
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
                
                Map<Integer, Integer> frecuenciaElementos = contarFrecuenciaElementos(arreglo);
                
                System.out.println("Frecuencia de elementos:");
                for (Map.Entry<Integer, Integer> entry : frecuenciaElementos.entrySet()) {
                    System.out.println("Elemento " + entry.getKey() + ": " + entry.getValue() + " veces");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese valores válidos.");
        }
        
        scanner.close();
    }
    
    public static Map<Integer, Integer> contarFrecuenciaElementos(int[] arreglo) {
        Map<Integer, Integer> frecuenciaElementos = new HashMap<>();
        for (int elemento : arreglo) {
            frecuenciaElementos.put(elemento, frecuenciaElementos.getOrDefault(elemento, 0) + 1);
        }
        return frecuenciaElementos;
    }
}
