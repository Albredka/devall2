
public class Biblioteca
{
   private Fitxa t[];      
   private int q=0;
   
   public Biblioteca(int dim)
   {
      if (dim<0) dim=100;
      t = new Fitxa[dim];
   }

   public int capacitat()
   {
      return t.length;
   }
   
   public int nreElements()
   {
      return q;
   }
   
   public int afegir(Fitxa obj)

   {
      int i;
      if (obj==null) return -2;
      for (i=0; i<q && t[i].getReferencia().equals(obj.getReferencia())==false; i++);
      if (i<q) return i;
      if (q == t.length) return -3;
      t[q] = obj;
      q++;
      return -1;
   }

   public int cercar(String ref)
   /** Cerca una Fitxa dins la Biblioteca amb refer�ncia ref
       Retorna -1: Si no la troba
              >=0: La posici� on hi ha una Fitxa amb la mateixa refer�ncia
   */
   {
      int i;
      for (i=0; i<q && t[i].getReferencia().equals(ref)==false; i++);
      if (i<q) return i;
      return -1;
   }

   public Fitxa exemplarAt(int i)
   /** Retorna: La Fitxa que est� a la posici� i
                Null, si la posici� �s err�nia
   */
   {
      if (i<0 || i>=q) return null;      
      return t[i];
   }
   
   public Fitxa extreure(String ref)
   /** Cerca una Fitxa dins la biblioteca amb refer�ncia ref per tal de treure-la de la biblioteca retornant-la
       Retorna null: Si no la troba
               La Fitxa extreta en cas de trobar-la
   */
   {
      int i;
      Fitxa aux;
      for (i=0; i<q && t[i].getReferencia().equals(ref)==false; i++);
      if (i==q) return null;
      aux = t[i];
      for (; i<q-1; i++) t[i]=t[i+1];
      t[q-1]=null;   // Per a que la figura geom�trica no quedi apuntada innecess�riament
      q--;
      return aux;
   }
   
   public void visualitzar()
   {
      int i;
      System.out.println ("Contingut de la biblioteca");
      System.out.println ("**************************");
      System.out.println ("Capacitat.....: " + t.length);
      System.out.println ("Nre. Exemplars: " + q);
      for (i=0; i<q; i++)
         System.out.println("Exemplar " + i + ": " + t[i]);
   }
   
   public boolean equals(Object obj)
   {
      if (this == obj) return true;
      if (obj == null) return false;
      if (obj instanceof Biblioteca)
      {
         Biblioteca aux = (Biblioteca)obj;
         int i;
         if (q!=aux.q) return false;
         for (i=0; i<q && aux.cercar(t[i].getReferencia())>=0; i++);
         if (i==q) return true;  // Per tots els exemplars de la biblioteca activa, s'ha trobat
                                 // un exemplar amb igual refer�nica a la biblioteca obj
      }
      return false;
   }
   
}
