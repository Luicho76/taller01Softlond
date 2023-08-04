//Ejercicio No. 13:
//Pedir al usuario un número decimal y mostrar su valor redondeado a un número específico de decimales 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número decimal: ");
            double numero = scanner.nextDouble();
            
            System.out.print("Ingrese la cantidad de decimales para redondear: ");
            int decimales = scanner.nextInt();
            
            double numeroRedondeado = redondearDecimal(numero, decimales);
            System.out.println("El número redondeado es: " + numeroRedondeado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido");
        }
        
        scanner.close();
    }
    
    public static double redondearDecimal(double numero, int decimales) {
        if (decimales < 0) {
            throw new IllegalArgumentException("La cantidad de decimales debe ser no negativa");
        }
        
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }
}
