import javax.servlet.*;
import java.io.*;
public class home extends GenericServlet{

	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter p=res.getWriter();
		p.println("<html>");
		p.println("<body>");
		p.println("<h1>Welcome to my HOME</h1>");
		p.println("</body>");
		p.println("</html>");
		p.close();
	}
}	