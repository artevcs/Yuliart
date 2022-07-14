package tablas;

import javax.swing.*;
import java.awt.*;

public class TablaEmpresas extends JPanel {
    SpringLayout layout = new SpringLayout();

    public TablaEmpresas(){
        super();
        setLayout(layout);
        setBackground(Color.white);
        setPreferredSize(new Dimension(700,500));

        FilaEmpresas fila = new FilaEmpresas();
        setUbicacion(fila, 5,5);
        add(fila);
    }

    private void setUbicacion(Component componente, int north, int west){
        layout.putConstraint(SpringLayout.NORTH, componente, north, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.WEST, componente, west, SpringLayout.WEST, this);
    }
}
