import java.util.ArrayList;

public class Client {
    
    protected String nom;
    protected String DNI;
    protected String direccio;
    protected String telefon;

    ArrayList <Client> clients = new ArrayList<Client>();

    public Client(String nom, String DNI, String direccio, String telefon){
        this.nom= nom;
        this.DNI = DNI;
        this.direccio = direccio;
        this.telefon = telefon;
    }

    @Override
    public String toString(){
        return "[dni = " + DNI + ", nom = " + nom + ", direccio = " + direccio + "telefon = " + String.valueOf(telefon) + "]";
    }

    // Getters

    public String getNom(){
        return nom;
    }

    public String getDNI(){
        return DNI;
    }

    public String getDireccio(){
        return direccio;
    }

    public String getTelefon(){
        return telefon;
    }

    // Setters

    public void setNom(final String nouNom) {
        this.nom = nouNom;

    }

    public void setDNI(final String nouDNI) {
        this.DNI = nouDNI;

    }

    public void setDireccio(final String nouDireccio) {
        this.direccio = nouDireccio;
    }

    public void setTelefon(final String nouTelefon) {
        this.telefon = nouTelefon;

    }

}

