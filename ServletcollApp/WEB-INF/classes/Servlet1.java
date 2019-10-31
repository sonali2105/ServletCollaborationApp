import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Servlet1 extends HttpServlet {

public void service(HttpServletRequest req,HttpServletResponse res){
			PrintWriter out=null;
			try {
					res.setContentType("text/html");
					out=res.getWriter();
					String n=req.getParameter("name");
					out.println("<html><body>");
					out.println("<h1>My Web Application</h1>");
					out.println("Hello Servlet1");
					out.println("Name= "+n);
					res.sendRedirect("s2");
					res.sendRedirect("home.html");
					res.sendRedirect("www.google.com");
					out.println("Bye Servlet1");
					out.println("</body></html>");
				}catch(Exception ex) {
					out.println(ex);
				}
			}
	}