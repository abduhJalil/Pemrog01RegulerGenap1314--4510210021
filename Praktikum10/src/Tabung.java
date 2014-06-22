package praktikum10e.bin;

public class Tabung
{
	//Data nasabah & info tabungan
	private String Nama;
	private int NoRek;
	private int Saldo;
	private int Pin;
	
	//Membuat objek Tabungan
	public Tabung(String NAMA, int NOREK)
	{
		Nama = NAMA;
		NoRek = NOREK;
		Pin = 666666;
		
	}
	//Penyetoran Uang
	public void Simpan(int Sal)
	{
		Saldo = Saldo + Sal;
	}
	//Tarik uang
	public void Tarik(int jmlTarik)
	{
		Saldo = Saldo -jmlTarik;
	}
	//Info Saldo Tabungan
	public int getSaldo()
	{
		return Saldo;
	}
	//Mengubah nilai awal saldo
	public void setSaldo(int Sal)
	{
		Saldo = Sal;
	}
	//Mengubah Nomor PIN
	public void setPin(int PinBaru)
	{
		Pin = PinBaru;
	}
	//Uji
	public static void main(String[] abduh)
	{
		int jmlTarik = 100000,jmlSimpan = 500000;
		Tabung TAB = new Tabung("Candra Nursari", 12345);
		System.out.println("Saldo Awalnya adalah = " +TAB.getSaldo());
		TAB.Tarik(jmlTarik);
		System.out.println("Saldo Setelah Penarikan = " +TAB.getSaldo());
		TAB.Simpan(jmlSimpan);
		System.out.println("Saldo Setelah Di Setor = " +TAB.getSaldo());
		TAB.Tarik(jmlTarik);
	}
}