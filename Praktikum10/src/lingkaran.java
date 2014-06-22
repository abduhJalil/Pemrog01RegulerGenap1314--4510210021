package praktikum10b.bin;

class lingkaran extends Bentuk
{
   public lingkaran(int a)
   {
      this.a= a;
	  
    }
	public String getBentuk()
	{
	     return "Bentuk Lingkaran";
	}
	public int HitungLuas()
	{
	   return 22/7*a*a;
	}
}