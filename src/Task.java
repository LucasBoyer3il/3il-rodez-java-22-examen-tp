public class Task {
    private int id; //Un identifiant unique (entier) pour chaque tâche
    private String titre; //Le titre de la tâche.
    private String description; //La description de la tâche.
    private String dateEcheance; //La date d’échéance de la tâche.
    private String priorite; //La priorité de la tâche (haute, moyenne, basse, etc.

    public Task(int id, String titre, String description, String dateEcheance, String priorite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.priorite = priorite;
    }

    //TODO : Des méthodes pour effectuer des opérations sur les tâches, telles que la comparaison, la validation, etc.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(String dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }
}
