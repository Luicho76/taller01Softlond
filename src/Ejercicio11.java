//Ejercicico No. 10:
//Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese las longitudes de los tres lados del triángulo:");
    double lado1 = leerLado(scanner, "Lado 1");
    double lado2 = leerLado(scanner, "Lado 2");
    double lado3 = leerLado(scanner, "Lado 3");
    
    if (esTrianguloValido(lado1, lado2, lado3)) {
        double area = calcularAreaHeron(lado1, lado2, lado3);
        System.out.println("El área del triángulo es: " + area);
    } else {
        System.out.println("Los lados no forman un triángulo válido.");
    }
    
    scanner.close();
}

  public static double leerLado(Scanner scanner, String nombreLado) {
    try {
        System.out.print(nombreLado + ": ");
        double lado = scanner.nextDouble();
        return lado;
    } catch (Exception e) {
        System.out.println("Ingrese un valor numérico válido.");
        return leerLado(scanner, nombreLado);
    }
}

  public static boolean esTrianguloValido(double lado1, double lado2, double lado3) {
    return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
}

  public static double calcularAreaHeron(double lado1, double lado2, double lado3) {
    double semiperimetro = (lado1 + lado2 + lado3) / 2;
    double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    return area;
}
}
