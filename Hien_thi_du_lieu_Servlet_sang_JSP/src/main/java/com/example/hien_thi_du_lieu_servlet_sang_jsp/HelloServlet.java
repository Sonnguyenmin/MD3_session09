package com.example.hien_thi_du_lieu_servlet_sang_jsp;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Integer userId = Integer.parseInt(request.getParameter("userId"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        Integer age = Integer.valueOf(request.getParameter("age"));

        request.setAttribute("userId", userId);
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("age", age);

        request.getRequestDispatcher("Result.jsp").forward(request, response);
    }

    public void destroy() {
    }
}