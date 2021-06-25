package com.composemail.helper;

import com.composemail.configurationreader.Configuration_Reader;

public class File_Reader_Manager {

	private File_Reader_Manager() {
	}
	
	public static File_Reader_Manager getInstance() {

		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public static Configuration_Reader getInstancrCR() throws Throwable {

		Configuration_Reader cr = new Configuration_Reader();
		return cr;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
