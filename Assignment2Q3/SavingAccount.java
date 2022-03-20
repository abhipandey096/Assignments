package Assignment2Q3;

public class SavingAccount extends Account  {
	public SavingAccount(String name, String accountNumber, double accountBalance) {
		super(name, accountNumber, accountBalance);
		// TODO Auto-generated constructor stub
	}

	private double interest=5.0;
	private double maxWithdrawAmountLimit;
	private double minimumBalance;
	

	public SavingAccount(String name, String accountNumber, double accountBalance, double interest,
			double maxWithdrawAmountLimit, double minimumBalance) {
		super(name, accountNumber, accountBalance);
		this.interest = interest;
		this.maxWithdrawAmountLimit = maxWithdrawAmountLimit;
		this.minimumBalance = minimumBalance;
	}
	
	public double getBalance() {
		return getAccountBalance()*(100+interest)/100;
	}
	
	public void withdraw(double amount) {
		if(amount<=maxWithdrawAmountLimit) {
			setAccountBalance(getAccountBalance()-amount);
			System.out.println("amount "+ amount+" is withdrawn");
		}else
			System.out.println("You can not withdraw as min balance required ...");
	}

	@Override
	public String toString() {
		return super.toString()+ 
				" interest=" + interest + ","
				+ " maxWithdrawAmountLimit=" + maxWithdrawAmountLimit
				+ ", minimumBalance=" + minimumBalance + "]";
	}

	
	
}


