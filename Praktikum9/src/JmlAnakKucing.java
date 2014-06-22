//Perintah Inheritance
package praktikum09b.bin;

class JmlAnakKucing extends Kucing
{
	private String MAKANAN;
	private int JumlahAnak;
	public String getMakanan()
	{
		return MAKANAN;
	}
	public void setMakanan(String Makanan)
	{
		MAKANAN = Makanan;
	}
	public int getJumlahAnak()
	{
		return JumlahAnak;
	}
	public void setJumlahAnak(int JumlahAnak)
	{
		this.JumlahAnak = JumlahAnak;
	}
}