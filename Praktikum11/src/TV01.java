package praktikum11a.bin;

class TV01 implements Kontrol
{
	String[] LineTV = {"NetTV", "kompasTV", "metroTV", "DAi TV", "TVOne"};
	
	public void PindahLine(int Line)
	{
		System.out.println("memindahkan line pada TV01 ke : " + LineTV[Line]);
	}
	public void VolBesar(int Vol)
	{
		System.out.println("memperbesar suara TV01 : " + Vol);
	}
	public void VolKecil(int Vol)
	{
		System.out.println("memperkecil suara TV01 " + Vol);
	}
}
	