package praktikum09a.bin;

public class TesKucingBesar
{
	public static void main(String[] abduh)
	{
		Singa mySinga = new Singa("SIMBABA SURAI");
		System.out.println("singa merupakan " +Singa.nama);
		mySinga.Makan();
		
		Harimau myHarimau = new Harimau("HARIMAU SUMATRA");
		System.out.println("Harimau merupakan " +Harimau.nama);
		myHarimau.Makan();
	}
}