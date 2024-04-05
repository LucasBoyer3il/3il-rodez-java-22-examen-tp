import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    private JFrame fenetre;
    private JPanel panelPrincipal;

    private JPanel deuxiemePanel;

    private JButton boutonAjouter;

    public MainFrame() {
        fenetre = new JFrame();
        panelPrincipal = new JPanel();
        deuxiemePanel = new JPanel();
        boutonAjouter = new JButton("Ajouter");
        boutonAjouter.addActionListener(this);

        panelPrincipal.add(boutonAjouter);
        fenetre.add(panelPrincipal);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] arg) {
        MainFrame fenetrePrincipal = new MainFrame();
        fenetrePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetrePrincipal.setLocation(200,200);
        fenetrePrincipal.pack();
        fenetrePrincipal.setVisible(true);
    }
}
