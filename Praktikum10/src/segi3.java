package praktikum10b.bin;

class segi3 extends Bentuk
{
   public segi3(int a, int b)
   {
      this.a= a;
	  this.b= b;
    }
	public String getBentuk()
	{
	     return "Bentuk Persegi Tiga";
	}
	public int HitungLuas()
	{
	   return (a*b)/2;
	}
}