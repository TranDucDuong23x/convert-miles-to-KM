import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="convertServlet",urlPatterns = {"/ketqua"})
public class convertServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        float miles=Float.parseFloat(request.getParameter("Miles"));
        float kilomet=miles*1.6f;
        request.setAttribute("mile", miles);
        request.setAttribute("kilomet", kilomet);
        String resultPage = "result.jsp";
        RequestDispatcher dispatcher=request.getRequestDispatcher(resultPage);
        dispatcher.forward(request, response);
    }
 
    
}