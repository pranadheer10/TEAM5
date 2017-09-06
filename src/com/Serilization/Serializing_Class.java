package com.Serilization;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializing_Class {

	public boolean testSerialization() throws IOException {
		
		Workers w = new Workers();
		w.setId("1");
		w.setName("dhiru");
		w.setSsn("xxxxxxxxxx10");
		
		FileOutputStream fos= new FileOutputStream(new File("onj.ser"));
		
		ObjectOutputStream dos= new ObjectOutputStream(fos);
		
		dos.writeObject(w);
		
		return true;	
	}

}
