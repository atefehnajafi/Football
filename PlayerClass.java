
public class PlayerClass extends ClubMemberClass{
	private int perMatchSalary;
	int playCount=0;
	
	public int getPerMatchSalary() {
		return perMatchSalary;
	}

	public void setPerMatchSalary(int perMatchSalary) {
		this.perMatchSalary = perMatchSalary;
	}
	
	String calcute()
	{
		int salary=getContract().baseSalary+(perMatchSalary * playCount);
		return "Player Salary is : " + salary;
	}

}
