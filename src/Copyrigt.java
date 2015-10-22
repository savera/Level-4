import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Copyrigt
{
	public static void main(String[] args) throws IOException 
	{
		
		//Gets string from the directory
		String currentDir = null;
		try
		{
			currentDir = new File("Files").getCanonicalPath();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Dir:" + currentDir);
		
		//Gets the reference to File directory 
		File file = new File(currentDir); 
		
		//Gets the current year. 
		int cal = Calendar.getInstance().get(Calendar.YEAR);
		
		String line; 
		
		String copywright = "\\Copywright Savera " + cal; 
		
		//Loops over all the files and adds the copyright 
		for(File f : file.listFiles()){
			
			//Reads the files
			FileReader fr = new FileReader(f); 
			
			//Reads the text
			BufferedReader reader = new BufferedReader(fr); 
			
			while ((line = reader.readLine()) != null){
				
				if(line.contains(copywright) == false){
					
				System.out.println("Working");
					
				reader.close();
				
				}
			
			//Writes the files
			FileWriter fw = new FileWriter(f,true); 
			
			fw.append(copywright);
			
			System.out.println("Also working");
			
			fw.close();
			
			}
		}
		
	}
}
