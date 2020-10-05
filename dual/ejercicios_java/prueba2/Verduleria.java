
public class Verduleria {
    public static void main(final String[] args) {
        Client client1 = new Client("Laia", "41077789T", "Laselles 131", "607928492");
        Client client2 = new Client("Oscar", "45738299J", "Alcorcon 121", "607928492");
        Client client3 = new Client("Carlos", "68392639G", "Surinam 411", "607928492");
        Client client4 = new Client("Daniel", "57832912F", "Llagostera 399", "607928492");
        Client client5 = new Client("Marcos", "36482028L", "Villalta 801", "607928492");
        Client client6 = new Client("Sara", "94764834P", "Sensam 495", "607928492");
        Client client7 = new Client("Montse", "55373381M", "Badebarre 888", "607928492");
        Client client8 = new Client("Sergio", "90123847A", "Selecanta 186", "607928492");
        
        //System.out.println(Torn.getCua());
        //System.out.println(Torn.getNumero(client1));

        Torn.assignarTorn(client1);
        Torn.assignarTorn(client2);
        Torn.assignarTorn(client3);
        Torn.assignarTorn(client4);
        Torn.assignarTorn(client5);
        Torn.assignarTorn(client6);
        Torn.assignarTorn(client7);
        Torn.assignarTorn(client8);

        System.out.println(Torn.getCua());

        System.out.println(Torn.getTorn(client6));
        System.out.println(Torn.getNumero(client6));

        System.out.println(Torn.seguentClient());

        Torn.eliminaTorn();

        System.out.println("\n--------------------------------\n");

        System.out.println(Torn.getCua());

        System.out.println(Torn.getTorn(client6));
        System.out.println(Torn.getNumero(client6));

        Torn.eliminaTorn();

        System.out.println(Torn.seguentClient());

        System.out.println("\n--------------------------------\n");

        System.out.println(Torn.getCua());
        System.out.println(Torn.getTorn(client6));
        System.out.println(Torn.getNumero(client6));

        Torn.eliminaTorn();

        System.out.println(Torn.seguentClient());








        

    }
}
