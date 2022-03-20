package assignment3;
import java.util.Scanner;
public class Q7_quotient {
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter two Numbers:");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			try {
				int num3=num1/num2;
				System.out.println(num3);
			}catch(Exception ex) {
				System.out.println("DivideByZeroException caught"); 
			}
			finally {
				System.out.println("Inside finally block");
			}
			sc.close();
		}
	  
	  
	}

