public class Person{
	private Long id;
	private String nama;
	public String getNama(){
		return nama;
	}
	public void setNama(String nm){
		nama = nm;
	}
	public Long getId(){
		return id;
	}
	public void setId(Long i){
		id = i;
	}
	public interface PersonDao{
		void save (Person p);
		void delete(Person p);
		Person getById(Long id);
}
}



