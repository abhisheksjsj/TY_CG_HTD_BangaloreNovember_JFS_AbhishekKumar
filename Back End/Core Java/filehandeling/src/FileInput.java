import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("anu.txt");
			// int a=f1.read();
			// System.out.println((char)a);
			int j = 0;
			while ((j = f1.read()) != -1) {
				System.out.println((char) j);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
