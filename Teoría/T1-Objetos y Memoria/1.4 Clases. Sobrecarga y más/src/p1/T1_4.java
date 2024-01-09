package p1;
import p2.*;
import java.util.Calendar;

public class T1_4 {
    public static void main(String[] args) throws Exception {
        Average A1 = new Average(4, 2);
        Average A2 = new Average(2, 4, 9);
        Calendar calendar = Calendar.getInstance();
        
        double [] valores = {4, 5, 8, 9};
        ArrayAverage A3 = new ArrayAverage(valores);

        System.out.println(A1.getMedia());
        System.out.println(A2.getMedia());
        System.out.println(A3.getMedia());

        int currentDay =  calendar.get(Calendar.DAY_OF_WEEK);

        Semana hoy = Semana.LUNES;
        switch (currentDay) {
            case 2:
                hoy = Semana.LUNES;
                break;

            case 3:
                hoy = Semana.MARTES;
                break;

            case 4:
                hoy = Semana.MIÉRCOLES;
                break;

            case 5:
                hoy = Semana.JUEVES;
                break;

            case 6:
                hoy = Semana.VIERNES;
                break;

            case 7:
                hoy = Semana.SÁBADO;
                break;

            case 1:
                hoy = Semana.DOMINGO;
                break;
        
            default:
                break;
        }
        System.out.println("Hoy es " + hoy + ".");
    }
}
