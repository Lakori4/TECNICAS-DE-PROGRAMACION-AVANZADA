/*
 * Escriba un programa Java para crear una clase llamada "Persona" 
 * con un atributo de nombre y edad.
 * Cree dos instancias de la clase "Persona", 
 * configure sus atributos usando el constructor e imprima su
 * nombre y edad utilizando getters.
 */

import java.util.Scanner;

/*
 * Clase Persona
 */

class Persona {

    //Atributes
    private String nombre;
    private int edad;

    //Methods
    public void setNombre(String nom) {nombre = nom;}
    public void setEdad (int e) {edad = e;}

    public String getNombre () {return nombre;}
    public int getEdad () {return edad;}

    public Persona () {
        System.out.print("\tIntroduzca el nombre de la persona: ");
        Scanner input = new Scanner(System.in);
        setNombre(input.next());

        System.out.print("\tIntroduzca la edad de la persona: ");
        setEdad(input.nextInt());
        //input.close();
    }

    
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nDATOS PERSONA 1");
        Persona p1 = new Persona();
        System.out.println("\nDATOS PERSONA 2");
        Persona p2 = new Persona();

        System.out.println("\n\nLa persona 1 se llama " + p1.getNombre() + " y tiene " + p1.getEdad() + " años.");
        System.out.println("\nLa persona 2 se llama " + p2.getNombre() + " y tiene " + p2.getEdad() + " años.");

    }
}
