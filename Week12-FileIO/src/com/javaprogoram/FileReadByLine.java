package com.javaprogoram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadByLine {
	public static void main(String[] args) {
		File file = new File("member.txt");
		
		try {
			if (!file.exists())
				file.createNewFile();
			
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			fis.close();
			System.out.println("file 읽기 완료");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}