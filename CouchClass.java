
public class CouchClass extends ClubMemberClass {
	private int perDaySalary;
	private int vacationDate;

	public void setPerDaySalary(int perDaySalary) {
		this.perDaySalary = perDaySalary;
	}

	public int getPerDaySalary() {
		return perDaySalary;
	}

	public void setVacationDate(int vacationDate) {
		this.vacationDate = vacationDate;
	}

	public int getVacationDate() {
		return vacationDate;
	}

	String calcute() {
		int countOfPlay = 0;
		int salary = getContract().baseSalary + (30 - vacationDate) * perDaySalary;
		return "Couch Salary is : " + salary;
	}
}
