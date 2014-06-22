package praktikum09c.bin;

public class SukuInd
{
	protected String NAMA;
	protected String ALAMAT;
	protected String HOBBY;
	protected String PEKERJAAN;
	
	public SukuInd(String Nama, String Alamat, String Hobby, String Pekerjaan)
	{
		super();
		NAMA 		= Nama;
		ALAMAT		= Alamat;
		HOBBY		= Hobby;
		PEKERJAAN 	= Pekerjaan;
	}
	public String getNAMA()
	{
		return NAMA;
	}
	public String getALAMAT()
	{
		return ALAMAT;
	}
	public String getHOBBY()
	{
		return HOBBY;
	}
	public String getPEKERJAAN()
	{
		return PEKERJAAN;
	}
}