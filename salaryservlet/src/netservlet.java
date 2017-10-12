import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class netservlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		float gross=(Float)req.getAttribute("gr");
		float net=gross-(gross*0.8f);
		pw.println("<h1>Net Salary"+net+"</h1>");
		pw.close();
	}
}		