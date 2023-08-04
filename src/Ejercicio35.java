//Ejercicio No. 35: 
//Tabla de multiplicar: Crear un programa que imprima las tablas de multiplicar del 1 al 10. Usando para esto una matriz. 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número entre 1 y 10 para mostrar la tabla de multiplicar: ");
            int numero = scanner.nextInt();
            
            if (numero < 1 || numero > 10) {
                System.out.println("Ingrese un número válido entre 1 y 10.");
            } else {
                int[][] tablaMultiplicar = generarTablaMultiplicar(numero);
                
                System.out.println("Tabla de multiplicar del " + numero + ":");
                for (int i = 0; i < tablaMultiplicar.length; i++) {
                    System.out.println(numero + " x " + (i + 1) + " = " + tablaMultiplicar[i][0]);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
        }
        
        scanner.close();
    }
    
    public static int[][] generarTablaMultiplicar(int numero) {
        int[][] tabla = new int[10][1];
        for (int i = 0; i < 10; i++) {
            tabla[i][0] = numero * (i + 1);
        }
        return tabla;
    }
}

