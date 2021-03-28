import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		File f=new File("/Users/lukaszbibrzycki");
		File[] files=f.listFiles();
		for(File file: files)
			System.out.println(file.getAbsolutePath());
		
		for(File file: files) {
			int slashind=file.getAbsolutePath().lastIndexOf("/");
			System.out.println(file.getAbsolutePath().substring(slashind+1));
		}
	}

}
