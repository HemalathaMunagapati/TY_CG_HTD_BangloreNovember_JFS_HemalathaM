import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
	public static void main(String[] args) {
		try {
			FileOutputStream fs=new FileOutputStream("C:\\Users\\Dell\\Desktop\\a.anu.txt");
			String st="Hema dear";
			byte b[]=st.getBytes();
			fs.write(b);
			System.out.println("Success....");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
