package Assignment4Q5;
import java.util.*;
import java.io.*;
public class FileUtil {
	public static List<String> readFiles(String fileName){
		List<String> list=new ArrayList<String>();
		String line =null;
		try (BufferedReader br=new BufferedReader(new FileReader("photoa.txt"))){
			while((line=br.readLine())!=null) {
				list.add(line);
			}
		} catch (IOException ex) {
			System.out.println("Some ex....");
			// TODO: handle exception
		}
		return list;
	}

}
