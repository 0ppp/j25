import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class shoppingmoll extends HttpServlet 
{

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws IOException, ServletException
  {
    resp.setContentType("text/html");
    PrintWriter pw=resp.getWriter();
      HttpSession session ;
    String nb=session.getAttribute("nb");
    int pn=Integer.parseInt(session.getAttribute("pn"));
   int p3=Integer.parseInt(req.getParameter("t3"));  
   int p4=Integer.parseInt(req.getParameter("t4"));  
   pw.println("p1="+p3);
   pw.println("p1="+p4);
   pw.println("p1="+nb);
   pw.println("p1="+pn);
   int total=p3+p4;
   pw.println("total amount ="+total);
   
  }
      
}
   
      



  
  