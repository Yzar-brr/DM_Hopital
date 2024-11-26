import java.util.ArrayList;
import java.util.List;

public class Hopital {
    private String nom;
    private List<Patient> patients;
    private List<Medecin> medecins;
    private List<Consultation> consultations;
    private RendezVous rendezVous;
    

    public Hopital(String nom) {
        this.nom = nom;
        this.patients = new ArrayList<>();
        this.medecins = new ArrayList<>();
        this.consultations = new ArrayList<>();
        this.rendezVous = null;
    }

    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }

    public void ajouterMedecin(Medecin medecin) {
        medecins.add(medecin);
    }

    public void afficherPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void afficherMedecins() {
        for (Medecin medecin : medecins) {
            System.out.println(medecin);
        }
    }

    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation);
        System.out.println("Consultation créer pour : " + consultation.getNom());
    }

    public void ajouterRendezVous(RendezVous rendezVous) {
        this.rendezVous = rendezVous;
        System.out.println("Rendez-vous ajouté : " + rendezVous.getPatient() + " avec " + rendezVous.getMedecin() + " le " + rendezVous.getDate());
    }

    public void afficherRendezVous() {
        if (rendezVous != null) {
            rendezVous.afficherRendezVous();
        } else {
            System.out.println("Aucun rendez-vous à afficher.");
        }
    }


    public void calculerStatistiques() {
        int patientsGueri = 0;
        int patientsMalade = 0;
        for (Patient patient : patients) {
            if (patient.getStatusGueri()) {
                patientsGueri++;
            } else {
                patientsMalade++;
            }
        }
        System.out.println("Patients guéris : " + patientsGueri);
        System.out.println("Patients malades : " + patientsMalade);
    }


}
