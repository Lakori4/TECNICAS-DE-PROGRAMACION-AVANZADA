import java.util.Scanner;



public class T1_2_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i*2)-1; k++) {System.out.print('*');} 
            System.out.println();           
        }

        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i*2)-1; k++) {System.out.print('*');} 
            System.out.println();           
        }
        input.close();
    }
}
