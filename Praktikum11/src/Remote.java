package praktikum11a.bin;

class Remote
{
   public static final int PINDAHLINE = 1;
   public static final int VOLBESAR = 	2;
   public static final int VOLKECIL =   3;
   public void PerintahTV (int Aksi, Kontrol TV, int Tombol)
   {
       switch (Aksi)
	   {
	   case PINDAHLINE : TV.PindahLine(Tombol); break;
	   case VOLBESAR : TV.VolBesar(Tombol); break;
	   case VOLKECIL : TV.VolKecil(Tombol); break;
	   }
	  }
}