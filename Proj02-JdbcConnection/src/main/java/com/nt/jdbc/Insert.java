
package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Insert{
 private static final String INSERT_QUERY="INSERT INTO person VALUES(?,?,?,?)"; 
 
	public static void main(String[] args) {
		Scanner sc=null;
		int pid=0,age=0;
		String pname=null,add=null;
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			//read inputs
			sc=new Scanner(System.in);
			if(sc!=null) {
				System.out.println("enter person id::");
				pid=sc.nextInt();
				System.out.println("Enter person name::");
				pname=sc.next();
				System.out.println("enter person age::");
				age=sc.nextInt();
				System.out.println("Enter person addres::");
				add=sc.next();
			
			}//if
			
			//Load jdbc driver
			   Class.forName("org.postgresql.Driver");
			 //establish the connection
			   con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","system");
			  //create PReparedStatement object
			   if(con!=null)
				   ps=con.prepareStatement(INSERT_QUERY);
			   //set query param values
			   if(ps!=null) {
				   ps.setInt(1,pid);
				   ps.setString(2,pname);
				   ps.setInt(3, age);
				   ps.setString(4,add);
				}
			   //execute the SQL query
			   if(ps!=null)
				   count=ps.executeUpdate();
			   
			   //process the results
			    if(count==0)
			    	System.out.println("Record not inserted");
			    else
			    	System.out.println("Record inserted");
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//close jdbc objs
			try {
			  if(ps!=null)
				  ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				  if(con!=null)
					  con.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
			try {
				  if(sc!=null)
					  sc.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		}//finally

	}//main
}//class