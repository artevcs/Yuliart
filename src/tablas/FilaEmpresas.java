package tablas;

import javax.swing.*;
import java.awt.*;

public class FilaEmpresas extends JPanel {
    public static int ALTO = 60;
    Empresa empresa;
    Dimension dimensionDelContenedor;
    SpringLayout layout = new SpringLayout();

    public FilaEmpresas(Empresa empresa, Dimension dimensionDelContenedor){
        super();
        this.empresa = empresa;
        this.dimensionDelContenedor= dimensionDelContenedor;
        setLayout(layout);
        setBackground(Color.gray);

        int ancho = (int) (dimensionDelContenedor.getWidth() - 10);
        setPreferredSize(new Dimension(ancho, ALTO));
    }
}
