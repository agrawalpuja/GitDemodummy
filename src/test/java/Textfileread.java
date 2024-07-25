import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Textfileread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\001YXW744\\Desktop\\sample.txt");
		Scanner sc = new Scanner(file);

		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

		 
}

}