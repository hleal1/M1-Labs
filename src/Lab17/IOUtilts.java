package Lab17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class IOUtilts {

	public static boolean copyAndReplace(String fileIn, String fileOut,
	String wordToFind, String newWord)
	{
	try (BufferedReader br = new BufferedReader(new FileReader(fileIn));
			PrintWriter pw = new PrintWriter(fileOut))
			{
				String line = null;
					while ((line = br.readLine()) != null) 
						{
							if(line.contains(wordToFind)) 
							{
								line = line.replaceAll(" " + wordToFind + " ", " " + newWord + " ");
							}
							pw.println(line);
						}
					br.close();
					pw.close();
			} 
	
	catch (FileNotFoundException e)
	{
		System.out.println(fileIn + " not found or is inaccessible");
		e.printStackTrace();
		return false;
	}
	catch (IOException e) 
	{
		System.out.println(" Fail reading" + fileIn);
		e.printStackTrace();
		return false;
	}
	return true;
	
	}

	public static void main(String agrs[])
	{
	copyAndReplace("C:/Users/Hugo/Desktop/In.txt", "C:/Users/Hugo/Desktop/Out.txt", "Ze", "Jose");
	}
}
