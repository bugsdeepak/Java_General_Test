package main.java.jdbc;

import java.sql.*;

public class JDBCExample {
    
    private static Connection connection;
    
    //simple statement
    private static Statement stmt;
    private static Statement stmt1;
    
    //prepared statement
    private static PreparedStatement pstmt;
    
    //callable statement - to call stoted procedures
    private static CallableStatement callableStmt;
    
    private static String connectionUrl = "main.java.jdbc:postgresql://192.168.8.246/rats_db";
    private static String userName = "rats_db";
    private static String password = "rats_db";
    
    public static String driverClassName = "org.postgresql.Driver";
    
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
            stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            //we can create more than one statement (hence result set) from the same
            //connection object
            stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            String pSql = "update project set project_name = ? where project_code = ?";
            
            pstmt = connection.prepareStatement(pSql);
            
            String spSql = "{? = call is_account(?)}";
            
            //callable statement for calling stored procedure.
            callableStmt = connection.prepareCall(spSql,
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
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
       
       int min = Integer.MIN_VALUE;
       
       try {
           
           rs = stmt.executeQuery(sql);
           
           rs.next(); //move the cursor to the first row
           rs.absolute(10); //move the cursor to the 10th row
           rs.relative(-3);  //move the cursor to 7th row  
           
           while(rs.next()) {
               
               System.out.println("Project Name :" + rs.getString("project_name"));
               
           }
           
           //update the table
           //even thoug I execute an update statment- it will not be 
           //executed on the DB since statement is CONCUR_READ_ONLY
           //But not error message
           System.out.println("updated : " + stmt.executeUpdate("update project set project_name = 'qa13_test1' where" +
                " project_name = 'qa13_test12345'"));
           System.out.println("Cant not update - Because Statment is Read Only");
           System.out.println("Example For Callable Statement - calling stored procedure");
           
           // set the OUT parameter.
           callableStmt.registerOutParameter(1, Types.BOOLEAN);
           
           //set the input value
           String account = "asdfsdf";
           callableStmt.setString(2, account);
           
           //execute the callable statement
           callableStmt.execute();
           
           //get the result of Pl-Pgsql function, which is the first argument.
           if(callableStmt.getBoolean(1)) {
               System.out.println("Account " + account + " exists ");
           } else {
               System.out.println("Account " + account + " does not exists ");
           }
           
       } catch (SQLException ex) {
           ex.printStackTrace();
       } finally {
           
           if(rs != null) {
               rs.close();
               //A ResultSet object is also automatically closed 
               //when it is garbage collected
           }
           else{
               System.out.println("rs is null");
           }
               
           if(stmt != null) {
               stmt.close();
               //Note: A Statement object is automatically closed when it is garbage collected. 
               //When a Statement object is closed, its current ResultSet object, if one exists, is also closed. 
           }
           if(callableStmt != null) {
               callableStmt.close();
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
        
        new JDBCExample().getValues();
    }
}
