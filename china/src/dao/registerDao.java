package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import enty.login;

public class registerDao {
	

	public  static int login1(login login) {
		System.out.print("swsws");
		 int result=-1;
		 Connection con=null;
		Statement sql =null;
		//ResultSet rs=null;
		PreparedStatement ps=null;
		int rows=0;
		 //boolean flag=false;
		try{ Class.forName("com.mysql.jdbc.Driver");
	 con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/usermessage","root","root");
	 String str="insert into user(name,pwd) values(?,?)";
	 ps=con.prepareStatement(str);
	  ps.setString(1, login.getName());
	  ps.setString(2, login.getPwd());
	 rows = ps.executeUpdate();
		//System.out.print("rows="+rows);
		if(rows>0){
			 result =rows;
		}
		if(result>0){
			return 1;
		}
		else{
			return 0;
		}
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			return -1;
			}
		catch(SQLException e){
			e.printStackTrace();
			return -1;
			}
		catch(Exception e){
			e.printStackTrace();
			return -1;
			}
		finally{
			try{
			
			if( sql!=null) sql.close();
			if(con!=null)con.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		}

	public static void SelectName(login logins) {
	
	}


}
