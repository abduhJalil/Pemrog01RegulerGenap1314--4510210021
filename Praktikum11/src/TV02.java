package praktikum11a.bin;

class TV02 implements Kontrol
{
	String[] LineTV = {"RCTI", "SCTV", "ANTV", "MNC", "GLOBAL"};
	
	public void PindahLine(int Line)
	{
		System.out.println("memindahkan line pada TV02 ke : " + LineTV[Line]);
	}
	public void VolBesar(int Vol)
	{
		System.out.println("memperbesar suara TV02 : " + Vol);
	}
	public void VolKecil(int Vol)
	{
		System.out.println("memperkecil suara TV02 " + Vol);
	}
}
	