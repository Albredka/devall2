import java.util.ArrayList;

public class Verduleria {

    public class Client{
        protected String nom;
        protected String DNI;
        protected String direccio;
        protected int telefon;

        ArrayList <Client> clients = new ArrayList<Client>();

        public void Client(){
            clients.add(new Client());
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

        public int getTelefon(){
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

        public void setTelefon(final int nouTelefon) {
            this.telefon = nouTelefon;

        }

    }

    public class Torn {
        protected int numero;
        protected String torn;
        ArrayList <Torn> cua = new ArrayList<Torn>();

        public void Torn(final Client cli) {

            Object client;

            client = cli;

        }

        // Getters

        public int getNumero() {
            return numero;

        }

        public String getTorn() {
            return torn;

        }

        // Setters

        public void setNumero(final int nouNumero) {
            this.numero = nouNumero;
        }

        public void setTorn(final String nouTorn) {
            this.torn = nouTorn;
        }
    }

    public static void main(final String[] args) {

    }
}
