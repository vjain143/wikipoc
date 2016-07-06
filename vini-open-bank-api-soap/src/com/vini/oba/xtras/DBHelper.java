package com.vini.oba.xtras;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBHelper
{
	public static void main(String[] args)
	{
		System.out.println("inise");
		// Load the driver.
		try
		{
			 Class.forName("org.objectweb.rmijdbc.Driver").newInstance();
			// Create a connection. The first command line parameter is
			// the directory containing the .csv files.
			// A single connection is thread-safe for use by several threads.
			String url = "jdbc:relationaljunction:csv:D:/Workspace/workspace_java/vini-open-bank-api/vini-oba?singletonConnection=true";
			
			 // in this example an RMI host will point to local host
            String rmiHost = "//" + java.net.InetAddress.getLocalHost().getHostName();

            // RmiJdbc URL is of the form:
            // jdbc:rmi://<rmiHostName[:port]>/
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:rmi:" + rmiHost + "/" + url);
			
			// Create a Statement object to execute the query with.
			// A Statement is not thread-safe.
			Statement stmt = conn.createStatement();
			// Select the ID and NAME columns from sample.csv
			// ResultSet results = stmt.executeQuery("SELECT ID,NAME FROM
			// vini-oba where ID='10'");
			ResultSet results = stmt.executeQuery("INSERT INTO vini-oba VALUES(10,VIVEK)");
			// Dump out the results to a CSV file with the same format
			// using CsvJdbc helper function
			//results.insertRow();
			// Clean up
			conn.close();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
