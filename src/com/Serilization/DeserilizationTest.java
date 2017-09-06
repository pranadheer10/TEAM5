package com.Serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationTest {

	public boolean deserilizationTest() throws IOException, ClassNotFoundException {
		FileInputStream fis= new FileInputStream("onj.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Workers w= (Workers) ois.readObject();
		System.out.println(w.getName()+" \n"+w.getId()+"\n"+w.getSsn());
		return true;
	}
}
