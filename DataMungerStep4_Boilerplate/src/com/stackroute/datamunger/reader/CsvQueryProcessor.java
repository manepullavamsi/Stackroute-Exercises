package com.stackroute.datamunger.reader;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {

	/*
	 * Parameterized constructor to initialize filename. As you are trying to
	 * perform file reading, hence you need to be ready to handle the IO Exceptions.
	 */
	String fileName;
	public CsvQueryProcessor(String fileName) throws FileNotFoundException {
		this.fileName=fileName;
		FileReader fileReader=new FileReader(fileName);

	}

	/*
	 * Implementation of getHeader() method. We will have to extract the headers
	 * from the first line of the file.
	 */

	@Override
	public Header getHeader() throws IOException {
		FileReader fileReader=new FileReader(fileName);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String []s=bufferReader.readLine().trim().split(",");
		fileReader.close();
		bufferReader.close();
		Header header=new Header();
		header.setHeaders(s);
		// populate the header object with the String array containing the header names
		return header;
	}

	/**
	 * This method will be used in the upcoming assignments
	 */
	@Override
	public void getDataRow() {

	}

	/*
	 * Implementation of getColumnType() method. To find out the data types, we will
	 * read the first line from the file and extract the field values from it. In
	 * the previous assignment, we have tried to convert a specific field value to
	 * Integer or Double. However, in this assignment, we are going to use Regular
	 * Expression to find the appropriate data type of a field. Integers: should
	 * contain only digits without decimal point Double: should contain digits as
	 * well as decimal point Date: Dates can be written in many formats in the CSV
	 * file. However, in this assignment,we will test for the following date
	 * formats('dd/mm/yyyy',
	 * 'mm/dd/yyyy','dd-mon-yy','dd-mon-yyyy','dd-month-yy','dd-month-yyyy','yyyy-mm
	 * -dd')
	 */
	
	@Override
	public DataTypeDefinitions getColumnType() throws IOException {
		
		// checking for Integer

		// checking for floating point numbers

		// checking for date format dd/mm/yyyy

		// checking for date format mm/dd/yyyy

		// checking for date format dd-mon-yy

		// checking for date format dd-mon-yyyy

		// checking for date format dd-month-yy

		// checking for date format dd-month-yyyy

		// checking for date format yyyy-mm-dd
		FileReader fileReader=new FileReader(fileName);
		BufferedReader bufferReader=new BufferedReader(fileReader);
		String line1=bufferReader.readLine();
		String line2= bufferReader.readLine();
		String line[]=line2.split(",",line1.length());
		String []dataTypes=new String[line.length];
		int i=0;
		for(i=0;i<line.length;i++)
		{
			try
			{
				Integer value=Integer.parseInt(line[i]);
				dataTypes[i]=value.getClass().getName();
			}
			catch (NumberFormatException e)
			{
				try {
					Float value=Float.parseFloat(line[i]);
					dataTypes[i]=value.getClass().getName();
				}
				catch (NumberFormatException ae) {
					Pattern pattern = Pattern.compile("(^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$)");
					Matcher matcher = pattern.matcher(line[i]);

					if (line[i].isEmpty()) {
						dataTypes[i] = "java.lang.Object";
					} else if (matcher.matches()) {
						dataTypes[i] = "java.util.Date";
					} else {
						dataTypes[i] = line[i].getClass().getName();

					}
				}
			}
		}
		DataTypeDefinitions dataTypeDefinitions=new DataTypeDefinitions();
		dataTypeDefinitions.setDataTypes(dataTypes);

		return dataTypeDefinitions;
	}

}
