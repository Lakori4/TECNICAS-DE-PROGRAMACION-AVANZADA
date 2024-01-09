public class Camello extends Thread {

     CarreraCamellos carrera;
    int idCamello, posicion;

    Camello (CarreraCamellos carrera, int idCamello, int posicion) {
        this.carrera = carrera;
        this.idCamello = idCamello;
        this.posicion = 0;
    }
    @Override
    public void run () {
        try {
            while (posicion < CarreraCamellos.distance) {
                avanzar();
                System.out.println("Camello " + idCamello + " está en la posición " + posicion);

                    sleep(1000);
            }

            carrera.cruzarMeta(this);
        } catch (InterruptedException e) {}
    }

    private void avanzar() {
        posicion += Math.random() * 4;
    }

}