//M Abduh Jalil Rumfot(4510210021)
//Kamis,03-04-2014
//ANATOMI DAN APLIKASI JAVA,CLASSPATH

//Constructor
public class Person{
	public Person(){
		Person p = new Person();
	}
	public Person(String abduh){
		Person dadang = new Person("dadang");
	}
	public Person(String nama, int){
		Person Jimmy = new Person("Jimmy", 1);
	}
}
//Cara Pemanggilannya:
/*Person p = new Person();-->Constructor Pertama
Person dadang = new Person("dadang");-->Constructor Kedua
Person Jimmy = new Person("Jimmy", 1);-->Constructor Ketiga
*/