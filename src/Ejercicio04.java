//Ejercicio No. 4:
//Pedir al usuario su edad y mostrar un mensaje indicando si es mayor de edad o menor de edad.
//Para este ejercicio tomaremos como mayoria de edad los 18 años

import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese su edad: ");
    int edad = scanner.nextInt();
    
    if (edad >= 18) {
        System.out.println("Eres mayor de edad.");
    } else {
        System.out.println("Eres menor de edad.");
    }
    
    scanner.close();
}
}
