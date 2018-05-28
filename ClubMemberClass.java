
abstract public class ClubMemberClass extends PersonClass{
	private ContractClass[] _contractList=new ContractClass[2];
	private ContractClass _currentContract=new ContractClass();
	
	public void setContractList(ContractClass[] contractlist){
		this._contractList=contractlist;
	}
	public void setContract(ContractClass _currentContract){
		this._currentContract=_currentContract;
	}
	public ContractClass[] getContractList(){
		return _contractList;
	}
	public ContractClass getContract(){
		return _currentContract;
	}
	
	void print_all_salaries(){
		String salary=calcute();
		System.out.println(salary);
	}
	abstract String calcute();
}
