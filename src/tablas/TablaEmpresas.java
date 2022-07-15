package tablas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TablaEmpresas extends JPanel {
    SpringLayout layout = new SpringLayout();
    List<Empresa> empresas = new ArrayList<Empresa>();

    public TablaEmpresas(){
        super();
        FilaEmpresas fila = new FilaEmpresas();
        setUbicacion(fila, 5,5);
        add(fila);
    }

    private void configurar(){
        setLayout(layout);
        setBackground(Color.white);
        setPreferredSize(new Dimension(700,500));
    }

    private void setUbicacion(Component componente, int north, int west){
        layout.putConstraint(SpringLayout.NORTH, componente, north, SpringLayout.NORTH, this);
        layout.putConstraint(SpringLayout.WEST, componente, west, SpringLayout.WEST, this);
    }

    private void agregarFila(String id, String nombre){
        Empresa empresa = new Empresa(id, nombre);
        empresas.add(empresa);
    }
}
