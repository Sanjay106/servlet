import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class DBsrv extends HttpServlet{

Connection con=null;
PreparedStatement ptst=null;
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
{
	res.setContentType("html/text");
	PrintWriter pw=res.getWriter();
	int empid=Integer.parseInt(req.getParameter("emp.id"));
	String empname=req.getParameter("emp.name");
	float empsalary=Float.parseFloat(req.getParameter("emp.salary"));
	int depno=Integer.parseInt(req.getParameter("emp.dept"));
	try{
	Class.forName("org.h2.driver");
	Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/employee");
	ptst=con.prepareStatement("insert into employee values(?,?,?,?)");
	ptst.setInt(1,empid);
	ptst.setString(2,empname);
	ptst.setFloat(3,empsalary);
	ptst.setInt(4,depno);
	int a=ptst.executeUpdate();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	pw.println("Record inserted succesfully");
	}
	
	public void destroy()
	{
	try{
	if(ptst!=null)
	ptst.close();
	if(con!=null)
	con.close();
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}
	}
	
	