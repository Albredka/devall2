public class Aposta {

        protected String dni;
        protected int golsLocals;
        protected int golsVisitants;

        // Constructor
        public aposta(String dni, int golsLocals, int golsVisitants){
            this.dni = dni;
            this.golsLocals = golsLocals;
            this.golsVisitants = golsVisitants;

        }

        // Getters

        public static String getDni(Apostes aposta) {
            return aposta.dni;
        }

        public static String getGolsLocals(Apostes aposta) {
            return aposta.golsLocals;
        }

        public static String getGolsVisitants(Apostes aposta) {
            return aposta.golsVisitants;
        }


        // Metodes

        public static void afegirAposta(Apostes aposta) {
            Porres.porra.add(aposta);

        }
    }