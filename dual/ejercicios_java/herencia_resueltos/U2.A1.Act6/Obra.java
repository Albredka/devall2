
public class Obra extends Fitxa
{
   protected String autor;
   protected short nrePags;

   public Obra (String Ref, String Tit, String Aut, int NrePags)
   {
      super(Ref,Tit);
      autor = Aut;
      if (NrePags>0 && NrePags<=Short.MAX_VALUE) nrePags=(short)NrePags;
      else nrePags=0;
   }

   public Obra (Obra f)
   {
      this(f.referencia, f.titol, f.autor, f.nrePags);
   }

   public void setAutor (String NouAutor)
   {
      autor = NouAutor;
   }
   
   public void setNumPags (int NouNrePags)
   {
      if (NouNrePags>0 && NouNrePags<=Short.MAX_VALUE) nrePags=(short)NouNrePags;
   }

   public String getAutor ()
   {
      return autor;
   }

   public int getNrePags ()
   {
      return nrePags;
   }
   
   public void visualitzar()
   {
      super.visualitzar();
      System.out.println("Autor..........:" + autor);
      System.out.println("Nombre Pàgines.:" + nrePags);
   }
}