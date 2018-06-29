package Automation.Maven;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.opera.core.systems.scope.protos.SelftestProtos.SelftestResult.Result;

public class Dbconnection {
public static void main(String[] args)throws Exception {
	
		String dbUrl="jdbc:mysql://localhost:3306/batch01";
		// database connection statements 
		String username="root"; // username
		String password="sudheer"; //password
		
		Class.forName("com.mysql.jdbc.Driver"); // mysql driver to connect to db
		
		Connection Conn=DriverManager.getConnection(dbUrl,username,password);
		// establishing connection
	System.out.println("\n\n******Hi! GUYZ.... MY SQL DATABASE CONNECTED SUCCESSFULLY****** \n");
	System.out.println("******The Requested Information Please find below******\n\n");
				
	Statement st = Conn.createStatement(); // statements to perform actions//connecting to the database
				
	ResultSet  rs = st.executeQuery("select *from employee"); // statement query
	     
	while(rs.next())
	   {   // looping to print all employees information
	     System.out.println("==================================================");
	     System.out.println("employee id :"+rs.getInt("eid"));
	     // to print emp id
	     System.out.println("employee name :"+rs.getString("ename")); 
	     // to print emp name
	          System.out.println("employee Age :"+rs.getInt("eage")); 
	          // tp print emp age
	        //   System.out.println("student address :"+rs.getString("saddress")); 
	          // to print emp address
	          System.out.println("employee salary :"+rs.getInt("esalary"));  
	          // to print emp salary
	       }
	   	       Conn.close();// to close the database automatically 
}
}



  
    
 