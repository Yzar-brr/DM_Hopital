public abstract class Personnel {

    private String nom;
    private String prenom;
    private double salaire;

    public Personnel(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public abstract void travailler();

    public String getNom() {
        return this.nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }

    public double getSalaire() {
        return this.salaire;
    }
    
}
