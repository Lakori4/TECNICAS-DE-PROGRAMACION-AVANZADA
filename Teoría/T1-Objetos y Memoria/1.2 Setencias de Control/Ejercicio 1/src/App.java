/*
Pide un caracter, y muestra si es vocal o consonante, 
si la entrada no es una letra o es más de 1 caracter 
imprime un mensaje de error
*/

import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce una letra: ");
        Scanner input = new Scanner (System.in);
        String carac = input.next();

        if (carac.length() > 1 || ((carac.charAt(0) < 65 || carac.charAt(0) > 90) && (carac.charAt(0) < 97 || carac.charAt(0) > 122))) {

            System.out.println("La entrada no es válida");
            
        }
        input.close();
    }

}
