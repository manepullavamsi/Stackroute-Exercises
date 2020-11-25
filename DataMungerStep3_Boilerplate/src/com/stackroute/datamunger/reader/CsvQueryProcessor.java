package com.stackroute.datamunger.reader;

import java.io.*;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {

	// Parameterized constructor to initialize filename
	String fileName;
	public CsvQueryProcessor(String fileName) throws FileNotFoundException {
		this.fileName=fileName;
	}

	/*
	 * Implementation of getHeader() method. We will have to extract the headers
	 * from the first line of the file.
	 * Note: Return type of the method will be Header
	 */
	
	@Override
	public Header getHeader() throws IOException {

		// read the first line
		FileReader fileReader=new FileReader(fileName);
		BufferedReader br = new BufferedReader(fileReader);
		String []s=br.readLine().trim().split(",");
		fileReader.close();
		br.close();
		Header header=new Header();
		header.setHeaders(s);
		// populate the header object with the String array containing the header names
		return header;
	}

	/**
	 * getDataRow() method will be used in the upcoming assignments
	 */
	
	@Override
	public void getDataRow() {

	}

	/*
	 * Implementation of getColumnType() method. To find out the data types, we will
	 * read the first line from the file and extract the field values from it. If a
	 * specific field value can be converted to Integer, the data type of that field
	 * will contain "java.lang.Integer", otherwise if it can be converted to Double,
	 * then the data type of that field will contain "java.lang.Double", otherwise,
	 * the field is to be treated as String. 
	 * Note: Return Type of the method will be DataTypeDefinitions
	 */
	
	@Override
	public DataTypeDefinitions getColumnType() throws IOException,FileNotFoundException {
		FileReader fileReader=new FileReader("data/ipl.csv");
		BufferedReader br=new BufferedReader(fileReader);
		String line1=br.readLine();
		String line2= br.readLine();
		String line[]=line2.split(",",line1.length());
		String []DataTypes=new String[line.length];
		int i=0;
		for(i=0;i<line.length;i++)
		{
			try
			{
				Integer value=Integer.parseInt(line[i]);
				DataTypes[i]=value.getClass().getName();
			}
			catch (Exception e)
			{
				DataTypes[i]=line[i].getClass().getName();
			}
		}
		DataTypeDefinitions dataTypeDefinitions=new DataTypeDefinitions();
		dataTypeDefinitions.setDataTypes(DataTypes);
		return dataTypeDefinitions;
	}
}
