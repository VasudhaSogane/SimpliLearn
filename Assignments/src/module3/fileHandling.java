package module3;

import java.io.File;
import java.io.IOException;

class fileOperations{
	public String filePath = "C:\\Users\\Santosh\\Documents\\vasudha\\Full stack java developer course";

	public void addFile(String fileName) throws IOException {
		File f = new File(filePath+"\\"+fileName+".txt");
		boolean created = f.createNewFile();
		if(created)
			System.out.println("\nFile created successfully\n");
		else
			System.out.println("\nCould not create file\n");
	}
}
public class fileHandling {
	public static void main(String[] args) throws IOException{
		fileOperations fp = new fileOperations();
		fp.addFile("test");
	}

}
