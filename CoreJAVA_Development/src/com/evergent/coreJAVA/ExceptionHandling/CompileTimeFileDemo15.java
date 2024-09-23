package com.evergent.coreJAVA.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CompileTimeFileDemo15 {
	public static void main(String[] args) {
		try {
			File file = new File("c:/mydata/myinfo1.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}scanner.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}