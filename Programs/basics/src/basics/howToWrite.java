package basics;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class howToWrite {

	public static void main(String[] args) throws Exception {

File newFile = new File("C:/Users/compaq/Desktop/newFile.txt");		
if(newFile.exists())
	System.out.println("The file already exists");
else
{
newFile.createNewFile();
	
		
	FileWriter fileW = new FileWriter(newFile);
BufferedWriter buffW = new BufferedWriter(fileW);
buffW.write("this is a tutorial");
buffW.close();
	System.out.println("File written!!");
}	

	

		
		
	}

}
