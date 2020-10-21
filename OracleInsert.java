import java.sql.*;
import java.util.*;
import javax.sql.*;

public class OracleInsert
{
public static void main(String args[]) throws Exception
{
Connection con;
Statement stmt;
PreparedStatement ps;
ResultSet rs;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");

con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nik1995march");

stmt=con.createStatement();
System.out.println("1.insert \t 2.display \t 3.delete \t 4.update");
System.out.println("enter  your  choice"); 
Scanner sc=new  Scanner(System.in);
 int ch=sc.nextInt();
switch(ch)
{
	case 1:
	
int i=stmt.executeUpdate("insert into emp values(2,'qwer',10)");
System.out.println("insert successfull");
break;	

case 2:
System.out.println("Ro No \t Name \t Age");
rs=stmt.executeQuery("select *from emp");
while(rs.next())
{
	int r=rs.getInt(1);
	String sn=rs.getString(2);
	int sa=rs.getInt(3);
System.out.println(r+"\t"+sn+"\t"+sa);	
}
con.close();
break;

case 3:
System.out.println("enter employ id to delete record");
ps=con.prepareStatement("delete from emp where roll_no=?");
ps.setInt(1,sc.nextInt());
i=ps.executeUpdate();
 System.out.println("record delete successfull");

}
}
catch(SQLException e)
{ 
System.out.println(e);
}

finally{
System.out.println("qwerty");
}
}
}
