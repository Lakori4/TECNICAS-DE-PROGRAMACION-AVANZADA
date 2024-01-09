import java.io.*;

public class Deserializator {
    public static void main(String[] args) {
        String fileName = "motocicleta.ser";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("motocicleta.ser"))) {
            Motocicleta m = (Motocicleta) ois.readObject();

            System.out.println("Objeto motocicleta deserializado  con éxito.");
            System.out.println("Marca: " + m.getMarca());
            System.out.println("Modelo: " + m.getModelo());
            System.out.println("Cilindrada: " + m.getCilindrada());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}