import java.util.Scanner;

public class T1_3_2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Empleado E1 = new Empleado();

        System.out.print("Introduzca su nombre: ");
        E1.setNombre(input.nextLine());

        System.out.print("Introduzca su cargo: ");
        E1.setCargo(input.nextLine());

        System.out.print("Introduzca su salario anual: ");
        E1.setSalario(input.nextInt());

        input.close();

        System.out.println("DATOS DEL EMPLEADO");

        E1.mostrar();
    }
}
