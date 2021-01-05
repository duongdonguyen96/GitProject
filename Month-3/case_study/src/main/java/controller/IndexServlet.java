package controller;

import dao.ProductDAO;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "IndexServlet", urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");


        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "":
                    showIndexPage(request, response);
                    break;
                default:
                    showIndexPage(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void showIndexPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        response.sendRedirect("view/user_view/index.jsp");
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user_view/index.jsp");
        dispatcher.forward(request, response);


    }
}

