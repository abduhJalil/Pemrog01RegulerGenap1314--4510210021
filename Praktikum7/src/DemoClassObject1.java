//perintah class & object - DemoClassObject1
package praktikum06a.bin;

public class DemoClassObject1
{
	public static void main(String[] Rivai)
	{
		Mahasiswa.jumlah = 0;
		//mahasiswa.nim = "999"; //error, instance variabel harus ada objectnya dulu
		System.out.println("jumlah mahasiswa : " +Mahasiswa.jumlah);
		
		Mahasiswa m1 = new Mahasiswa();
		m1.nim = "4512210006";
		m1.nama = "rivai";
		m1.jumlah = 1;
		
		Mahasiswa m2 = new Mahasiswa();
		m2.nim = "456";
		m2.nama = "Nursari";
		m2.jumlah = 2;
		
		tampilkanMahasiswa(m1);
		tampilkanMahasiswa(m2);
		System.out.println("jumlah Mahasiswa : " +Mahasiswa.jumlah);
	}
	
	public static void tampilkanMahasiswa(Mahasiswa m)
	{
		System.out.println(" nim	: " +m.nim);
		System.out.println(" nama	: " +m.nama);
		System.out.println(" jumlah	: " +m.jumlah);
		System.out.println("");
		System.out.println("");
	}
}