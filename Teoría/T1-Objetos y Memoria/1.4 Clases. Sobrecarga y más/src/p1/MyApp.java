package p1;
import p2.*;

public class MyApp {
    public static void main(String[] args) throws Exception {
        Average A1 = new Average(4, 2);
        Average A2 = new Average(2, 4, 9);
        
        double [] valores = {4, 5, 8, 9};
        ArrayAverage A3 = new ArrayAverage(valores);

        System.out.println(A1.getMedia());
        System.out.println(A2.getMedia());
        System.out.println(A3.getMedia());

        Semana hoy = Semana.LUNES;
        switch (hoy) {
            case LUNES:
                System.out.println("Hoy es lunes.");
                break;

            case MARTES:
                System.out.println("Hoy es martes.");
                break;

            case MIÉRCOLES:
                System.out.println("Hoy es miércoles.");
                break;

            case JUEVES:
                System.out.println("Hoy es jueves.");
                break;

            case VIERNES:
                System.out.println("Hoy es viernes.");
                break;

            case SÁBADO:
                System.out.println("Hoy es sábado.");
                break;

            case DOMINGO:
                System.out.println("Hoy es domingo.");
                break;
        
            default:
                break;
        }
    }
}
