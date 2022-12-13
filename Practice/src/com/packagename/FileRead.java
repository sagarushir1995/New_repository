package com.packagename;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
	
		FileReader fr=new FileReader("C:\\Users\\sagar\\OneDrive\\Desktop\\File.txt");
		
			
			
			int i;
			while((i=fr.read()) != -1) 
			{
				System.out.print((char)i);
			}
			
		
			fr.close();
		
	}
}