package controller;

import dao.LoginDAO;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private static final long serianVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        String username = request.getParameter("name");
        String password = request.getParameter("password");

        LoginDAO loginDAO = new LoginDAO();
        User user = loginDAO.checkLogin(username, password);
        session.setAttribute("user", user);
        if (user == null) {
            String message = "Tai khoan hoac mat khau khong dung";
            request.setAttribute("message", message);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/login.jsp");
            dispatcher.forward(request, response);
        } else {
            if (user.getRole().equalsIgnoreCase("admin")) {
                response.sendRedirect("http://localhost:8080/producer?action=list");
            } else if (user.getRole().equalsIgnoreCase("user")) {
                response.sendRedirect("view/user_view/index.jsp");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "":
                    showFormLogin(request, response);
                    break;
                case "logout":
                    showLogOut(request, response);
                default:
                    showFormLogin(request, response);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showLogOut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/admin_view/dist/login.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showFormLogin(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/login.jsp");
        dispatcher.forward(request, response);
    }
}


