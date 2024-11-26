public class Infirmier extends Personnel {
    public String unite;
    public Infirmier(String nom, String prenom, double salaire, String unite) {
        super(nom, prenom, salaire);
        this.unite = unite;
    }
    public String getUnite() {
        return unite;
    }
}
