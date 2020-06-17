package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_library implements Auto_constant {

	public static String get(int row,int cell) throws IOException
	{String data;
		FileInputStream fi=new FileInputStream(epath);
		XSSFWorkbook a=new XSSFWorkbook(fi);
		data=a.getSheet(esheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}

}
