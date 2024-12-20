package login;



public class Login {
	private static String[] userID;
	private static String[] userName;
	private String Id;
	private String Name;

	public Login(String Id, String Name, String[] userID, String[] userName){
		this.Id = Id;
		this.Name = Name;
		this.userID = userID;
		this.userName = userName;
	}



	public int checkLogin() {

		for(int i = 0; i < 5;i++) {
			if(Id.equals(userID[i]) && Name.equals(userName[i])) {
				return 1;
			}
		}
		return 0;
	}


}