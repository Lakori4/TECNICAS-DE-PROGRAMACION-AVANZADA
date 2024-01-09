import java.io.Serializable;

public class Motocicleta implements Serializable {
    String marca, modelo;
    float cilindrada;

    public Motocicleta(String marca, String modelo, float cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getCilindrada() {
        return cilindrada;
    }
}
