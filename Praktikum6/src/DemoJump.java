//M Abduh Jalil Rumfot
//Kamis,03-04-2014


package Latihan01.sesi1.bin;
import java.util.Random;

public class DemoJump
{
	public static void main(String[] abduh)
	{
		Integer faktor =7;
		System.out.println("mencari kelipatan " +faktor + " dengan break");
		while (true)
		{
			Integer random = new Random().nextInt();
			System.out.println("bilangan random : " +random);
			
			if(random % faktor == 0)
			{
				System.out.println("kelipatan " +faktor + " ditemukan yaitu : " +random);
				break;
			}
		}
	}
}