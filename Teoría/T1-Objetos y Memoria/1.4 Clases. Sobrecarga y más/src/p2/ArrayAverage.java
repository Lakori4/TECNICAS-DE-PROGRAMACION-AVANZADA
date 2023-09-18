package p2;

public class ArrayAverage {
    
    //Atributes

    private double media = 0;

    //Methods

    public ArrayAverage (double [] valores) {

        for (double num : valores) {
            media += num;
        }
        media = media / valores.length;
    }

    public String getMedia() {
        return "Desde paquete p2: " + media;
    }

    
}
