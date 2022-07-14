import tablas.TablaEmpresas;

import javax.swing.*;
import java.awt.*;

public class FrmEmpresas extends JFrame {

    SpringLayout layout = new SpringLayout();
    public FrmEmpresas(){
        super("Empresas de seguridad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(800,600));
        setLocationRelativeTo(null);
        setLayout(layout);

        TablaEmpresas tabla = new TablaEmpresas();
        layout.putConstraint(SpringLayout.WEST, tabla, 0, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, tabla, 0, SpringLayout.NORTH, this);
        add(tabla);

        setVisible(true);
    }
}
