import javax.swing.*;
import java.awt.*;

public class Sistema_Cobraca extends JFrame {
    private JPanel rootPanel;


    public Sistema_Cobraca() {
        setContentPane(rootPanel);
        setSize(1080, 720);
        setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
