

public class ProvaFitxes
{
   public static void main(String args[])
   {
      Revista r = new Revista("MC001","Mundo Científico", 2005, 1);
      Obra o = new Obra("EQ001","El Quixot","Miguel de Cervantes",1000);
      Volum v1 = new Volum("EC001","Enciclopèdia Catalana","Varis",573,1);
      Volum v2 = new Volum("EC002","Enciclopèdia Catalana","Varis",602,2);

      System.out.println("\nVisualització de la revista r:\n");
      r.visualitzar();
      System.out.println("\nVisualització de l'obra o:\n");
      o.visualitzar();
      System.out.println("\nVisualització del volum v1:\n");
      v1.visualitzar();
      System.out.println("\nVisualització del volum v2:\n");
      v2.visualitzar();
   }
}