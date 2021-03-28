import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputEx {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("liczby.dat");
		PrintWriter pw=new PrintWriter(f);
		for(int i=0;i<20;i++)
			pw.println(i);
		
		pw.close();
		System.out.println("koniec");
	}

}
