import java.util.Scanner;

public class StdInEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s=sc.nextLine();
			if(s.equals("q")) {
				System.out.println("koniec");
				break;
			}
			System.out.println(s);
		}
	}

}
