import java.util.ArrayList;

public class Torn {
    
    protected static int torn;
    protected static ArrayList <Client> cua = new ArrayList<Client>();

    // Getters

    public static int getNumero(Client cli) {
        int var = cua.indexOf(cli) +1;
        
        if (var == -1){
            System.out.println("No es troba en la cua");
            return var;
        }
        return var;
    }

    // No hecho

    public static int getTorn(Client cli) {
        return torn;
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

    public static void setTorn(final int nouTorn) {
        torn = nouTorn;
    }

    // Methods
 
    public int generaTorn() {
        for(int i = 0; i < 1000000; i++) {
            torn = i;
        }
        return torn;
    }

    public static void assignarTorn(Client cli) {

        setTorn(torn);
        cua.add(cli);
    }
}

