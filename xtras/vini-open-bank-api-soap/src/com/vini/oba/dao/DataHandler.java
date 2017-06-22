package com.vini.oba.dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.vini.oba.dto.AccountDTO;
import com.vini.oba.dto.CustomerDTO;
public class DataHandler
{
	/**
	 * @param custID
	 * @return
	 */
	public CustomerDTO selectData(String custID)
	{
		CustomerDTO customerObject = null;
		try
		{
			File file = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = br.readLine()) != null)
			{
				List<String> items = Arrays.asList(line.split(","));
				
				if (custID.equals(items.get(0)))
				{
					customerObject = new CustomerDTO();
					customerObject.setCustomerId(items.get(0));
					customerObject.setFirstName(items.get(1));
					customerObject.setLastName(items.get(2));
					AccountDTO accountObject = new AccountDTO();
					accountObject.setAccountId(items.get(3));
					accountObject.setAccountNo(items.get(4));
					accountObject.setSortCode(items.get(5));
					customerObject.setAccountDTO(accountObject);
				}
			}
			br.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return customerObject;
	}
	// Local Class variable static File
	//
	public void insertData(String commaSeparated)
	{
		try
		{
			File file = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			Map<String, String> dataMap = new HashMap<String, String>();
			while ((line = br.readLine()) != null)
			{
				List<String> items = Arrays.asList(line.split(","));
				String key = items.get(0);
				dataMap.put(key, line);
			}
			br.close();
			boolean isDeleted = file.delete();
			System.out.println("File Deleted :: " + isDeleted);
			// WRITE LOGIC
			File filenew = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
			BufferedWriter writer = new BufferedWriter(new FileWriter(filenew, true));
			System.out.println("File Created :: " + filenew.exists());
			//
			for (String linetoWrite : dataMap.values())
			{
				writer.write(linetoWrite);
				writer.newLine();
			}
			writer.write(commaSeparated);
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void deleteData(String custID)
	{
		try
		{
			File file = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			Map<String, String> dataMap = new HashMap<String, String>();
			while ((line = br.readLine()) != null)
			{
				List<String> items = Arrays.asList(line.split(","));
				String key = items.get(0);
				if (!custID.equals(key))
				{
					dataMap.put(key, line);
				}
			}
			br.close();
			boolean isDeleted = file.delete();
			System.out.println("File Deleted :: " + isDeleted);
			// WRITE LOGIC
			File filenew = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
			BufferedWriter writer = new BufferedWriter(new FileWriter(filenew, true));
			System.out.println("File Created :: " + filenew.exists());
			//
			/*
			 * String [] linesToWrite = new String[dataMap.size()];
			 * dataMap.values().toArray(linesToWrite); for(int index =
			 * 0;index<linesToWrite.length; index++) {
			 * writer.write(linesToWrite[index]); }
			 */
			//
			for (String linetoWrite : dataMap.values())
			{
				writer.write(linetoWrite);
				writer.newLine();
			}
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void updateData(String commaSeparated)
	{
		try
		{
			File file = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
			FileInputStream fstream = new FileInputStream(file);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			List<String> inputValues = Arrays.asList(commaSeparated.split(","));
			String line = null;
			Map<String, String> dataMap = new HashMap<String, String>();
			while ((line = br.readLine()) != null)
			{
				List<String> items = Arrays.asList(line.split(","));
				String key = items.get(0);
				if (!inputValues.get(0).equals(key))
				{
					dataMap.put(key, line);
				}
			}
			br.close();
			boolean isDeleted = file.delete();
			System.out.println("File Deleted :: " + isDeleted);
			// WRITE LOGIC
			File filenew = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
			BufferedWriter writer = new BufferedWriter(new FileWriter(filenew, true));
			System.out.println("File Created :: " + filenew.exists());
			//
			for (String linetoWrite : dataMap.values())
			{
				writer.write(linetoWrite);
				writer.newLine();
			}
			writer.write(commaSeparated);
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void readData()
	{
		File file = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = "";
			StringBuilder sb = new StringBuilder();
			line = br.readLine();
			while (line != null)
			{
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();
			System.out.println("Read ::" + everything);
			br.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void writeData()
	{
		System.out.println("Please write the contents");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		System.out.println(text);
		File file = new File("C:/Users/nidhi/JavaFiles/testFile.csv");
		BufferedWriter writer;
		try
		{
			writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(text);
			writer.newLine();
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		scanner.close();
	}
	public static void main(String[] args)
	{
		DataHandler readWriteObject = new DataHandler();
		// CustomerDTO custoibject = readWriteObject.selectData("123");
		// readWriteObject.updateData("123,nidhi,jain,2,3,34");
		// readWriteObject.writeData();
		readWriteObject.insertData("112,nvivek,jain,2,5,74");
		// System.out.println(custoibject.getFirstName());
	}
}