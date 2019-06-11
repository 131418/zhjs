package dao;

import java.sql.*;
import enty.login;


public class loginDao {
	
	
 public  static int login1(login login) {
	 int result=-1;
	 Connection con=null;
	PreparedStatement pstmt =null;
	ResultSet rs=null;
	 //boolean flag=false;
	try{ Class.forName("com.mysql.jdbc.Driver");
 
con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/usermessage","root","root");
	String sql="select count(*) from user where name=?and pwd=?";
	 pstmt=con.prepareStatement(sql);
	 pstmt.setString(1, login.getName());
	 pstmt.setString(2, login.getPwd());
	 rs= pstmt.executeQuery();
	if(rs.next()){
		 result =rs.getInt(1);
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
		if(rs!=null)rs.close();
		if( pstmt!=null) pstmt.close();
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

public void SelectName(login logins) {
	
	
}


}
