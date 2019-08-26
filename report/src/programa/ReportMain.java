package programa;

import java.awt.Event;
import java.awt.EventQueue;

public class ReportMain {

	
	private static ConnectionDB con;
	
	public static void main(String[] args) {
		
		conectToDatabase();
		OpenReportFrame();
		
	}

	
	private static void conectToDatabase() {
		String driver="org.postgres.jdbc.Driver";
		String url="jdbc.postgres://localhost:5432/";
		String db="postgres";
		
		con = new ConnectionDB(driver, db, url);
		con.connect();
		
	}
	
	private static void OpenReportFrame() {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
				ReportFrame frame= new ReportFrame(con.getConn());
					frame.setVisible(true);
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
		 
	}

	
}
