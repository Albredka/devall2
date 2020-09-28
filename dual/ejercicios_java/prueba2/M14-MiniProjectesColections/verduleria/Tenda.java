package verduleria;
import java.io.*;
public class Tenda {
	static BufferedReader reader;
	public static void main(String[] args) throws IOException{
		reader = new BufferedReader(new InputStreamReader(System.in));
		//Heu de definir una variable que serà la cua. 
		//Heu de decidir la cua de què serà? Quins elements contindrà la cua?
		//Quin tipus de dades?

		//TODO Definició dades

		//Pintar menu
		int operacio=0;	
		while(operacio!=5){
			System.out.println("---VERDURES AUSTRIA ----");
			System.out.println("1) Afegir cua ");
			System.out.println("2) Quanta gent hi ha ");
			System.out.println("3) LListar cua");
			System.out.println("4) Següent");
			System.out.println("5) Sortir");
			String linia = reader.readLine();
			switch(linia){
			case "1":
				//TODO Afegir argument que correspongui
				if (afegirClient()){
					//TODO Completar missatge se li ha de dir el torn. Si sóc l'últim, m'afegeixo a la cua i llavors hi ha 5 persones. Quin és el meu torn?
					System.out.println("Client afegit, tens el torn ");
				}
				else{
					System.out.println("Ha hagut un problema amb la inserció del client, torna-ho a provar. Disculpa.");
				}
				break;
			case "2":
				//TODO Pintar quants elements hi ha a la cua. Quin és l'equivalent al length dels arrays?
				break;
			case "3":
				//TODO Pintar tots els clients de la cua. Amb un ArrayList ens cal pintar element a element, en un for? Quin mètode ens ho pinta tot? O no és un mètode?
				break;
			case "4":
				//TODO Si la cua és més gran que zero es diu el nom del següent client i se'l treu de la cua 
				break;
			default:
				operacio=5;
				System.out.println("Adeu, bon dia tingui!");
			}
		}

	}

	//Creació d'un nou mètode que afegeix un Client a la cua. 
	//TODO Rep el scanner ha de rebre alguna cosa més?
	public static boolean afegirClient(){
		try{
			System.out.println("Quin és el nom del client?");
			String nom = reader.readLine();

			System.out.println("Quin és el dni del client?");
			String dni = reader.readLine();


			System.out.println("Quin és la direcció del client?");
			String direccio = reader.readLine();

			//TODO Aquí s'ha de crear el nou client 

			//TODO S'ha d'afegir el nou client a la cua

			//Si falla per excepció ja no tornarà true
			return true;
		}
		catch(Exception e){
			return false;
		}
	}	

}
