

public class Hora implements Comparable <Hora> {
    
    private int hora;
    private int minut;
    private int segon;


    // Constructors

    public Hora() {

        hora = 0;
        minut = 0;
        segon = 0;

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

        String missatge = String.format("'%d:%02d:%02d%n'", getHora(), getMinut(), getSegon());
        
        return missatge;
        
    }

    @Override
    public int compareTo(Hora arg0) {
        
        return 0;
    }

    // Overloads

   
    public String toString(String inicial) {

        String missatge = String.format("'%d:%02d:%02d%n'", hora, minut, segon);
        
        return missatge;
    }

    public void decrementa(int segons){
        int[] horaX = ajustaDecrement(this.hora, this.minut, this.segon-segons+1);
        
        setHora(horaX[0]);
        setMinut(horaX[1]);
        setSegon(horaX[2]);
    }

    // Methods

    public int[] ajustaIncrement(int hora, int minut, int segon){
        if (segon == 60){

            if (minut == 59){

                if (hora == 24){
                    hora = 0;
                    minut = 00;
                    segon = 00;

                } else {
                    hora += 1;
                    minut = 00;
                    segon = 00;
                }

            } else {
                minut += 1;
                segon = 00;
            }

        } else {
            segon += 1;
        }

        int[] horaX = {hora, minut, segon};

        return horaX;
    }

    public int[] ajustaDecrement(int hora, int minut, int segon){
        if (segon < 1){

            if (minut < 1){

                if (hora < 1){
                    hora = 23;
                    minut = 59;
                    segon = 59;

                } else {
                    hora -= 1;
                    minut = 59;
                    segon = 59;
                }

            } else {
                minut -= 1;
                segon = 59;
            }

        } else {
            segon -= 1;
        }

        int[] horaX = {hora, minut, segon};

        return horaX;
    }

    public void incrementa(){
        int[] horaX = ajustaIncrement(this.hora, this.minut, this.segon+1);
        
        setHora(horaX[0]);
        setMinut(horaX[1]);
        setSegon(horaX[2]);
    }

    public void decrementa(){
        int[] horaX = ajustaDecrement(this.hora, this.minut, this.segon-1);
        
        setHora(horaX[0]);
        setMinut(horaX[1]);
        setSegon(horaX[2]);
    }

    public void seguent(int hora){
        
    }


    public static void main(String[] args) {

        // Instancies
        Hora horaMati = new Hora(8, 2, 7);
        Hora horaTarda = new Hora(17, 59, 59);
        Hora horaNoche = new Hora(23, 59, 59);
        Hora horaPerDefecte = new Hora();

        System.out.println(horaTarda.toString("L'hora de la tarda es: "));

        System.out.println("------------------");

        horaTarda.incrementa();

        System.out.println(horaTarda.toString("L'hora de la tarda es: "));

        horaTarda.decrementa();

        System.out.println(horaTarda.toString("L'hora de la tarda es: "));

        horaTarda.decrementa(41);

        System.out.println(horaTarda.toString("L'hora de la tarda es: "));

        System.out.println(horaPerDefecte.toString());

    }
} 

