//created by Muhamad Rivai
//date : 24 april 2014

package praktikum07b.bin;

public class Angka03
{
	public static void main(String[] Rivai)
	{
		double Penyebut = 9;
		double Pembilang = 0;
		try
		{
			System.out.println("hasil pembaginya adalah " + Penyebut/Pembilang);
		}
		catch(ArithmeticException e)
		{
			System.out.println("pembagiannya dengan angka 0...");
		}
		System.out.println("selesai");
	}
}