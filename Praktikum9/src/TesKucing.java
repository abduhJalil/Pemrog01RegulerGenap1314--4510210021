//Perintah Inheritance
package praktikum09b.bin;

public class TesKucing
{
	private static int Jumlah;
	public static void main(String[] Rivai)
	{
		Jumlah = 1;
		
		//KucingMakan
		KucingMakan KM = new KucingMakan();
		System.out.print("masukan nama kucing kesayangan anda [" +Jumlah +"] : ");
		KM.setNama(KucingMakan.inputDataString());
		System.out.print("masukan umur kucing kesayangan anda [" +Jumlah +"] : ");
		KM.SetUmur(KucingMakan.inputDataInteger());
		System.out.print("masukan makanan kucing kesayangan anda [" +Jumlah +"] : ");
		KM.setMakanan(KucingMakan.inputDataString());
		Jumlah++;
		
		//JmlAnankKucing
		JmlAnakKucing JAK = new JmlAnakKucing();
		System.out.print("masukan nama kucing kesayangan anda [" +Jumlah +"] : ");
		JAK.setNama(KucingMakan.inputDataString());
		System.out.print("masukan umur kucing kesayangan anda [" +Jumlah +"] : ");
		JAK.SetUmur(KucingMakan.inputDataInteger());
		System.out.print("masukan berat kucing kesayangan anda [" +Jumlah +"] : ");
		JAK.setBerat(KucingMakan.inputDataInteger());
		System.out.print("masukan makanan kucing kesayangan anda [" +Jumlah +"] : ");
		JAK.setMakanan(KucingMakan.inputDataString());
		System.out.print("masukan jumlah anak kucing anda [" +Jumlah +"] : ");
		JAK.setJumlahAnak(JmlAnakKucing.inputDataInteger());
		
		//menampilkan Data Kucing
		System.out.print("\n\n DATA KUCING  ");
		KM.Tulis();
		System.out.print("makanan kucing anda : " +KM.getMakanan());
		JAK.Tulis();
		System.out.print("makanan kucing anda : " +JAK.getMakanan());
		System.out.print("jumlah anak kucing : " +JAK.getJumlahAnak());
	}
}