package programa;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

	

	private String driver;
	private String db;
	private String url;
	
	private Connection conn=null;

	
	public ConnectionDB(String driver, String db, String url) {
		this.driver = driver;
		this.db = db;
		this.url = url;
	}
	
	
	public void connect() {
		try {
			Class.forName(this.driver);
			conn =DriverManager.getConnection(this.url + this.db, "root","123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void disconnect() {
		try {
			conn.close();
			conn=null;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void getStateConnection() {
		try {
			if(!this.conn.isClosed())
				javax.swing.JOptionPane.showConfirmDialog(null, "conectado");
			else 
				javax.swing.JOptionPane.showConfirmDialog(null, "desconectado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

	

	
}
