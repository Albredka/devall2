

public class Volum extends Obra
{
   private short nro;
   
   public Volum (String Ref, String Tit, String Aut, int NrePags, int Nro)
   {
      super(Ref,Tit,Aut,NrePags);
      if (Nro<0 || Nro>Short.MAX_VALUE) nro=0;
      else nro=(short)Nro;
   }

   public Volum(Volum f)
   {
      this(f.referencia, f.titol, f.autor, f.nrePags, f.nro);
   }

   public void setNro (int NouNro)
   {
      if (NouNro>0 && NouNro<=Short.MAX_VALUE) nro=(short)NouNro;
   }

   public int getNro ()
   {
      return nro;
   }
   
   public void visualitzar()
   {
      super.visualitzar();
      System.out.println("Número Volum...:" + nro);
   }      
}