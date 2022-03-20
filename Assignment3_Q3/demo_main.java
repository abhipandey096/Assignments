package Assignment3_Q3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class demo_main
{
	private static ObjectInputStream ois;
	private static ObjectOutputStream oos;

	public static void main(String gg[]) 
	{
		Address add=new Address("MIG 3B2 ADA NAINI","Prayagraj","India");
		Employee emp=new Employee(101,"Abhishek Pandey",add,500000);
		//Serialize
		try {
		
			oos = new ObjectOutputStream(new FileOutputStream(new File("D:/Users/Dell/Downloads/designations.jsp")));		
      		oos.writeObject(emp);	
      		System.out.println("Object is Serialized");
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		
		//Deserialize
		emp=null;
		try
         {
            ois = new ObjectInputStream(new FileInputStream(new File("D:/Users/Dell/Downloads/designations.jsp")));
            emp=(Employee) ois.readObject();
            System.out.println("Object is Deserialized");
         }catch(IOException io)
         {
        	 io.printStackTrace();
         }catch(ClassNotFoundException cnfe)
         {
        	 cnfe.printStackTrace();
         
         }
		System.out.println(add.toString());
	}
}
 

