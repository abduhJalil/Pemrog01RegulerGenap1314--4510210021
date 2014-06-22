package praktikum09c.bin;

public class Batak extends SukuInd
{
	private double GAJI;
	public Batak(String Nama, String Alamat, String Hobby, String Pekerjaan)
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
}