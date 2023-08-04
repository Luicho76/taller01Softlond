//Ejercicio No. 21: 
//Pedir al usuario una cadena y mostrar cuántas veces aparece una letra específica en ella

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0); // Lee el primer carácter ingresado
        
        int cantidadApariciones = contarApariciones(cadena, letra);
        
        System.out.println("La letra '" + letra + "' aparece " + cantidadApariciones + " veces en la cadena.");
        
        scanner.close();
    }
    
    public static int contarApariciones(String cadena, char letra) {
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        
        return contador;
    }
}
