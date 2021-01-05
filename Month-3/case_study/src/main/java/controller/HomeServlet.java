package controller;

import dao.ProducerDAO;
import dao.ProductDAO;
import model.Producer;
import model.Product;
import model.Type;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "HomeServlet", urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    ProductDAO productDAO = new ProductDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "view":
                    showViewProduct(request, response);
                    break;
                default:
                    showIndexPage(request, response);
                case "":
                    showIndexPage(request, response);
                    break;
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

    private void showViewProduct(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productDAO.findById(id);
        request.setAttribute("product", product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user_view/viewProduct.jsp");
        dispatcher.forward(request, response);
    }
}

