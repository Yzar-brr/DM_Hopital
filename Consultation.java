
import java.util.Date;

public class Consultation {
    private Date date;
    private String diagnostic;
    private String traitement;
    private Medecin medecin;
    private Patient patient;

    public Consultation(Date date, String diagnostic, String traitement, Medecin medecin, Patient patient) {
        this.date = date;
        this.diagnostic = diagnostic;
        this.traitement = traitement;
        this.medecin = medecin;
        this.patient = patient;
    }

    public String getNom(){
        return patient.getNom();
    }

    public Date getDate() {
        return date;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public String getTraitement() {
        return traitement;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
