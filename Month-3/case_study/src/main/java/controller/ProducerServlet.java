package controller;

import dao.ProducerDAO;
import dao.TypeDAO;
import model.Producer;
import model.Product;
import model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "UserServlet", urlPatterns = "/producer")
public class ProducerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ProducerDAO producerDAO;
    public void init() {
        producerDAO = new ProducerDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertProducer(request, response);
                    break;
                case "edit":
                    updateProducer(request, response);
                    break;
                case "search":
//                    searchUserByCountry(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private void searchUserByCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("search");
//        List<Producer> producers = producerDAO.s(name);
//        request.setAttribute("listUser", listUser);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
//        dispatcher.forward(request, response);
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        User account = (User) session.getAttribute("user");
        if (account != null) {
            String action = request.getParameter("action");

            try {
                switch (action) {
                    case "create":
                        showNewForm(request, response);
                        break;
                    case "edit":
                        showEditForm(request, response);
                        break;
                    case "delete":
                        deleteProducer(request, response);
                        break;
                    case "view":
//                    viewProducer(request, response);
                        break;

                    default:
                        listProducer(request, response);
                        break;
                }
            } catch (SQLException ex) {
                throw new ServletException(ex);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            response.sendRedirect("view/admin_view/dist/login.jsp");
        }
    }

//    private void viewProducer(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        int id = Integer.parseInt(request.getParameter("id"));
//        Producer producer = producerDAO.findByIdView(id);
//        request.setAttribute("producer",producer);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/viewProducer.jsp");
//        dispatcher.forward(request, response);
//    }

//    private void sortUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Producer> producers = producerDAO.sortAllUsers();
//        request.setAttribute("listUser", producers);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
//        dispatcher.forward(request, response);
//
//    }

    private void listProducer(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        List<Producer> producerList = producerDAO.getAll();
        request.setAttribute("producerList", producerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/producerList.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/producerCreate.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        Producer producer = producerDAO.findById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/producerEdit.jsp");
        request.setAttribute("producer", producer);
        dispatcher.forward(request, response);

    }

    private void insertProducer(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String message = "Thêm đã xong";
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Producer producer = new Producer(name, phone, address);
        producerDAO.save(producer);
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/producerCreate.jsp");
        dispatcher.forward(request, response);
    }

    private void updateProducer(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String message = "Sửa đã xong";
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Producer producer = new Producer(id, name, phone, address);
        producerDAO.update(producer);
        request.setAttribute("message", message);
        request.setAttribute("producer", producer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/producerEdit.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteProducer(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        producerDAO.delete(id);
        List<Producer> producerList = producerDAO.getAll();
        request.setAttribute("producerList", producerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/producerList.jsp");
        dispatcher.forward(request, response);
    }
}