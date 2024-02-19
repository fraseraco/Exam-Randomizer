package com.fraseraco.ExamScrambler;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App 
{
	public static XSSFWorkbook wb;
	
    public static void main( String[] args )
    {

        FileHandler fh = new FileHandler();
        fh.readFilename();
        try {
			fh.openFile();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("EDE Exception");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOE Exception");
		}
        
    }
}
