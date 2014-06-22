package praktikum10b.bin;

class segi4 extends Bentuk
{
   public segi4(int a, int b)
   {
      this.a= a;
	  this.b= b;
    }
	public String getBentuk()
	{
	     return "Bentuk Persegi Empat";
	}
	public int HitungLuas()
	{
	   return a*b;
	}
}