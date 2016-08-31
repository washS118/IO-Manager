package com.gauldin.io.filemanager;

import com.gauldin.io.IoController;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileManager manager = IoController.GetAutoClosingManager();
		manager.SetReadFile("Test.txt");
		manager.SetWriteFile("Test.txt");
		for(int i = 0; i < 3; i++){
			manager.WriteLine("Yay");
		}
		
		String test1 = manager.ReadLine(2);
		String test2 = manager.ReadNextLine();
		System.out.println(test1 + "," + test2);
	}

}
