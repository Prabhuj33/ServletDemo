package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Division  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
     int number1=Integer.parseInt(req.getParameter("val1"));
     int number2= Integer.parseInt(req.getParameter("val2"));
     
     int result=number1-number2;
     
     PrintWriter pw=res.getWriter();
     pw.print("Division of two number value is" + result);
     
	}

}
