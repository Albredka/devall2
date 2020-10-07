public class Aposta {

        protected String dni;
        protected int golsLocals;
        protected int golsVisitants;

        // Constructor
        public Aposta(String dni, int golsLocals, int golsVisitants){
            this.dni = dni;
            this.golsLocals = golsLocals;
            this.golsVisitants = golsVisitants;

        }

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