package praktikum10d.bin;

public class KomunitasPT2
{
	protected String Nama;
	protected String Alamat;
	protected String Jk;
	
	//Inisialisasi 3 fields
	KomunitasPT2(String NAMA, String ALAMAT, String JK)
	{
		Nama = NAMA;
		Alamat = ALAMAT;
		Jk = JK;
	}
	//Mencetak informasi yang dimiliki oleh komunitas
	public void Tampilkan3()
	{
		System.out.println("Nama			= " +Nama);
		System.out.println("Alamat			= " +Alamat);
		System.out.println("Jenis Kelamin	= " +Jk);
	}
}