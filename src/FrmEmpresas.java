import tablas.Empresa;
import tablas.TablaEmpresas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FrmEmpresas extends JFrame {

    int ALTO = 400;
    int ANCHO = 400;
    Dimension dimension = new Dimension(ANCHO, ALTO);

    SpringLayout layout = new SpringLayout();
    TablaEmpresas tablaEmpresas;

    public FrmEmpresas(){
        super("Empresas de seguridad");
        configurar();
        agregarTabla();
        setVisible(true);
    }

    private void configurar(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(dimension);
        setLocationRelativeTo(null);
        setLayout(layout);
        setBackground(new Color(217,217,217));
    }

    private void agregarTabla(){
         ArrayList<Empresa> modeloTablaEmpresas = cargarModeloTablaEmpresas();
         tablaEmpresas = new TablaEmpresas(modeloTablaEmpresas, dimension);
         JScrollPane scrollPane = new JScrollPane(tablaEmpresas);
         scrollPane.setPreferredSize (new Dimension(ANCHO - 15, ALTO - 92));
         scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
         scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
         scrollPane.getVerticalScrollBar().setUnitIncrement(10);
         setUbicacion(scrollPane, 55,0);
         add(scrollPane);
    }

    private ArrayList<Empresa> cargarModeloTablaEmpresas(){
        ArrayList<Empresa> modeloTablaEmpresas = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            Empresa empresa = new Empresa("E" + i, "Empresa " + i);
            modeloTablaEmpresas.add(empresa);
        }
        return modeloTablaEmpresas;
    }

    private void setUbicacion(Component componente, int north, int west){
        layout.putConstraint(SpringLayout.WEST, componente, west, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, componente, north, SpringLayout.NORTH, this);
    }
}
