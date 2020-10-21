import java.sql.*;
import javax.sql.*;
import java.util.*;

public class OracleCon
{
public static void main(String args[])

{

try
{
Statement stmt;
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nik1995march");
System.out.println("insert");
PreparedStatement pt;
pt=con.prepareStatement("insert into emp values (?,?,?)");

pt.setInt(1,5);
pt.setString(2,"khh");
pt.setInt(3,91);

int i=pt.executeUpdate();
System.out.println("insertion sucessful");
ResultSet rs=stmt.executeQuery("select * from emp");
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
}
con.close();

}
catch(Exception e)
{ 
System.out.println(e);
}

}
}