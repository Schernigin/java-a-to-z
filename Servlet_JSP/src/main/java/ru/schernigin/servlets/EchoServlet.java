package ru.schernigin.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class EchoServlet.
 * @author schernigin.
 * @since 03.04.2017.
 * @version 1.0
 */
public class EchoServlet extends HttpServlet {
    private static final Logger Log = LoggerFactory.getLogger(EchoServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = new PrintWriter(resp.getOutputStream());
        writer.append("<!DOCTYPE html>" +
                        "<html lang=\"en\">"+
                        "<head>"+
                            "<meta charset=\"UTF-8\">"+
                            "<title>Title</title>"+
                        "</head>"+
                        "<body>"+
                        "<form action='"+req.getContextPath()+"/echo' method '/post'>"+
                        "Name : <input type=text' name='login'/>"+
                        "<input type='submit'>"+
                        "</form>"+
                        "</body>"+
                        "</html>");
        writer.flush();
    }

}
