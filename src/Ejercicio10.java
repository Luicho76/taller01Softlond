//Ejercicio No. 10: 
//Crear un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …

public class Ejercicio10 {
  public static void main(String[] args) {
    int cantidadNumeros = 20;
    
    System.out.println("Los primeros " + cantidadNumeros + " números de la serie Fibonacci son: ");
    
    int numero1 = 0;
    int numero2 = 1;
    
    System.out.print(numero1 + ", " + numero2);
    
    for (int i = 2; i < cantidadNumeros; i++) {
        int siguienteNumero = numero1 + numero2;
        System.out.print(", " + siguienteNumero);
        numero1 = numero2;
        numero2 = siguienteNumero;
    }
}
}
