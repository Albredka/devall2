
public class Persona {
    
    static String nom;
    static String cognom1;
    static String cognom2;
    static int anyNaixement;
    static int anyDefunció;

    public Persona() {
    }

    public Persona(String nom, String cognom1, String cognom2, int anyNaixement, int anyDefunció) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.anyNaixement = anyNaixement;
        this.anyDefunció = anyDefunció;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return this.cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return this.cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public int getAnyNaixement() {
        return this.anyNaixement;
    }

    public void setAnyNaixement(int anyNaixement) {
        this.anyNaixement = anyNaixement;
    }

    public int getAnyDefunció() {
        return this.anyDefunció;
    }

    public void setAnyDefunció(int anyDefunció) {
        this.anyDefunció = anyDefunció;
    }

    public Persona nom(String nom) {
        this.nom = nom;
        return this;
    }

    public Persona cognom1(String cognom1) {
        this.cognom1 = cognom1;
        return this;
    }

    public Persona cognom2(String cognom2) {
        this.cognom2 = cognom2;
        return this;
    }

    public Persona anyNaixement(int anyNaixement) {
        this.anyNaixement = anyNaixement;
        return this;
    }

    public Persona anyDefunció(int anyDefunció) {
        this.anyDefunció = anyDefunció;
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof Persona)) {
    //         return false;
    //     }
    //     Persona persona = (Persona) o;
    //     return Objects.equals(nom, persona.nom) && Objects.equals(cognom1, persona.cognom1) && Objects.equals(cognom2, persona.cognom2) && anyNaixement == persona.anyNaixement && anyDefunció == persona.anyDefunció;
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(nom, cognom1, cognom2, anyNaixement, anyDefunció);
    // }

    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", cognom1='" + getCognom1() + "'" +
            ", cognom2='" + getCognom2() + "'" +
            ", anyNaixement='" + getAnyNaixement() + "'" +
            ", anyDefunció='" + getAnyDefunció() + "'" +
            "}";
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Dani", "Torres", "Fernandez", 1993, 2023);

        System.out.println(persona1.toString());
    }

}
