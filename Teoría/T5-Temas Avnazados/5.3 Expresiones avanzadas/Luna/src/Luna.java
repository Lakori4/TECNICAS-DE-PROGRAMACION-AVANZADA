public class Luna {
    public static void main(String[] args) {

        ControlMision control = new ControlMision() {
            @Override
            public void ejecutar(String s) {
                System.out.println("Controlando la nave para: " + s);
            }
        };

        ControlMision gestion = new ControlMision() {
            /**
             * @param s
             */
            @Override
            public void ejecutar(String   s) {
                System.out.println("Gestionando recursos para: " + s);
            }
        };

        control.ejecutar("rumbo");
    }
}