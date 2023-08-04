//Ejercicio No. 8;
//Realizar un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar. Me tome el atrevimiento de colocar solo 3 intentos, parq eu el programa no se quede ejecutando mucho tiempo

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    int numeroAdivinar = random.nextInt(100) + 1;
    int intentos = 3;
    boolean adivinado = false;
    
    System.out.println("Bienvenido al juego de adivinar el número entre 1 y 100!");
    System.out.println("Tienes " + intentos + " intentos.");
    
    while (!adivinado && intentos > 0) {
        try {
            System.out.print("Ingrese un número: ");
            int numeroUsuario = scanner.nextInt();
            
            if (numeroUsuario < 1 || numeroUsuario > 100) {
                System.out.println("Ingrese un número dentro del rango permitido.");
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número es mayor. Te quedan " + (--intentos) + " intentos.");
            } else if (numeroUsuario > numeroAdivinar) {
                System.out.println("El número es menor. Te quedan " + (--intentos) + " intentos.");
            } else {
                System.out.println("¡Adivinaste! El número era " + numeroAdivinar + ".");
                adivinado = true;
            }
            
            if (!adivinado && intentos == 0) {
                System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroAdivinar + ".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
            scanner.next(); //usamos este metodo para limpiar el error o excepcion incorrecta que pueda ocurrir en el scanner
        }
    }
    
    scanner.close();
  }
}
