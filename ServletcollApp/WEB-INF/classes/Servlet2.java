import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Servlet2 extends HttpServlet {
public void service(HttpServletRequest  req,HttpServletResponse res) {
			PrintWriter out=null;
			try {
					res.setContentType("text/html");
					out=res.getWriter();
					String n=req.getParameter("name");
					out.println("<html><body>");
					out.println("<h1>My Web Application</h1>");
					out.println("Hello Servlet2");
					out.println("Name= "+n);
					out.println("Bye Servlet2");
				}catch(Exception ex) {
				out.println(ex);
				}
		}
	}