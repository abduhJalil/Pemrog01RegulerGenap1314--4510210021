//M Abduh Jalil Rumfot(4510210021)
//Method dan Exception
//Praktikum Soal 4
//Date			: Kamis, 22 Mey 2014
package praktikum05.bin;

import java.util.Scanner;

public class Method {
	public static void main(String[] abduh) {
		Scanner input = new Scanner (System.in);
		Tuna tunaObject = new Tuna();
		System.out.println("Enter your name here : ");
		String name = input.nextLine();
		tunaObject.simpleMessage(name);
	}
}