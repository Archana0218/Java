package Jdbcprogram;
import java.sql.*;

public class firstJdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/user";
		String user="root";
		String password="123456";
		Connection con = DriverManager.getConnection(url,user,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT id,name FROM staudent");
		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			//System.out.println(rs.getString(3));
		}
		System.out.println("Student table created succesfully");
		System.out.println("row inserted successfully");
		st.close();
		
	}

}
                                                                                                                                                                      

