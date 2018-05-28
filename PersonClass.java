
public class PersonClass {
	private String Name;
	private String Family;
	public static String National;
	
	public PersonClass() {
		this.National="iran";
	}
	
	public void setName(String name){
		this.Name=name;
	}
	public void setFamily(String family){
		this.Family=family;
	}
	public String getName(){
		return Name;
	}
	public String getFamily(){
		return Family;
	}
}
