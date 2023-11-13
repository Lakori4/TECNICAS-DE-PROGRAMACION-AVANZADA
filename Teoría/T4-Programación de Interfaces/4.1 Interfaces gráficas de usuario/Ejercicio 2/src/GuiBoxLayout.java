import javax.swing.*;
import java.awt.*;

public class GuiBoxLayout extends JFrame {

    public GuiBoxLayout() {
        //Creamos la ventana
        setTitle("Gui con BoxLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);

        //Creamos los componentes
        JLabel label = new JLabel("Introduce tu nombre");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Enviar");

        //Alineamos los componentes respecto del centro
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Creamos el panel con BoxLayout en vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //Agregamos los componentes
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        //Agregamos el panel al JFrame
        getContentPane().add(panel);
        setLocationRelativeTo(null); //Centramos la ventana
        setVisible(true);



    }
}
