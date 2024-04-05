import java.util.ArrayList;
import java.util.List;

public class Controller implements Interface{
    private Task tache;

    private Vue vue;

    private List<Task> listeTaches;

    public Controller(Task tache, Vue vue) {
        this.tache= tache;
        this.vue = vue;
        listeTaches = new ArrayList<>();
    }

    @Override
    public void ajouterTache(Task tache) {
        listeTaches.add(tache);
    }

    @Override
    public void modifierTache(Task tache) {

    }

    @Override
    public void supprimerTache(Task tache) {

    }

    @Override
    public List<Task> getTaches() {
        return null;
    }
}
