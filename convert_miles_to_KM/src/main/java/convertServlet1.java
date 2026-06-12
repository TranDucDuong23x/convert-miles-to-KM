import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class convertServlet1 extends HttpServlet{
    protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        float miles = Float.parseFloat(request.getParameter("Miles"));
        float kilomet = miles * 1.6f;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out
        } catch (Exception e) {
        }
    }
}