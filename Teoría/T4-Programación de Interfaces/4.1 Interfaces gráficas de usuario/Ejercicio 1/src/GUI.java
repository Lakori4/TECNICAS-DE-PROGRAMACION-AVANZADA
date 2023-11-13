import javax.swing.*;

public class GUI extends JFrame {
    public GUI (){
        //Creamos la ventana.
        setTitle("Ejercicio 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);

        // Creamos los componentes
        JLabel etiqueta = new JLabel("Mensaje");
        JTextField campo = new JTextField(20); //El campo admite 20 caracteres
        JButton boton = new JButton("Aceptar");

        //Creo el panel
        JPanel panel = new JPanel();

        //Añadimos los componentes
        panel.add(etiqueta);
        panel.add(campo);
        panel.add(boton);


        getContentPane().add(panel); //Añadimos el panel a la ventana
        setLocationRelativeTo(null); //Centramos la ventana
        setVisible(true);
    }




}
