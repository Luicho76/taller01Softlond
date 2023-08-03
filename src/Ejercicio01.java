import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor digite el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Por favor digite el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        
        // para evitar la división por cero, utilizaremos un condicional
        double division = 0;
        if (numero2 != 0) {
            division = (double) numero1 / numero2;
        }
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        
        scanner.close();
    }
}
