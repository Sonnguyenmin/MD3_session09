package ra.demo_baitap3;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")){
            request.setAttribute("username",username);

            //chuyển trang
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        }else{
            request.setAttribute("error","Login failed!");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }

    public void destroy() {
    }
}