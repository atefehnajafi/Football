
public class Main {

	public static void main(String[] args) {
		ContractClass _currentContract1=new ContractClass();
		PlayerClass _player1=new PlayerClass();
		_player1.setName("ali");
		_player1.setFamily("Dayee");
		_player1.setPerMatchSalary(100000);
		_currentContract1.setStartDate("92");
		_currentContract1.setEndDate("93");
		_currentContract1.setTeaName("peresplis");		
		_player1.setContract(_currentContract1);
		
		
		PlayerClass _player2=new PlayerClass();
		ContractClass _currentContract2=new ContractClass();
		_player2.setName("Mohammad");
		_player2.setFamily("Alavi");
		_player2.setPerMatchSalary(70000);
		_currentContract2.setStartDate("92");
		_currentContract2.setEndDate("93");
		_currentContract2.setTeaName("peresplis");		
		_player2.setContract(_currentContract2);
		
		
		
		PlayerClass _player3=new PlayerClass();
		ContractClass _currentContract3=new ContractClass();
		_player3.setName("Mehdi");
		_player3.setFamily("Rahmati");
		_player3.setPerMatchSalary(77000);
		_currentContract3.setStartDate("92");
		_currentContract3.setEndDate("93");
		_currentContract3.setTeaName("esteghlal");		
		_player3.setContract(_currentContract3);
		
		
		
		PlayerClass _player4=new PlayerClass();
		ContractClass _currentContract4=new ContractClass();
		_player4.setName("Majid");
		_player4.setFamily("Hosseini");
		_player4.setPerMatchSalary(70000);
		_currentContract4.setStartDate("92");
		_currentContract4.setEndDate("93");
		_currentContract4.setTeaName("esteghlal");		
		_player4.setContract(_currentContract4);
		
		
		ContractClass _currentContractCouch1=new ContractClass();
		CouchClass _couch1=new CouchClass();
		_couch1.setName("yahya");
		_couch1.setFamily("GolMohammadi");
		_couch1.setPerDaySalary(4500);
		_couch1.setVacationDate(3);
		_currentContractCouch1.setStartDate("92");
		_currentContractCouch1.setEndDate("93");
		_currentContractCouch1.setTeaName("Persepolis");
		_couch1.setContract(_currentContractCouch1);
		
		
		
		ContractClass _currentContractCouch2=new ContractClass();
		CouchClass _couch2=new CouchClass();
		_couch2.setName("Ali");
		_couch2.setFamily("DanayeeFard");
		_couch2.setPerDaySalary(5800);
		_couch2.setVacationDate(3);
		_currentContractCouch2.setStartDate("92");
		_currentContractCouch2.setEndDate("93");
		_currentContractCouch2.setTeaName("esteghlal");
		_couch2.setContract(_currentContractCouch2);
		
		PlayClass _play1=new PlayClass();
		_play1._hostPlayerList[0]=_player1;
		_player1.playCount++;
		_play1._hostPlayerList[1]=_player2;
		_player2.playCount++;
		
		_play1._guestPlayerList[0]=_player3;
		_player3.playCount++;
		_play1._guestPlayerList[1]=_player4;
		_player4.playCount++;
		
		PlayClass _play2=new PlayClass();
		_play2._hostPlayerList[0]=_player3;
		_player3.playCount++;
		_play2._hostPlayerList[1]=_player4;
		_player4.playCount++;
		
		_play2._guestPlayerList[0]=_player1;
		_player1.playCount++;
		_play2._guestPlayerList[1]=_player2;
		_player2.playCount++;
		
		
		
		
		ClubMemberClass[] _clubMemberList={_player1,_player2,_player3,_player4,_couch1,_couch2};
		for (ClubMemberClass clubMemberClass : _clubMemberList) {
			clubMemberClass.print_all_salaries();
		}
	}

}
