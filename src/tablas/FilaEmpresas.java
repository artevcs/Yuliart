package tablas;

import javax.swing.*;
import java.awt.*;

public class FilaEmpresas extends JPanel {
    final public static int ALTO = 35;
    final public static int SEPARACION = 5;
    Empresa empresa;
    Dimension dimensionDelContenedor;
    SpringLayout layout = new SpringLayout();

    public FilaEmpresas(Empresa empresa, Dimension dimensionDelContenedor){
        super();
        this.empresa = empresa;
        this.dimensionDelContenedor= dimensionDelContenedor;
        configurar();
        agregarControles();
    }

    private void configurar(){
        setLayout(layout);
        setBackground(Color.gray);
        int ancho = (int) (dimensionDelContenedor.getWidth() - 43);
        setPreferredSize(new Dimension(ancho, ALTO));
    }

    private void agregarControles(){
        CampoTexto txtId = new CampoTexto(40);
        setUbicacion(txtId, 5,5);
        add(txtId);
    }

    private void setUbicacion(Component componente, int north, int west){
        layout.putConstraint(SpringLayout.NORTH, componente, north, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.WEST, componente, west, SpringLayout.WEST, this);
    }
}
