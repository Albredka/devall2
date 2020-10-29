

public abstract class Fitxa
{
   protected String referencia;
   protected String titol;

   public Fitxa (String Ref, String Tit)
   {
      referencia = Ref;
      titol = Tit;
   }

   public Fitxa (Fitxa f)
   {
      this(f.referencia, f.titol);
   }

   public boolean equals (Object obj)
   {
      if (obj == this) return true;
      if (obj == null) return false;
      if (obj instanceof Fitxa) return referencia.equals(((Fitxa)obj).referencia);
      return false;
   }
 
   public void setReferencia (String NovaRef)
   {
      referencia = NovaRef;
   }

   public void setTitol (String NouTit)
   {
      titol = NouTit;
   }

   public String getReferencia ()
   {
      return referencia;
   }

   public String getTitol ()
   {
      return titol;
   }
   
   public void visualitzar ()
   {
      System.out.println("Referència.....:" + referencia);
      System.out.println("Títol..........:" + titol);
   }
   
   public String toString()
   {
      return referencia + " - " + titol;
   }
}