package praktikum09f.bin;

public class KuliahApply
{
	public static void main(String[] Rivai)
	{
		Dosen DOS = new Dosen("candra nursari", 45, "Jakarta", "Menikah", "007", "03","Lektor Kepala", 1500000);
		Mahasiswa MH = new Mahasiswa("Muhamad Rivai", 06, "Jakarta","Mahasiswa", "451221", "2012",4);
		
		System.out.println(DOS.Display());
		System.out.println(MH.Display());
	}
}