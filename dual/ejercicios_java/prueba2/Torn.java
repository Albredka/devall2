
import java.util.ArrayList;


public class Torn {
    
    protected static ArrayList <Client> cua = new ArrayList<Client>();

    // Getters

    public static int getNumero(Client cli) {
        return cli.numero;
    }

    public static int getTorn(Client cli) {
        setTorn(cli);
        return cli.torn;
    }

    public static int getCua() {
        return cua.size();
    }

    public static String getClients() {
        String llistat = "";
        
        for(int i = 0; i < cua.size(); i++){
            llistat = llistat + (cua.get(i)).toString() + "\n";
        }

        return llistat;
    }

    // Setters

    public static void setTorn(Client cli) {
        
        cli.torn = cua.indexOf(cli); 
    }

    public static void setNumero(Client cli){
        cli.numero = cua.size()+1;
    }

    // Methods

    public static void assignarTorn(Client cli) {

        setTorn(cli);
        setNumero(cli);
        cua.add(cli);
    }

    public static void eliminaTorn(){
        cua.remove(0);
    }

    public static void eliminaTorn(Client cli){
        cua.remove(cli);
    }

    public static String seguentClient(){
        
        return cua.get(0).nom;
    }

}

