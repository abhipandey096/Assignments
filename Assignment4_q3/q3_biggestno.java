package Assignment4_q3;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
public class q3_biggestno {
	
	    public static void main(String[] args) throws FileNotFoundException {
	       
	    	File file = new File("data.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	        try {
	        	Scanner doubleScanner = new Scanner(file);
	            double bigDouble = Double.MIN_VALUE; //Initialize with a very small value
	            double smallDouble = Double.MAX_VALUE; //Initialize with a very big value
	            double currentDouble;
	            while (doubleScanner.hasNextDouble()) {
	                currentDouble = doubleScanner.nextDouble();
	                if (currentDouble > bigDouble) {
	                    bigDouble = currentDouble; //find the biggest number in file
	                }
	                if (currentDouble < smallDouble) {
	                    smallDouble = currentDouble; //find the smallest number in the file
	                }
	            }
	            System.out.println("The largest number is " + bigDouble); //print the number outside the while loop
	            System.out.println("the smallest number is " + smallDouble);
	        } catch (Exception l) {
	            System.err.println(l.getMessage());
	        }
	    }
	}


