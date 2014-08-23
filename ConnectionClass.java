package cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass
{
        static
        {
            try
            {
              Class.forName("oracle.jdbc.OracleDriver");
            }
            catch(ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        public static Connection getConnection()throws SQLException
        {
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","admin");
            return con;
        }
        public static void closeConnection(Connection con,Statement stmt,ResultSet rs)
        {
            try
            {
                if(con!=null)
                {
                    con.close();
                }
                if(stmt!=null)
                {
                    stmt.close();
                }
                if(rs!=null)
                {
                    rs.close();
                }
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }

}
