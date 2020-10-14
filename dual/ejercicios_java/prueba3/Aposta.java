

public class Aposta {

        private String dni;
        private int golsLocals;
        private int golsVisitants;
        private int id;

        // Constructor
        public Aposta(String dni, int golsLocals, int golsVisitants){
            this.dni = dni;
            this.golsLocals = golsLocals;
            this.golsVisitants = golsVisitants;

        }

        //HashCode method

        @Override
        public int hashCode() {

            final int A = this.golsLocals * 1000;
            final int B = this.golsVisitants + 20;

            this.id = A+B;
            return this.id;
        }

        
        @Override
        public boolean equals(Object obj){

            Aposta aposta2 = (Aposta) obj;

            if(this.hashCode()==aposta2.hashCode()){
                return true;

            } else {
                return false;
            }

        }

        @Override
        public  String toString(){

            return this.dni + " " + this.golsLocals + " " + this.golsVisitants;
        }

        
        // public boolean equals(Aposta aposta){
        //     if(aposta.id == this.id){
        //         return true;
        //     } else {
        //         return false;
        //     }
        // }

        // Getters

        public String getDni() {
            return this.dni;
        }

        public int getGolsLocals() {
            return this.golsLocals;
        }

        public int getGolsVisitants() {
            return this.golsVisitants;
        }


        // Metodes

        public static void afegirAposta(Aposta aposta) {
            Porres.porra.add(aposta);

        }
    }