//Ejercicio No. 16: 
//Realizar un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número para el límite de la serie Fibonacci: ");
            int limite = scanner.nextInt();
            
            if (limite < 0) {
                System.out.println("Ingrese un número no negativo.");
            } else {
                System.out.println("Serie de Fibonacci hasta " + limite + ":");
                imprimirSerieFibonacci(limite);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
        }
        
        scanner.close();
    }
    
    public static void imprimirSerieFibonacci(int limite) {
        int numero1 = 0;
        int numero2 = 1;
        
        while (numero1 <= limite) {
            System.out.print(numero1 + ", ");
            int siguienteNumero = numero1 + numero2;
            numero1 = numero2;
            numero2 = siguienteNumero;
        }
    }
}
