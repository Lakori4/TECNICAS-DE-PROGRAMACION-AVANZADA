import java.util.Scanner;
//import java.util.Locale 
import java.lang.Math;

public class T1_1_2 {
    public static void main(String[] args) {
        System.out.print("Introduce el radio de un círculo: ");
        Scanner input = new Scanner (System.in);
        double radio = input.nextDouble();
        input.close();
        double area = Math.PI * Math.pow(radio, 2);
        double perim = Math.PI * 2 *radio;

        System.out.println("El área del circulo es: " + area);
        System.out.println("El perímetro es: " + perim);

    }
}
