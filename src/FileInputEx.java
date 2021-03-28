import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputEx {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("liczby.dat"));
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
	}

}
