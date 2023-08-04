//Ejercicio No. 34: 
//Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio34 {
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
                
                System.out.print("Ingrese la cantidad de posiciones para rotar (negativo para izquierda, positivo para derecha): ");
                int cantidadPosiciones = scanner.nextInt();
                
                int[] arregloRotado = rotarElementos(arreglo, cantidadPosiciones);
                
                System.out.println("Arreglo rotado:");
                for (int elemento : arregloRotado) {
                    System.out.print(elemento + " ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese valores válidos.");
        }
        
        scanner.close();
    }
    
    public static int[] rotarElementos(int[] arreglo, int cantidadPosiciones) {
        int n = arreglo.length;
        int[] arregloRotado = new int[n];
        
        for (int i = 0; i < n; i++) {
            int nuevaPosicion = (i + cantidadPosiciones) % n;
            if (nuevaPosicion < 0) {
                nuevaPosicion += n;
            }
            arregloRotado[nuevaPosicion] = arreglo[i];
        }
        
        return arregloRotado;
    }
}

