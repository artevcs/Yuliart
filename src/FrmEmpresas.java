import tablas.TablaEmpresas;

import javax.swing.*;
import java.awt.*;

public class FrmEmpresas extends JFrame {

    SpringLayout layout = new SpringLayout();

    public FrmEmpresas(){
        super("Empresas de seguridad");
        configurar();

        TablaEmpresas tabla = new TablaEmpresas();
        setUbicacion(tabla, 5,5);
        add(tabla);

        setVisible(true);
    }

    private void configurar(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(800,600));
        setLocationRelativeTo(null);
        setLayout(layout);
        setBackground(new Color(217,217,217));
    }

    private void setUbicacion(Component componente, int north, int west){
        layout.putConstraint(SpringLayout.WEST, componente, west, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, componente, north, SpringLayout.NORTH, this);
    }
}
