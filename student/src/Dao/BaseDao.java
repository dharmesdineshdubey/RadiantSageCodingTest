package Dao;

import java.sql.*;
public class BaseDao {
	
	        public static Connection getCon(){
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
		}
		   public static void closeCon(Connection con){
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	

}
