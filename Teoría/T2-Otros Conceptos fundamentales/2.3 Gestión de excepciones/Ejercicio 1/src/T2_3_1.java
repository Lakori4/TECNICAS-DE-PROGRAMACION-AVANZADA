import java.util.Scanner;

public class T2_3_1 {

    public static void askNum() throws Exception {

        System.out.print("Escribe un número entero: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        if (n % 2 == 0) {
            
            throw new Exception("EL NÚMERO " + n + " ES IMPAR");
        }
        else{
        }
    }
    public static void main(String[] args) {
        try {
            askNum();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
