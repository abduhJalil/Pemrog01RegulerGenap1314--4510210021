package praktikum09e.bin;

class Jeep extends Mobil
{
	String Nama;
	String NoPolisi;
	int Kecepatan;
	
	//contructor kelas
	public Jeep(String aNama, String aNoPolisi, int aKecepatan)
	{
		super("Jeep");
		Nama = aNama;
		NoPolisi = aNoPolisi;
		Kecepatan = aKecepatan;
	}
	
	//menampilkan informasi
	public void Display()
	{
		System.out.println("Nama Mobil = " + this.Nama);
		System.out.println("Nomor Mobil = " + this.NoPolisi);
		System.out.println("Kecepatan Mobil = " + this.Kecepatan);
	}
}