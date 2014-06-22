package praktikum10b.bin;

abstract class Bentuk
{
   protected int a; //nilai Panjang = a
   protected int b; //nilai Lebar = b
   
   public String getBentuk()
   {
      return "BENTUK DARI SEGIEMPAT, LINGKARAN & SEGITIGA";
	}
	public abstract int HitungLuas();
 }
