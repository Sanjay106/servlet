import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class grossservlet extends HttpServlet
	{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
		float basic =Float.parseFloat(req.getParameter("basic"));
		float gross=basic+(basic*0.8f);
		req.setAttribute("gr",gross);
		RequestDispatcher rd = req.getRequestDispatcher("/net");
		rd.forward(req,res);
		}
	}	