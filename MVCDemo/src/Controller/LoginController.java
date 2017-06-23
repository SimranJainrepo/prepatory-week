package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginDetail;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String uname=request.getParameter("uname");
		String password=request.getParameter("passwd");
		LoginDetail login=new LoginDetail();
		login.setUname(uname);
		login.setPasswd(password);
		
		if(login.isValidLogin())
		{
			
			RequestDispatcher dispatch=request.getRequestDispatcher("Success.jsp");
			request.setAttribute("nm", uname);
			dispatch.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatch=request.getRequestDispatcher("Failure.jsp");
			dispatch.forward(request, response);
		}

		
	}

}
