import java.util.Scanner;

public class App {

    public static String askString() throws vocalException {

        String s;
        boolean hayVocal = false;
        System.out.print("Escribe una cadena de texto: ");
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        scan.close();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                hayVocal = true;
            }   
        }
        
        if (!hayVocal) throw new vocalException(s);

        return s;
    }
    public static void main(String[] args) {
        try {
            String s = askString();

            System.out.println("La cadena " + s + " tiene vocales.");
        } 
        catch (vocalException e) {
            System.out.println("La cadena " + e.getMessage() + " no tiene vocales.");
        }
    }
}
