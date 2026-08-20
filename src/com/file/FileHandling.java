package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		File file = new File("D:\\File Handling/hitxt");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
	       fis = new FileInputStream(file);
		   fos = new FileOutputStream(file);
		
		int temp;
		while((temp=fis.read())!=-1)
		System.out.print((char)temp);
		String s = "Good";
		fos.write(s.getBytes());
		
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally{
			try {
			fis.close();
			fos.close();
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

