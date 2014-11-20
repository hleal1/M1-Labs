package Lab18;

import org.junit.Assert;
import org.junit.Test;

/**
 * Case tests for {@link FileUtils} class.
 * 
 * @author Challenge.IT
 *
 * Copyright (c) 2014, Challenge.IT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is distributed in the hope that it will be useful for learning purposes, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.
 * */
public class FileUtilsTest 
{
	@Test
	public void shouldCopyTextFileToAnotherPath()
	{
		// Arrange
		String source = "C:/Users/Hugo/Documents/M1 - Programação e Algoritmia/Laboratórios/anexos/text.txt";
		String dest   = "C:/Users/Hugo/Documents/M1 - Programação e Algoritmia/Laboratórios/anexos/copytext.txt";
		
		// Act
		
		// Assert
		Assert.assertTrue(FileUtils.copyTextFile(source, dest));
	}
	
	@Test
	public void shouldCopyBinaryFileToAnotherPath()
	{
		// Arrange
		String source = "C:/Users/Hugo/Documents/M1 - Programação e Algoritmia/Laboratórios/anexos/slb.jpg";;
		String dest   = "C:/Users/Hugo/Documents/M1 - Programação e Algoritmia/Laboratórios/anexos/copyslb.jpg";
		
		// Act
		
		// Assert
		Assert.assertTrue(FileUtils.copyBinaryFile(source, dest));
	}
	
	@Test
	public void shouldParseTextFile()
	{
		// Arrange
		String source = "C:/Users/Hugo/Documents/M1 - Programação e Algoritmia/Laboratórios/anexos/text.txt";
		String delim = "|";
		
		// Act
		String[] parsedText = FileUtils.parseTextFile(source, delim);
				
		// Assert
		Assert.assertNotNull(parsedText);
		Assert.assertTrue(parsedText.length == 3);
		Assert.assertEquals(parsedText[0], "RANDSTAD FORMACAO");
		Assert.assertEquals(parsedText[1], "LABORATORIO 18");
		Assert.assertEquals(parsedText[2], "JAVA IO");
		
	}
	
	@Test
	public void shouldReplaceAWord()
	{
		//Arrange
		String fileIn = "C:/Users/Hugo/Desktop/In.txt";
		String fileOut = "C:/Users/Hugo/Desktop/Out.txt";
		String wordToFind = "Ze";
		String newWord = "Jose";
		
		
		//
		Assert.assertTrue (FileUtils.copyAndReplace(fileIn, fileOut, wordToFind, newWord));
	}
}