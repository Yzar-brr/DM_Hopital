public class Patient {
    private String nom;
    private int age;
    private String maladie;
    private boolean estGueri;

    public Patient(String nom, int age, String maladie, boolean estGueri) {
        this.nom = nom;
        this.age = age;
        this.maladie = maladie;
        this.estGueri = estGueri;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public boolean getStatusGueri() {
        return estGueri;
    }

    public void setEstGueri(boolean estGueri) {
        this.estGueri = estGueri;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", maladie='" + maladie + '\'' +
                ", estGueri=" + estGueri +
                '}';
    }
}
