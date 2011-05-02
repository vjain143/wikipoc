package com.wiki.poc.util;
import java.io.File;
import java.io.IOException;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import com.wiki.poc.dto.AccountDTO;

public class JXLUtil
{
	public static void writeExcel( List accountDTOList , String fileName)
	{
		try
		{
			/*[STEP 1] Create File Object.*/
			File file = new File(fileName);
			
			/*[STEP 2] */
			WritableWorkbook writableWorkbook = Workbook.createWorkbook( file );
			WritableSheet writableSheet = writableWorkbook.createSheet("The Sheet", 0);

			/*[STEP 3] Set writable font of label.*/
			WritableFont writableFont = new WritableFont(WritableFont.TAHOMA, 10, WritableFont.BOLD, true);
			WritableCellFormat writableCellFormat = new WritableCellFormat(writableFont);
			
			/*[STEP 4] Set Header Row.*/
			Label accountNumberHeaderLabel = new Label(0, 0, "Account Number", writableCellFormat);
			writableSheet.addCell(accountNumberHeaderLabel);

			Label accountHolderNameHeaderLabel = new Label(1, 0, "Account Holder Name", writableCellFormat);
			writableSheet.addCell(accountHolderNameHeaderLabel);

			Label accountCurrencyHeaderLabel = new Label(2, 0, "Account Currency", writableCellFormat);
			writableSheet.addCell(accountCurrencyHeaderLabel);

			Label accountHolderAddressHeaderLabel = new Label(3, 0, "Account Holder Address", writableCellFormat);
			writableSheet.addCell(accountHolderAddressHeaderLabel);
			
			Label accountHolderContactNoHeaderLabel = new Label(4, 0, "Account Holder Contact No", writableCellFormat);
			writableSheet.addCell(accountHolderContactNoHeaderLabel);
			
			/*[STEP 5] Set Data Row.*/
			int row = 1;
			for( int index = 0 ; index < accountDTOList.size(); index ++, row++ )
			{
				AccountDTO accountDTO = ( AccountDTO )accountDTOList.get(index);
				
				Label accountNumberLabel = new Label(0, row, accountDTO.getAccountNumber());
				writableSheet.addCell(accountNumberLabel);
				
				Label accountHolderNameLabel = new Label(1, row, accountDTO.getAccountHolderName());
				writableSheet.addCell(accountHolderNameLabel);
				
				Label accountCurrencyLabel = new Label(2, row, accountDTO.getAccountCurrency());
				writableSheet.addCell(accountCurrencyLabel);
				
				Label accountHolderAddressLabel = new Label(3, row, accountDTO.getAccountHolderAddress());
				writableSheet.addCell(accountHolderAddressLabel);
				
				Label accountHolderContactNoLabel = new Label(4, row, accountDTO.getAccountHolderContactNo());
				writableSheet.addCell(accountHolderContactNoLabel);
			}
			/*[STEP 6] Close workbook.*/
			writableWorkbook.write();
			writableWorkbook.close();		
			System.out.println("excel file created!!!");
		} 
		catch (IOException e)
		{
			System.err.println("Oh no - can't write the file, may be the file is in use.");
			e.printStackTrace();		
		} 
		catch (WriteException e)
		{
			System.err.println("Oh no - can't write the excel file.");
			e.printStackTrace();			
		}
	}	
}
