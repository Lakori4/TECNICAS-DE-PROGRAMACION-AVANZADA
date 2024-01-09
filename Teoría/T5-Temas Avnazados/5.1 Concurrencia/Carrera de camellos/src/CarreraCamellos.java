public class CarreraCamellos {
    public static int distance = 500;
    int cGanador = -1;

    public synchronized void cruzarMeta(Camello c) {

        if (cGanador == -1) {
            cGanador = c.idCamello;
            System.out.println("El camello " + c.idCamello + " ha ganado la carrera!");
        }
        else {
            System.out.println("El camello " + c.idCamello + " ha llegado a la meta");

        }
    }
    public static void main(String[] args) {
        int numeroDeCamellos = 5;
        CarreraCamellos carrera = new CarreraCamellos();

        for (int i = 1; i < numeroDeCamellos+1; i++) {
            new Camello(carrera, i,0).start();
        }
    }
}