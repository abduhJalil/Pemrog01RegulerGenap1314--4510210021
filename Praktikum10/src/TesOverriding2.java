package praktikum10b.bin;

class TesOverriding2
{
   public static void cetakluas(Bentuk btk)
   {
       System.out.println();
	   System.out.println(btk.getBentuk() + " dengan LUAS = "+btk.HitungLuas());
	   
	}
	public static void main(String[] Rivai)
	{
	   segi4 s4 = new segi4(22, 66);
	   segi3 s3 = new segi3(28, 68);
	   lingkaran li = new lingkaran(12);
	   
	   cetakluas(s4);
	   cetakluas(s3);
	   cetakluas(li);
	 }
}