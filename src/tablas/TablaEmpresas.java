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
        dibujar();
    }

    private void configurar(){
        setLayout(layout);
        setBackground(Color.white);
        int ancho = (int) (dimensionDelContenedor.getWidth() - 26);
        int alto = modeloTablaEmpresas.size()*(FilaEmpresas.ALTO + FilaEmpresas.SEPARACION);
        setPreferredSize(new Dimension(ancho,alto));
    }

    private void dibujar(){
        for (int indice = 0; indice < modeloTablaEmpresas.size();indice++){
             Empresa empresa = modeloTablaEmpresas.get(indice);
             FilaEmpresas fila = new FilaEmpresas(empresa, dimensionDelContenedor);
             int north = (FilaEmpresas.ALTO + FilaEmpresas.SEPARACION) * indice;
             int west = FilaEmpresas.SEPARACION;
             setUbicacion(fila, north, west);
             add(fila);
        }
    }

    private void setUbicacion(Component componente, int north, int west){
        layout.putConstraint(SpringLayout.NORTH, componente, north, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.WEST, componente, west, SpringLayout.WEST, this);
    }
}
