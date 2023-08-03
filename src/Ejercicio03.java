import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        // Calcular el área del círculo (π * radio * radio)
        double area = Math.PI * radio * radio;
        
        // Calcular el perímetro del círculo (2 * π * radio)
        double perimetro = 2 * Math.PI * radio;
        
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
        
        scanner.close();
    }
}
