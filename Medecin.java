public class Medecin extends Personnel {
    private final String nom;
    private final String specialite;
    

    public Medecin(String nom, String specialite, String prenom, double salaire) {
        super(nom, prenom, salaire);
        this.nom = nom;
        this.specialite = specialite;
    }

    @Override
    public void travailler() {
        System.out.println("Le médecin " + getNom() + " " + getPrenom() + " a des consultations avec des patients.");
    }

    @Override
    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void soigner(Patient patient) {
        System.out.println("Le médecin " + nom + " soigne le patient " + patient.getNom() + " pour " + patient.getMaladie());
        patient.setMaladie("Guéri");
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "nom='" + nom + '\'' +
                ", specialite='" + specialite + '\'' +
                '}';
    }
}