package Assignment2Q3;
public class demo_main {
public static void main(String[] args) {
		
		SavingAccount account=new SavingAccount("abhi", "212334", 30000, 5, 1000, 23330);
	
		Account account2=new CurrentAccount("Akshat", "2431234", 500000, "AB1234", 50000);
		System.out.println(account);
		System.out.println(account2);
	}

}
