//Ejercicico No. 18:
//Crear un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.

import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        String contrasena = generarContrasenaAleatoria();
        System.out.println("Contraseña generada: " + contrasena);
    }
    
    public static String generarContrasenaAleatoria() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = 8;
        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }
        
        return contrasena.toString();
    }
}

