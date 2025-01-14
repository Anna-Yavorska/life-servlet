package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value="/test")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String response = """
                <html>
                <body>
                <h1>Hello World!</h1>
                <div style="background-color:red; color: yellow;"><h3>Developing is cool</h3></div>
                </body>
                </html>
                """;
        resp.setHeader("Content-Type", "text/html");
        PrintWriter writer = resp.getWriter();
        writer.write(response);
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("POST RESPONSE");
        writer.close();
    }
}

