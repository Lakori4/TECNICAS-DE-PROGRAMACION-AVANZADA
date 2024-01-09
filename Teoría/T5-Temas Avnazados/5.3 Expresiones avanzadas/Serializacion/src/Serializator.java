import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializator {
    public static void main(String[] args) {

        Motocicleta m1 = new Motocicleta("Kawasaki", "Cago", 650);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("motocicleta.ser"))) {
            oos.writeObject(m1);
            System.out.println("Objeto motocicleta serializado  con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}