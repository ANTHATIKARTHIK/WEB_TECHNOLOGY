package vce.controller;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import vce.model.StudInfo;
public class StudDept extends HttpServlet
{
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
        String rollnumber = request.getParameter("rollno");
		String deptcode=rollnumber.substring(8,11);
		HttpSession deptsession=request.getSession();
        String deptname="";
		try
		{
			
				if(deptsession.getAttribute(deptcode)!=null)
				{
					request.setAttribute("department","-fetched from session-"+(String)deptsession.getAttribute(deptcode));
					RequestDispatcher rd = request.getRequestDispatcher("Output.jsp");
					rd.forward(request, response);
				}
				else
				{
					StudInfo sinfo=new StudInfo(rollnumber);
					deptname=sinfo.getDepartment();
					if(deptname.equals("Wrong Input"))
					{
						response.sendRedirect("index.html");
					}
					else
					{
						deptsession.setAttribute(deptcode,deptname);
						request.setAttribute("department", deptname);
						RequestDispatcher rd = request.getRequestDispatcher("Output.jsp");
						rd.forward(request,response);
					}
				}
		}
		catch(ServletException se)
		{
			System.out.println(se);
		}
		
    }
}
 