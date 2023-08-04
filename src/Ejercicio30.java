//Ejercicio No. 30: 
//Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio30 {
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
                
                int[] arregloSinDuplicados = eliminarDuplicados(arreglo);
                System.out.println("Arreglo sin elementos duplicados:");
                for (int elemento : arregloSinDuplicados) {
                    System.out.print(elemento + " ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese valores válidos.");
        }
        
        scanner.close();
    }
    
    public static int[] eliminarDuplicados(int[] arreglo) {
        List<Integer> listaSinDuplicados = new ArrayList<>();
        for (int elemento : arreglo) {
            if (!listaSinDuplicados.contains(elemento)) {
                listaSinDuplicados.add(elemento);
            }
        }
        
        int[] arregloSinDuplicados = new int[listaSinDuplicados.size()];
        for (int i = 0; i < listaSinDuplicados.size(); i++) {
            arregloSinDuplicados[i] = listaSinDuplicados.get(i);
        }
        
        return arregloSinDuplicados;
    }
}
