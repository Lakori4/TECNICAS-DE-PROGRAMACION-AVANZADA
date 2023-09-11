/*
Pide un caracter, y muestra si es vocal o consonante, 
si la entrada no es una letra o es más de 1 caracter 
imprime un mensaje de error
*/

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce una letra: ");
        Scanner input = new Scanner (System.in);
        String carac = input.next();

        if (carac.length() > 1 || ((carac.charAt(0) < 65 || carac.charAt(0) > 90) && (carac.charAt(0) < 97 || carac.charAt(0) > 122))) {

            System.out.println("La entrada no es válida");
        }

        else if (carac.charAt(0) == 'a' || carac.charAt(0) == 'e' || carac.charAt(0) == 'o' || carac.charAt(0) == 'i' || carac.charAt(0) == 'u') {
            System.out.println("La letra introducida es una vocal.");            
        }

        else {
            System.out.println("La letra introducida es una consonante.");
        }

        input.close();
    }

}
