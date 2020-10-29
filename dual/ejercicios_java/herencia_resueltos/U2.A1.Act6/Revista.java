

public class Revista extends Fitxa
{
   private short any;
   private short nro;

   public Revista(String Ref, String Tit, int Any, int Nro)
   {
      super(Ref,Tit);
      if (Nro<0 || Nro>Short.MAX_VALUE) nro=0;
      else nro = (short)Nro;
      if (Any<0 || Any>Short.MAX_VALUE) any=0;
      else any = (short)Any;
   }

   public Revista (Revista f)
   {
      this(f.referencia, f.titol, f.any, f.nro);
   }

   public void setAny (int nouAny)
   {
      if (nouAny>0 && nouAny<=Short.MAX_VALUE) any=(short)nouAny;
   }

   public void setNro (int nouNro)
   {
      if (nouNro>0 && nouNro<=Short.MAX_VALUE) nro=(short)nouNro;
   }

   public int getAny ()
   {
      return any;
   }

   public int getNro ()
   {
      return nro;
   }

   public void visualitzar()
   {
      super.visualitzar();
      System.out.println("Any............:" + any);
      System.out.println("Número Revista.:" + nro);
   }
}