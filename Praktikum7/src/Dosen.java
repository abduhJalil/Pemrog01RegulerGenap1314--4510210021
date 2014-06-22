//perintah class & object - dosen
package praktikum06b.bin;

public class Dosen
{
	String nama;
	String email;
	
	//begitu kita mendefinisikan constructor,
	//java tidak akan membuatkan default constructor
	public Dosen(String nama, String email)
	{
		this.nama = nama;
		this.email=email;
	}
	
	//tidak otomatis dibuatkan oleh java
	//bila dibutuhkan kita harus buat sendiri
	public Dosen() {}
	
	//method
	public void info()
	{
		System.out.println("nama dosen : " +nama);
		System.out.println("nama email : " +email);
		System.out.println();
		System.out.println();
	}
}