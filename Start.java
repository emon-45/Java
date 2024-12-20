
import java.util.*;

import candidates.AwamiLeague;
import candidates.Bnp;
import candidates.NationalParty;
import candidates.Winner;
import login.Login;

public class Start {
	public static void main(String[] args) {
		
		Winner win = new Winner();
		
		String uName="";
		String Id="";
		
		String user[] = new String[5];
		user[0] = "Nazmul";
		user[1] = "Hasan";
		user[2] = "Emon";
		user[3] = "Siam";
		user[4] = "Islam";
		
		String id[] = new String[5];
		id[0] = "123";
		id[1] = "124";
		id[2] = "125";
		id[3] = "126";
		id[4] = "127";
		
		int b = 0;
		while(b != 5) {
			
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i<1; ) {

				System.out.print("Please Enter your User Name : ");
				uName = sc.nextLine();
				System.out.println("Please Enter your Id : ");
				Id = sc.nextLine();
				
				Login lo = new Login(Id,uName,id,user);
				
				
				
				if(lo.checkLogin() == 1) {
					System.out.println("Congratulations. You are eligibale for Vote!");
					for(int k = 0;k < 5;k++) {
						if(uName.equals(user[k])) {
							user[k] = null;
							id[k] = null;
						}
					}
					i = 1;
				}
				else {
					System.out.println("Invalid Login. Please try again.");
				}
				
				
			}
			
			
			System.out.println("Do you want to use your vote ? ");
			System.out.println("1.Yes\n2.No");

			int sel = Integer.parseInt(sc.nextLine());

			if(sel == 1) {
				System.out.println("Please select your party Name!");
				System.out.println("1. BNP (Khaleda Jia)");
				System.out.println("2. Awami League (Sheikh Hasina)");
				System.out.println("3. National Party (Hossain Mohammad Ershad)");
				System.out.print("Choose : ");
				int ch = Integer.parseInt(sc.nextLine());
				
				if(ch == 1) {
					Bnp bnp = new Bnp("Khaleda Jia");
					win.addBnp(bnp);
					System.out.println("\n");
					
				}
				
				else if(ch == 2) {
					AwamiLeague awamileague = new AwamiLeague("Sheikh Hasina");
					win.addAwamiLeague(awamileague);
					System.out.println("\n");
				}
				
				else {
					NationalParty nationalparty = new NationalParty("Hossain Mohammad Ershad");
					win.addNationalParty(nationalparty);
					System.out.println("\n");
				}
			}
			else{
				System.out.println("Thank you for your Response!\n");
			}
			b = b+1;
		}
		
		win.showWinner();
		
		
	}
}