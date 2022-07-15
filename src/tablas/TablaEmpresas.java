package tablas;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TablaEmpresas extends JPanel {
    SpringLayout layout = new SpringLayout();
    List<Empresa> modeloTablaEmpresas;
    Dimension dimensionDelContenedor;

    public TablaEmpresas(List<Empresa> modeloTablaEmpresas, Dimension dimensionDelContenedor){
        super();
        this.modeloTablaEmpresas = modeloTablaEmpresas;
        this.dimensionDelContenedor = dimensionDelContenedor;
        configurar();

    }

    private void configurar(){
        setLayout(layout);
        setBackground(Color.white);
        int ancho = (int) (dimensionDelContenedor.getWidth() - 26);
        int alto = (int) (dimensionDelContenedor.getHeight() - 100);
        setPreferredSize(new Dimension(ancho,alto));
    }

    private void rellenar(){
        for (Empresa empresa:modeloTablaEmpresas) {
            FilaEmpresas fila = new FilaEmpresas(empresa, dimensionDelContenedor);
        }
    }

    private void setUbicacion(Component componente, int north, int west){
        layout.putConstraint(SpringLayout.NORTH, componente, north, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.WEST, componente, west, SpringLayout.WEST, this);
    }
}
