package Lab18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FileUtils {

	/**
	 * This method creates a copy .txt file of an original .txt file
	 * @param source path of the original file
	 * @param dest path of the copy file
	 * @return
	 */
	public static boolean copyTextFile(String source, String dest)
	{
		try(BufferedReader reader = new BufferedReader(new FileReader(source)); // utiliza��o de FileReader pois o ficheiro que ser� lido � um ficheiro de caracteres
				BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) // utiliza��o de FileWriter pois o ficheiro que ser� escrito ser� um ficheiro de caracteres
				{
			String nextLine = reader.readLine();  //inicializa��o da leitura das linhas do ficheiro original

			while( nextLine != null) 	// enquanto a vari�vel nextLine n�o for nula, � escrito num novo ficheiro a linha actual, seguida de uma mudan�a de linha.
			{ 						// no final do ciclo � lida a pr�xima linha do ficheiro original
				writer.write(nextLine);
				writer.newLine();
				nextLine = reader.readLine();
			}
				}

		catch (FileNotFoundException e)
		{
			System.out.println(source + " not found or is inaccessible");
			e.printStackTrace();
			return false;
		}

		catch (IOException e)
		{
			System.out.println(" Fail reading" + source);
			e.printStackTrace();
			return false;
		}

		return true;
	}

	
	/**
	 * This method creates a copy of a binary file
	 * @param source path of original binary file
	 * @param dest path of copy binary file
	 * @return
	 */
	public static boolean copyBinaryFile(String source, String dest)
	{
		try(BufferedInputStream input = new BufferedInputStream(new FileInputStream (source)); //Utiliza��o de FileInputStream pois o ficheiro que ser� lido � do tipo bin�rio
			BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream (dest))) //Utiliza��o de FileOutputStream pois o ficheiro que ser� escrito � do tipo bin�rio
		{
			int nextDataByte = input.read(); // l� um byte do ficheiro original
			
			while(nextDataByte != -1) // -1 valor se n�o houver mais bytes para ler
			{
				output.write(nextDataByte);		//escreve o byte lido no novo ficheiro
				nextDataByte = input.read();	// l� o pr�ximo byte
			}
			input.close();	//termina o stream de leitura
			output.close();		//termina o stream de escrita
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println(source + " not found or is inaccessible");
			e.printStackTrace();
			return false;
		}
		
		catch (IOException e1)
		{
			System.out.println(" Fail reading" + source);
			e1.printStackTrace();
			return false;	
		}
		
		return true;	
	}
	
	/**
	 * This method copy a text file to an array of Strings
	 * @param source path of the original text file
	 * @param delim delimiter txt tokens 
	 * @return
	 */
	public static String[] parseTextFile(String source, String delim)
	{
		try(BufferedReader reader = new BufferedReader(new FileReader(source))) // Utiliza��o do FileReader por ser uma ficheiro de caracteres
		{
			String text = ""; // String onde ir� ser armazenado todo o texto contido no ficheiro
			String nextLine = reader.readLine(); //leitura da pr�xima linha
			while(nextLine != null)	// at� a vari�vel nextLine ser nula, todo o texto do ficheiro original ser� armazenado na vari�vel text
			{
				text += nextLine;
				nextLine = reader.readLine();
			}
			
			StringTokenizer tokenizer = new StringTokenizer(text, delim); // Cria��o de um objecto tokenizer do tipo StringTokenizer com os parametros text(onde est� armazenado todo o texto e delim(delimitador dos tokens)
				String[] parsedText = new String[tokenizer.countTokens()]; //cria��o de um array de Strings com um n�mero de elementos igual ao n�mero de tokens do objecto tokenizer
			reader.close();
	
			int idx = 0;
			while (tokenizer.hasMoreElements()) // enquanto o tokenizer tiver elementos, cada elemento � passado para uma posi��o idx do array parsedText
			{
				parsedText [idx] = tokenizer.nextToken();
				idx++;
			}
			return parsedText;
		}
		
		catch (FileNotFoundException e)
		{
			return null;
		}
		
		catch (IOException e)
		{
			return null;
		}
	}
	
	/**
	 * This method creates a copy of an original file with a replaced word 
	 * @param fileIn path of orginal file
	 * @param fileOut path of copy file
	 * @param wordToFind word to be replaced
	 * @param newWord 
	 * @return
	 */
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
		return false;
	}
	catch (IOException e) 
	{
		e.printStackTrace();
		return false;
	}
	return true;
	
	}
}
