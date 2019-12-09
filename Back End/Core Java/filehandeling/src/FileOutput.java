import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutput {
	public static void main(String[] args) {
		
		try {
			FileOutputStream f1 = new FileOutputStream("anu.txt");
			String s1="Divya bogar";
			byte b1[]=s1.getBytes();
			f1.write(b1);
			System.out.println("Success........");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
