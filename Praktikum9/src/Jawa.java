package praktikum09c.bin;

public class Jawa extends SukuInd
{
	private double GAJI;
	public Jawa(String Nama, String Alamat, String Hobby, String Pekerjaan)
	{
		super(Nama, Alamat, Hobby, Pekerjaan);
	}
	public double getGAJI()
	{
		return GAJI;
	}
	public void setGAJI(double Gaji)
	{
		GAJI = Gaji;
	}
	
	public String THR(double persen)
	{
		if(persen > 500000)
			return "gaji ke 13 terlalu besar";
		else
			return "gaji ke 13 sebesar " +(persen*GAJI/100);
	}
}