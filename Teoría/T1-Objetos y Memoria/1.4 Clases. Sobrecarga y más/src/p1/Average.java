package p1;

public class Average {

    //Atributtes
    private double media = 0;

    // Methods

    public Average (double n1, double n2) {
        media = (n1 + n2) / 2;
    }



    public Average (double n1, double n2, double n3) {

        media = (n1 + n2 + n3) / 3;
    }



    public String getMedia() {
        return "(Desde paquete p1) " + media;
    }

    
    
}
