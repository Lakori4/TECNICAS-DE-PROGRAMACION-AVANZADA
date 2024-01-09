import java.util.Scanner;

/*
 * Este  programa pide un número al usuario y a continuación lo muestra.
 */
public class T1_1_ej1 {
    
    public static void main(String[] args) {
        System.out.print("Introduce un número: "); // imprimes por pantalla el texto entre comillas
        Scanner input  = new Scanner (System.in); // Inicias un scanner llamado "input"
        int num  = input.nextInt(); // Asignas a la variable "num" la entrada que llegue desde el scanner "input"
        input.close(); // Cierras el scanner llamdo "input"

        System.out.println("El número introducido es " + num); // Igual que el anterior, pero introduces un salto de línea.
    }
}
