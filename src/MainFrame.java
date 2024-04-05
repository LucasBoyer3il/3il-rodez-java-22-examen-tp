import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    private JFrame fenetre;
    private JPanel panelPrincipal;

    private JPanel deuxiemePanel;

    private JButton boutonAjouter;

    private JButton boutonAfficherTaches;

    private JButton boutonRetour;

    private JLabel titre;

    private JLabel description;

    private JLabel dateEcheance;

    private JLabel priorite;

    private TextField textTitre;

    private TextField textDescription;

    private TextField textDateEcheance;

    private TextField textPriorite;

    private JList listeTaches;

    private JTable tableTaches;

    private JScrollPane  scrollPane;

    private Controller controller;

    private int id;

    private  String[][] donnees;

    public MainFrame(Controller controller) {
        this.controller = controller;
        id = 0;
        fenetre = new JFrame("Gestion des tâches");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocation(200,200);
        fenetre.setSize(300,300);
        fenetre.setVisible(true);

        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        deuxiemePanel = new JPanel();
        deuxiemePanel.setLayout(new BoxLayout(deuxiemePanel, BoxLayout.Y_AXIS));

        listeTaches = new JList();

        titre = new JLabel("titre");
        description = new JLabel("description");
        dateEcheance = new JLabel("Date échéance");
        priorite = new JLabel("Priorite");

        donnees = new String[100][5];

        // Column Names
        String[] columnNames = { "id", titre.getText(), description.getText(), dateEcheance.getText(), priorite.getText() };

        // Initializing the JTable
        tableTaches = new JTable(donnees, columnNames);
        tableTaches.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        scrollPane = new JScrollPane(tableTaches);

        textTitre = new TextField();
        textDescription = new TextField();
        textDateEcheance = new TextField();
        textPriorite = new TextField();

        boutonAjouter = new JButton("Ajouter");
        boutonAjouter.addActionListener(this);

        boutonRetour = new JButton("Retour");
        boutonRetour.addActionListener(this);

        boutonAfficherTaches = new JButton("Afficher tâches");
        boutonAfficherTaches.addActionListener(this);
        panelPrincipal.add(titre);
        panelPrincipal.add(textTitre);
        panelPrincipal.add(description);
        panelPrincipal.add(textDescription);
        panelPrincipal.add(dateEcheance);
        panelPrincipal.add(textDateEcheance);
        panelPrincipal.add(priorite);
        panelPrincipal.add(textPriorite);
        panelPrincipal.add(boutonAjouter);
        panelPrincipal.add(boutonAfficherTaches);

        deuxiemePanel.add(scrollPane);
        deuxiemePanel.add(boutonRetour);
        deuxiemePanel.add(listeTaches);

        fenetre.add(panelPrincipal);
        fenetre.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boutonAjouter) {
            //Ajouter tache à la liste da tâche dans la classe task grâce au controller
            Task tache = new Task(id, textTitre.getText(), textDescription.getText(), textDateEcheance.getText(), textPriorite.getText());
            controller.ajouterTache(tache);
            donnees[id] = new String[]{String.valueOf(id), textTitre.getText(), textDescription.getText(), textDateEcheance.getText(), textPriorite.getText()};
            id++;
            textTitre.setText("");
            textDescription.setText("");
            textPriorite.setText("");
            textDateEcheance.setText("");
        } else if(e.getSource() == boutonAfficherTaches) {
            fenetre.remove(panelPrincipal);
            fenetre.add(deuxiemePanel);
            panelPrincipal.setVisible(false);
            deuxiemePanel.setVisible(true);
            fenetre.show();
        } else if(e.getSource() == boutonRetour) {
            fenetre.remove(deuxiemePanel);
            fenetre.add(panelPrincipal);
            panelPrincipal.setVisible(true);
            deuxiemePanel.setVisible(false);
            fenetre.show();
        }
    }

    public static void main(String[] arg) {
        Vue vue = new Vue();
        Task task = new Task();
        Controller controller = new Controller(task, vue);
        MainFrame fenetrePrincipal = new MainFrame(controller);
    }
}
