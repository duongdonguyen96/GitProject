package controller;

import dao.ProducerDAO;
import dao.TypeDAO;
import model.Producer;
import model.Type;
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

@WebServlet(name = "TypeServlet", urlPatterns = "/type")
public class TypeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TypeDAO typeDAO;

    public void init() {
        typeDAO = new TypeDAO();
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
                    insertType(request, response);
                    break;
                case "edit":
                    updateType(request, response);
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
            if (action == null) {
                action = "";
            }

            try {
                switch (action) {
                    case "create":
                        showNewForm(request, response);
                        break;
                    case "edit":
                        showEditForm(request, response);
                        break;
                    case "delete":
                        deleteType(request, response);
                        break;
                    case "sort":
//                    sortUser(request, response);
                        break;
                    default:
                        listType(request, response);
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

//    private void sortUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Producer> producers = producerDAO.sortAllUsers();
//        request.setAttribute("listUser", producers);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
//        dispatcher.forward(request, response);
//
//    }

    private void listType(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        List<Type> typeList = typeDAO.getAll();
        request.setAttribute("typeList", typeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/typeList.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/typeCreate.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        Type type = typeDAO.findById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/typeEdit.jsp");
        request.setAttribute("type", type);
        dispatcher.forward(request, response);

    }

    private void insertType(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String message = "Thêm đã xong";
        String name = request.getParameter("name");
        Type type = new Type(name);
        typeDAO.save(type);
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/typeCreate.jsp");
        dispatcher.forward(request, response);
    }

    private void updateType(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String message = "Sửa đã xong";
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Type type = new Type(id, name);
        typeDAO.update(type);
        request.setAttribute("message", message);
        request.setAttribute("type", type);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/typeEdit.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteType(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        typeDAO.delete(id);
        List<Type> typeList = typeDAO.getAll();
        request.setAttribute("typeList", typeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/typeList.jsp");
        dispatcher.forward(request, response);
    }
}