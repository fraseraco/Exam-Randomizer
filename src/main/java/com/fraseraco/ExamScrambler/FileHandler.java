package com.fraseraco.ExamScrambler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandler {
	private String filename;
	
	public void readFilename() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter filename or filepath if not in current directory: ");
		filename = console.next();
		System.out.println(filename);
		console.close();
	}
	
	public void openFile() throws InvalidFormatException, IOException {
		File inF = new File(filename);
		//OPCPackage pkg = OPCPackage.open(inF);
		App.wb = new XSSFWorkbook(inF);
	}
}
