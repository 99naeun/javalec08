package lecture;

import java.sql.*;
import java.sql.DriverManager;

//�ڹٿ��� DB�� ����Ҷ��� JDBC(Java DataBase Connectivity)
//java.sql ��Ű���� �����մϴ�.
//!)java.sql�� ��κ� �߻�Ŭ������ Interface�� �����Ǿ� �ְ�, 
//���� ���� �����ؾ��� DBMS���� �����ϴ� Driver��� ���� ����ؾ� �մϴ�.
//ex) mysql driver, Oracle driver(jdbc connect/j)
//Driver�� ���ϴµ��� ũ�� 2����
//1.DBMS ȸ�� ����Ʈ
//http://mysql.com
//2.Maven Repository(�������̳� ��Ÿ ��� �� �� ���)
//https://mvnrepository.com/


//JDBC �����ͺ��̽� �����
//1.����� JDBC driver�� �ε��Ѵ�.
//2.DB Connection�� �Ѵ�.
//3.���ǹ�(SQL)�� ������.
//4.3�� ����� �����Ѵ�.
//5.2������ �� Connection�� �ݴ´�.

public class DBcontrolEx {

	public static void main(String args[]) throws Exception{
		//1.�Ǵ�(mysql)�� jdbc driver(connector/j)�� �ε��Ѵ�.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Connection�� �δ´�.
		
		//DB�� �����ؼ� �α��α��� + ����� �����ͺ��̽�(����)���� ����
		//http://naver.com -> �ּ�
		//DBConnection�� �������� Host, id, password, port����
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://choo-mysql.cwhxo83amnox.ap-northeast-2.rds.amazonaws.com:3306/javalec08",
				//JAVA connection String
				"root",
				"a1234567890"
				
				);
		
		//--Read
//		String sql = "SELECT*FROM test_table";
		String sql = "SELECT*FROM test_table Where user_name = '������'";
		
		
		//�ڹٿ����� DB�� ���Ǹ� �� �� 2���� Ÿ��
		//1.statement,
		//2.prepardeStatement
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(
					String.format("user_no : %d, user_name : %s", rs.getInt("user_no"), rs.getString("user_name")
							)
					
					);
		}
		
		
		//Create -> Insert
//		sql = "insert into test_table(user_no,user_name)values('10','������')";
		
		sql = "insert into test_table(user_no,user_name)values(?,?)";
		//PreparedStatement ���
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 10);
		pstmt.setString(2, "�Ͼ��Ͼ�");
		pstmt.execute();
		
		
		//Update
		sql="update test_table set user_name = ? where user_name = ?";
	//pstmt2 = conn.prepareStatement(sql);
		PreparedStatement pstmt2 = conn.prepareStatement(sql);
		pstmt2.setString(1, "AAA");
		pstmt2.setString(2, "�Ͼ��Ͼ�");
		pstmt2.execute();
		
		//Delete
		//PreparedStatement pstmt3�� user_name='AAA'�ΰ͸� �����϶�
		sql="delete from test_table where user_name =?";
		PreparedStatement pstmt3 = conn.prepareStatement(sql);
		pstmt3.setString(1, "AAA");
		pstmt3.execute();
		
		
		conn.close();//5.Ŀ�ؼ��� �ݴ´�.(�ڿ� �ݳ�)
		
	}
	
}
