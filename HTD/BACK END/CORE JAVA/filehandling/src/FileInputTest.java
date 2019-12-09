import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest {
	public static void main(String[] args) {
		try {
			FileInputStream fs=new FileInputStream("C:\\Users\\Dell\\Desktop\\a.anu.txt");
//			int a=fs.read();
//			System.out.println((char)a);
			int j=0;
			while((j=fs.read())!=-1) {
				System.out.println((char)j);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
