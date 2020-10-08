public class Aposta {

        protected String dni;
        protected int golsLocals;
        protected int golsVisitants;
        protected int id;

        // Constructor
        public Aposta(String dni, int golsLocals, int golsVisitants){
            this.dni = dni;
            this.golsLocals = golsLocals;
            this.golsVisitants = golsVisitants;

        }

        //HashCode method

        @Override
        public int hashCode(){

            final int A = this.golsLocals * 1000;
            final int B = this.golsVisitants + 20;

            this.id = A+B;
            return this.id;
        }

        
        // public boolean equals(Aposta aposta){
        //     if(aposta.id == this.id){
        //         return true;
        //     } else {
        //         return false;
        //     }
        // }

        // Getters

        public static String getDni(Aposta aposta) {
            return aposta.dni;
        }

        public static int getGolsLocals(Aposta aposta) {
            return aposta.golsLocals;
        }

        public static int getGolsVisitants(Aposta aposta) {
            return aposta.golsVisitants;
        }


        // Metodes

        public static void afegirAposta(Aposta aposta) {
            Porres.porra.add(aposta);

        }
    }