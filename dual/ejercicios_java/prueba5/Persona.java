
public class Persona {
    
    private String nom;
    private String cognom1;
    private String cognom2;
    private int edat;
    private int anyNaixement;
    private int anyDefunció;

    public Persona(String nom,  String cognom1, String cognom2, int anyNaixement){
        this.edat = getAnyActual() - anyNaixement;
        if(edatValida(edat) == false){
            this.anyDefunció = getAnyActual();
        }
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.anyNaixement = 2020 - anyNaixement > 0 ? anyNaixement : 2020; // l'any de naixement haurà de ser sempre un enter positiu
        this.anyDefunció = -1;
    }

    public Persona(String nom, String cognom1, String cognom2, int anyNaixement, int anyDefunció) {
        this.nom = nom;
        this.edat = anyDefunció - anyNaixement;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.anyNaixement = 2020 - anyNaixement > 0 ? anyNaixement : 2020; // l'any de naixement haurà de ser sempre un enter positiu
        this.anyDefunció = anyDefunció > anyNaixement ? anyDefunció : anyNaixement;                                   
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

    public static int getAnyActual(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    }

    public int getEdat(){
        return this.edat;
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

    public void setViu(int anyDefunció){
        this.anyDefunció = -1;
    }

    public void setEdat(int edat){
        if (edatValida(edat)){
            this.edat = edat;
        }
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

    public boolean edatValida(int edat){
        return edat >= 1 && edat <= 120 ? true : false;
    }


    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", cognom1='" + getCognom1() + "'" +
            ", cognom2='" + getCognom2() + "'" +
            ", edat= '" + getEdat() + "'" +
            ", anyNaixement='" + getAnyNaixement() + "'" +
            ", anyDefunció='" + getAnyDefunció() + "'" +
            "}";
    }

    public static void main(String[] args) {

        Persona persona1 = new Persona("Dani", "Torres", "Fernandez", 1993, 2023);
        Persona persona2 = new Persona("Dani", "Marmol", "Fernandez", 1992);
        Persona persona3 = new Persona("Albert", "Campos", "Gisbert", 2000);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }
}
