package PraktikumSoal2.bin;

public class Abduh2 {
	private String nama;
	public static void main(String[] abduh){
		abduh2 test;
		test = new Abduh();
		test.setNama ("Abduh");
		byte b = 100;
		short s =100;
		
		abduh2 belajarVariabel = test;
		belajarVariabel.setNama("belajar variabel");
		
		System.out.println(b + s);
		System.out.println("nama: " + test.getNama() + "" +b);
	}
	public void setNama (String aNama){
		this.nama = aNama;
	}
	public String getNama(){
		return this.nama;
	}
}