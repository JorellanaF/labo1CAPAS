package com.uca.capas.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {

    public MainServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = "test1";
        String pass = "pass1";

        String userReq = req.getParameter("username");
        String passReq = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        if (userReq != null & passReq !=null){
            if (userReq.equalsIgnoreCase(user) & passReq.equalsIgnoreCase(pass)){
                out.println("<html>");
                out.println("<body>");
                out.println("<h2>");
                out.println("Acceso permitido");
                out.println("</h2>");
                out.println("</body>");
                out.println("</html>");
            }
            else {
                out.println("<html>");
                out.println("<body>");
                out.println("<h2>");
                out.println("Acceso denegado");
                out.println("</h2>");
                out.println("</body>");
                out.println("</html>");
            }
        }

    }
}
