
public class ContractClass {
	private String startDate;
	private String endDate;
	static int baseSalary;
	private String teamName;
	
	public ContractClass() {
		this.baseSalary=100000;
	}
	
	public void setStartDate(String sdate){
		this.startDate=sdate;
	}
	public void setEndDate(String edate){
		this.endDate=edate;
	}
	public void setTeaName(String tname){
		this.teamName=tname;
	}

	public String getStartDate(){
		return startDate;
	}
	public String getEndDate(){
		return endDate;
	}
	public String getTeaName(){
		return teamName;
	}
}
