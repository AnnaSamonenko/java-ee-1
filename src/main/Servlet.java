package main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String company = request.getParameter("company");
        Double price =  Double.parseDouble(request.getParameter("price"));
        String type = request.getParameter("type");
        Shares sh = new Shares(company, price, type);
        SharesDAO dao = new SharesDAOimpl();
        dao.create(sh);
        response.sendRedirect("index.jsp");
    }
}