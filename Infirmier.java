public class Infirmier extends Personnel {
    public String unite;
    public Infirmier(String nom, String prenom, double salaire, String unite) {
        super(nom, prenom, salaire);
        this.unite = unite;
    }

    @Override
    public void travailler() {
        System.out.println("L'infirmier " + getNom() + " " + getPrenom() + " prend soin des patients.");
    }

    
    public String getUnite() {
        return unite;
    }
}
