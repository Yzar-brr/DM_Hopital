public class RendezVous {
    private String patient;
    private String medecin;
    private String date;

    // Constructeur
    public RendezVous(String patient, String medecin, String date) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
    }

    // Getters
    public String getPatient() {
        return patient;
    }

    public String getMedecin() {
        return medecin;
    }

    public String getDate() {
        return date;
    }

    // Afficher les informations du rendez-vous
    public void afficherRendezVous() {
        System.out.println("Rendez-vous pour " + patient + " avec " + medecin + " le " + date);
    }
}