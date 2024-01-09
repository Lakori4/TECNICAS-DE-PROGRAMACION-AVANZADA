//Pide tres números enteros y hace la media aritmética

import java.util.Scanner;

public class T1_1_3 {
    public static void main(String[] args) {
        System.out.print("Introduce el primer número: ");
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        System.out.print("Introduce el segundo número: ");
        float n2 = input.nextFloat();
        System.out.print("Introduce el tercer número: ");
        float n3 = input.nextFloat();
        input.close();

        int media = (int)((n1 + n2 + n3)/3);

        System.out.println("La media de los tres números es: " + media);

    }
}
