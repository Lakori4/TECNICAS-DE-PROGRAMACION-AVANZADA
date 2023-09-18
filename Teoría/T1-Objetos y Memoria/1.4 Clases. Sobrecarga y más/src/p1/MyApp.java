package p1;
import p2.*;

public class MyApp {
    public static void main(String[] args) throws Exception {
        Average A1 = new Average(4, 2);
        Average A2 = new Average(2, 4, 9);
        
        double [] valores = {4, 5, 8, 9};
        ArrayAverage A3 = new ArrayAverage(valores);
    }
}
