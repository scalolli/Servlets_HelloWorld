package org.hashgeek.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: Basu
 * Date: 3/25/12
 * Time: 9:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head><title>Hello, Cruel World!</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, Cruel World !</h1>");
        out.println("This is my first servlet.");
        out.println("</body>");
    }
}
