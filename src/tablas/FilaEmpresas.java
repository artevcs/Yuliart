package tablas;

import javax.swing.*;
import java.awt.*;

public class FilaEmpresas extends JPanel {

    SpringLayout layout = new SpringLayout();

    public FilaEmpresas(){
        super();
        setLayout(layout);
        setBackground(Color.gray);
        setPreferredSize(new Dimension(600,40));
    }
}
