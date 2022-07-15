package tablas;

import javax.swing.*;
import java.awt.*;

public class CampoTexto extends JTextField {
    final int ALTO = 25;
    int ancho;

    public CampoTexto(int ancho){
        super();
        this.ancho = ancho;
        configurar();
    }

    private void configurar(){
        setPreferredSize(new Dimension(ancho, ALTO));
        setBorder((javax.swing.BorderFactory.createEmptyBorder()));
        setOpaque(false);
    }
}
