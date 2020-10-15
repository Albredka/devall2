
public class Hora implements Comparable <Hora> {
    
    private static int hora;
    private static int minut;
    private static int segon;


    // Constructors

    public Hora() {

        hora = 0;
        minut = 00;
        segon = 00;

    }

    public Hora(final int hora, final int minut, final int segon) {

        this.hora = hora;
        this.minut = minut;
        this.segon = segon;

    }


    // Getters

    public int getHora() {
        return this.hora;
    }

    public int getMinut() {
        return this.minut;
    }

    public int getSegon() {
        return this.segon;
    }


    // Setters 

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setMinut(int minut){
        this.minut = minut;
    }

    public void setSegon(int segon){
        this.segon = segon;
    }


    // Overrides

    @Override
    public String toString() {
        return "{" + " hora='" + getHora() + "'" + ", minut='" + getMinut() + "'" + ", segon='" + getSegon() + "'"
                + "}";
    }

    @Override
    public int compareTo(Hora arg0) {
        
        return 0;
    }

    // Overloads

    @overload
    public static String toString(String inicial) {
        return "{" + inicial + 
            " hora= " + hora +
            ", minut= " + minut + "'" +
            ", segon= " + segon + "''" +
            "}";
    }

    @Overload
    public void decrementa(int){

    }

    // Methods

    public void incrementa(){

    }


    public void seguent(int){
        return 0;
    }


    public void decrementa(){

    }


    public static void main(String[] args) {
        System.out.println(toString("La hora de la tarda es:"));
    }

    
}

