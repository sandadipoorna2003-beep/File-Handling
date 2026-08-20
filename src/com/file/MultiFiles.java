package com.file;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

public class MultiFiles {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) { 
		File file = new File("D://Files/File"+i);
		
		FileOutputStream fos = null;
		
		try {	
			
		 file.createNewFile();
		 fos = new FileOutputStream(file);
		 String data = "This is file "+i;
		 fos.write(data.getBytes());
		 
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				
				fos.close();
			}
			catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		}
	}

}
