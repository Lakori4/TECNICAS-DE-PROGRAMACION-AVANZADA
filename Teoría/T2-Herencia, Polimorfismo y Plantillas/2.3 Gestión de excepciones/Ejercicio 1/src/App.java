import java.util.Scanner;

public class App {

    public static int askNum() throws Exception {

        System.out.print("Escribe un número entero: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        if (n % 2 == 0) {
            
            throw new Exception("EL NÚMERO " + n + " ES IMPAR");
        }
        else{
        return n;
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            askNum();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
