//perintah Inheritance
package praktikum09e.bin;

class Mobil
{
	private String Jenis; //merupakan variabel superkelas
	
	//contructor superkelas
	public Mobil(String aTipe)
	{
		Jenis = new String(aTipe);
	}
	public String JenisMobil()
	{
		return "merupakan jenis mobil = " +Jenis;
	}
}