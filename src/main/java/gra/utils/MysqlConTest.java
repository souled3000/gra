package gra.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlConTest {

	public static void main(String[] args) throws Exception {
		Demo.Do();
	}

}

class DBHelper {
	public static final String url = "jdbc:mysql://127.0.0.1:3306/crm?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
//	public static final String name = "com.mysql.jdbc.Driver";
	public static final String name = "com.mysql.cj.jdbc.Driver";
	public static final String user = "crm";
	public static final String password = "crm";


	public Connection conn = null;
	public PreparedStatement pst = null;

	public DBHelper(String sql) {
		try {
			Class.forName(name);// 指定连接类型
			conn = DriverManager.getConnection(url, user, password);// 获取连接
			pst = conn.prepareStatement(sql);// 准备执行语句
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			this.conn.close();
			this.pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

class Demo {  
    
    static String sql = null;  
    static DBHelper db1 = null;  
    static ResultSet ret = null;  
    
    public static void Do() {  
        sql = "select name from t_room";//SQL语句  
        db1 = new DBHelper(sql);//创建DBHelper对象
        
        try {  
            ret = db1.pst.executeQuery();//执行语句，得到结果集  
            while (ret.next()) {  
                String name = ret.getString(1);  
                System.out.println(name);  
            }//显示数据  
            ret.close();  
            db1.close();//关闭连接  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }
    
}