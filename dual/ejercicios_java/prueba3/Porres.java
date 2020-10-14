

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Porres implements Comparable <Porres>{

    static HashSet <Aposta> porra = new HashSet<Aposta>();

    public static void porres(){

        Iterator <Aposta> iterator = porra.iterator();

        System.out.println("");
        System.out.println("Llista de porres");
        System.out.println("-----------------");

        while(iterator.hasNext()){

            Aposta aposta = iterator.next();
            
            System.out.println(aposta.toString());
        }

        System.out.println("-----------------");

        // int contador = 0;

        // for (Aposta aposta : porra){
        //     contador += 1;

        //     System.out.println(contador + ". " + aposta.dni + " " + aposta.golsLocals + " " + aposta.golsVisitants);
        // }
    }

    public String ordenaPorres(){
        TreeSet<Aposta> apostesOrdenades = new TreeSet<Aposta>();

        return "hola";

    }

    @Override
    public int compareTo(Aposta aposta) {
        int golsLocals = this.golsLocals;

        if(this.equals(aposta)){
            return 0;
        } else {
            if(this.golsLocals == aposta.getGolsLocals()){
                if(this.getGolsVisitants() > aposta.getGolsVisitants()){
                    return 1;
                } else { 
                    return -1;
                }
            } else if(this.getGolsLocals() > aposta.getGolsLocals()){
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String args[]){

        Aposta aposta1 = new Aposta("17422562S", 1, 1);
        Aposta aposta2 = new Aposta("69061956V", 1, 2);
        Aposta aposta3 = new Aposta("55372615T", 1, 3);
        Aposta aposta4 = new Aposta("39467020D", 1, 4);
        Aposta aposta5 = new Aposta("22678352F", 1, 5);
        Aposta aposta6 = new Aposta("50863156J", 2, 1); // repetida
        Aposta aposta7 = new Aposta("73114980G", 2, 1); // repetida
        Aposta aposta8 = new Aposta("15487718R", 2, 2);
        Aposta aposta9 = new Aposta("46168956K", 2, 3);
        Aposta aposta10 = new Aposta("09650772H", 3, 2); // repetida
        Aposta aposta11 = new Aposta("83112590C", 2, 5);
        Aposta aposta12 = new Aposta("42215011Y", 3, 1);
        Aposta aposta13 = new Aposta("55358622Z", 3, 2); // repetida
        Aposta aposta14 = new Aposta("93144260X", 3, 3);
        Aposta aposta15 = new Aposta("75935983B", 3, 4);
        Aposta aposta16 = new Aposta("47986312D", 4, 1);
        Aposta aposta17 = new Aposta("74372221L", 4, 2);
        Aposta aposta18 = new Aposta("10614177E", 4, 3);
        Aposta aposta19 = new Aposta("90314465C", 4, 4);

        porra.add(aposta1);
        porra.add(aposta2);
        porra.add(aposta3);
        porra.add(aposta4);
        porra.add(aposta5);
        porra.add(aposta6);
        porra.add(aposta7);
        porra.add(aposta8);
        porra.add(aposta9);
        porra.add(aposta10);
        porra.add(aposta11);
        porra.add(aposta12);
        porra.add(aposta13);
        porra.add(aposta14);
        porra.add(aposta15);
        porra.add(aposta16);
        porra.add(aposta17);
        porra.add(aposta18);
        porra.add(aposta19);

        porres();
        

        //System.out.println(porra);
        
    }

    
}
