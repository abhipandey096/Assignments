package Assignment2_Q5;

public class Assignment2_q5main {
	public static void main(String[] args) {
		Employee employee=new CommissionEmployee(121, "amit", 2.1, 20000);
		Invoice invoice=new Invoice("A123", "Electronic23W", 20, 30);
		
		PaymentProcessingSystem.processPayment(employee);
	}
}
