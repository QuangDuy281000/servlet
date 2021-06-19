package Controler;

import main.java.Bean.User;
import main.java.Dao.LoginDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logintest")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        User user = new User();
        user.setName(name);
        user.setPass(pass);
        boolean kt = LoginDao.kiemtra(pass);
        if (kt) {
            // tao moi 1 session
            HttpSession session = request.getSession(true);
            //luu 1 session
            session.setAttribute("sessionname", name);
            session.getAttribute("sessionname");
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/Logout.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("mess", "LOGIN FALL");
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/Login.jsp");
            rd.forward(request, response);
        }
    }
}
