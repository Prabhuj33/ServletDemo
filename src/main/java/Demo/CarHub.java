package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CarHub extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String name="unavo";
//		
//		PrintWriter pw=res.getWriter();
//		pw.print("my car name is::"+name);
	
	String CarName=req.getParameter("nameofthecar");
	PrintWriter pw=res.getWriter();
	pw.print("my car name is:::"+CarName);
	
	}

}
