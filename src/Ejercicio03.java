//Ejercicio No. 3:
//Crear un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        
        // Calcular el área del círculo (π * radio * radio)
        double area = Math.PI * radioCirculo * radioCirculo;
        
        // Calcular el perímetro del círculo (2 * π * radio)
        double perimetro = 2 * Math.PI * radioCirculo;
        
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
        
        scanner.close();
    }
}
