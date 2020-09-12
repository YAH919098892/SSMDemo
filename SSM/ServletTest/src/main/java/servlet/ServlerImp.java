package servlet;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServlerImp extends HttpServlet {
    public ServlerImp() {
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String method =req.getParameter("m");
       if (method.equals("add")){
           req.getSession().setAttribute("msg","执行了add的方法");
       }
       if (method.equals("delect")){
           req.getSession().setAttribute("msg","执行了delect的方法");
       }
       req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doPost(req,resp);
    }


}
