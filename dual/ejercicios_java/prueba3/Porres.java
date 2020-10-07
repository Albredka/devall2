import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.graalvm.compiler.hotspot.replacements.HashCodeSnippets;

public class Porres {

    static HashSet <Aposta> porra = new HashSet<Aposta>();
    static Iterator <Aposta> iterator = porra.iterator();
 
    // HashCode method

    @Override
    public int hashCode(){

        final int a = this.golsLocals * 1000;
        final int b = this.golsVisitants + 20;

        return a+b;
    }

    public static void main(String args[]){

        Aposta aposta1 = new Aposta("17422562S", 1, 1);
        Aposta aposta2 = new Aposta("69061956V", 1, 2);
        Aposta aposta3 = new Aposta("55372615T", 1, 3);
        Aposta aposta4 = new Aposta("39467020D", 1, 4);
        Aposta aposta5 = new Aposta("22678352F", 1, 5);
        Aposta aposta6 = new Aposta("50863156J", 2, 1);
        Aposta aposta7 = new Aposta("73114980G", 2, 1);
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

        HashCode(aposta1);
    }
}
