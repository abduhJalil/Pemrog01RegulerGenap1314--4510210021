package praktikum09e.bin;

public class MobilApply
{
	public static void main(String[] Rivai)
	{
		Jeep Mobil1 = new Jeep("jeep tentara", "B-78-ATO", 180);
		Jeep Mobil2 = new Jeep("jeep gunung", "B-57-can", 200);
		Jeep Mobil3 = new Jeep("jeep pantai", "B-335-TOC", 150);
		
		Mobil1.JenisMobil();Mobil1.Display();
		System.out.println();
		Mobil2.JenisMobil();Mobil2.Display();
		System.out.println();
		Mobil3.JenisMobil();Mobil3.Display();
	}
}