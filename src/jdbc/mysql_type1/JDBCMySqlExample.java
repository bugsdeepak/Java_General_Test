package jdbc.mysql_type1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMySqlExample {
    
    private static Connection connection;
    
    private static Statement stmt;
    
    private static String connectionUrl = "jdbc:odbc:test";
    private static String userName = "root";
    private static String password = "deepak";
    
    public static String driverClassName = "sun.jdbc.odbc.JdbcOdbcDriver";
    
    private void loadClass() {
        
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private void getConnected() {
        try {
            connection = DriverManager.getConnection(connectionUrl, userName,
                    password);
            
            DatabaseMetaData dbMetaData = connection.getMetaData();
            
            
            
            
            stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            //ResultSet.TYPE_SCROLL_SENSITIVE
            //If you get a record, and then some other user changes that record, 
            //then if you get that record again from the same result set, 
            //do you want to see the changes that other user made
            
            //ResultSet.TYPE_SCROLL_INSENSITIVE;
            //do you want to see the same data you got the first time
            
            //ResultSet.TYPE_FORWARD_ONLY => The result set is not scrollable
            
            //The second argument is one of two ResultSet constants for specifying 
            //whether a result set is read-only or updatable: 
            //CONCUR_READ_ONLY and CONCUR_UPDATABLE . The point to remember here 
            //is that if you specify a type, you must also specify whether it is read-only or updatable
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void getValues() throws Exception {
        
       loadClass();
       
       getConnected();
       
       String sql = "select * from project where project_code in (select project_code from project) AND" +
            " project_name in (select project_name from project)";
       ResultSet rs = null;
       
       try {
           
           rs = stmt.executeQuery(sql);
           
           //More details about the database column name are avilable in RS Meta data.
           ResultSetMetaData rsMetaData = rs.getMetaData();
           //get the count of the columns in the table
           rsMetaData.getColumnCount();
           //get the column name
           rsMetaData.getColumnName(1);
           //get the data type of the column, Return value is one of the constants
           //of java.sql.Type
           rsMetaData.getColumnType(1);
           //get the database specific type name
           rsMetaData.getColumnTypeName(1);
           //get the Table name
           rsMetaData.getTableName(1);
           //whether the column is automaticlly numbered, thus read-only.
           rsMetaData.isAutoIncrement(1);
           //whether the column allows nullable values - Nullablility
           // returns the constants in ResultSetMetaData
           rsMetaData.isNullable(1);
           
           while(rs.next()) {
               System.out.println("Project Name :" + rs.getString("project_name"));
           }
           
           //update the table
           //even thoug I execute an update statment- it will not be 
           //executed on the DB since statement is CONCUR_READ_ONLY
           //But no error message
           System.out.println("updated : " + stmt.executeUpdate("update project set project_name = 'qa13_test1' where" +
                " project_name = 'qa13_test12345'"));
           
       } catch (SQLException ex) {
           ex.printStackTrace();
       } finally {
           
           if(rs != null) {
               rs.close();
               //A ResultSet object is also automatically closed when it is garbage collected
           }
           else{
               System.out.println("rs is null");
           }
               
           if(stmt != null) {
               stmt.close();
               //Note: A Statement object is automatically closed when it is garbage collected. 
               //When a Statement object is closed, its current ResultSet object, if one exists, is also closed. 
           }
           if(connection != null) {
               connection.close();
               //A Connection object is automatically closed when it is garbage collected. 
               //Certain fatal errors also close a Connection object.
           }
       }
    }
    
    public static void main(String[] args) throws Exception {
        
        /**
         * The following error occurred when the netwok cable is unplugged
         * during the execution of the statement "rs = stmt.executeQuery(sql);"         
         */
        
        //An I/O error occured while sending to the backend. 
        //Cause: java.net.SocketException - Connection reset
        
        new JDBCMySqlExample().getValues();
    }
}
