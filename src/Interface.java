import java.util.List;

public interface Interface {
    public void ajouterTache(Task tache); //Pour ajouter une nouvelle tâche.
    public void modifierTache(Task tache); //Pour modifier une tâche existante.
    public void supprimerTache(Task tache); //Pour supprimer une tâche.
    public List<Task> getTaches(); //Pour obtenir la liste de toutes les tâches.
}
