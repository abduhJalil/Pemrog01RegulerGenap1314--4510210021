package praktikum09d.bin;

class Pajak
{
	long Pendapatan;
	String Propinsi;
	String Kota;
	public double HitungPajak()
	{
		double PajakUmum=0;
		if(Pendapatan < 500000001)
		{
			PajakUmum = Pendapatan * 0.025;
		}
		else
		{
			PajakUmum = Pendapatan * 0.25;
		}
		return PajakUmum;
	}
}