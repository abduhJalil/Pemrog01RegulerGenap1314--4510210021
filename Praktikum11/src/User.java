package praktikum11a.bin;

class User
{
	public static void main(String[] abduh)
	{
		TV02 tv02 = new TV02();
		TV01 tv01 = new TV01();
		Remote RM = new Remote();
		
		RM.PerintahTV(Remote.PINDAHLINE, tv01, 0);
		RM.PerintahTV(Remote.VOLBESAR, tv01, 8);
		System.out.println();
		RM.PerintahTV(Remote.PINDAHLINE, tv02, 3);
		RM.PerintahTV(Remote.VOLKECIL, tv02, 2);
	}
}