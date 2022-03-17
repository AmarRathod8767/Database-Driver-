package dao;
import java.sql.*;

public class Datahelper {
     static Connection conn;
     static Statement st;
	public static void connection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ierp","root","root");
		st=conn.createStatement();
		
	}
	public static int dmlOpe(String query) throws SQLException
	{
		return st.executeUpdate(query);
	}
	public static ResultSet dqlOpe(String query) throws SQLException
	{
		return st.executeQuery(query);
		
	}
	public static void closeConnection() throws SQLException
	{
		conn.close();
	}
}
