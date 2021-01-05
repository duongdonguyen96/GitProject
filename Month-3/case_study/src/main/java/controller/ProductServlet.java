package controller;

import dao.ProducerDAO;
import dao.ProductDAO;
import dao.TypeDAO;
import model.Producer;
import model.Product;
import model.Type;
import model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ProductDAO productDAO;
    private TypeDAO typeDAO;
    private ProducerDAO producerDAO;

    public void init() {
        productDAO = new ProductDAO();
        typeDAO = new TypeDAO();
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
                    insertProduct(request, response);
                    break;
                case "edit":
                    updateProduct(request, response);
                    break;
                case "search":
                    searchWithNameOfProduct(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchWithNameOfProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("search");
        List<Product> productList = productDAO.searchWithName(name);
        request.setAttribute("productList", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/productList.jsp");
        dispatcher.forward(request, response);

    }
//      response.setContentType("text/html;charset=UTF-8");
//    HttpSession session = request.getSession();
//    User account = (User) session.getAttribute("user");
//        if (account != null) {
//        String action = request.getParameter("action");

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
                        deleteProduct(request, response);
                        break;
                    case "sort":
//                    sortUser(request, response);
                        break;
                    case "paging":
                        listPaging(request,response);
                        break;

                    default:
                        listPaging(request,response);
//                        listProduct(request, response);
//                        break;
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

    private void listPaging(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String index =request.getParameter("index");
        if (index==null){
            index="1";
        }
        int indexPage = Integer.parseInt(index);
        List<Product> productList = productDAO.getPaging(indexPage);
        request.setAttribute("productList",productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/productList.jsp");
        dispatcher.forward(request, response);

    }

//    private void sortUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Producer> producers = producerDAO.sortAllUsers();
//        request.setAttribute("listUser", producers);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
//        dispatcher.forward(request, response);
//
//    }

//    private void listProduct(HttpServletRequest request, HttpServletResponse response)
//            throws Exception {
//        List<Product> productList = productDAO.getAll();
//        request.setAttribute("productList", productList);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/productList.jsp");
//        dispatcher.forward(request, response);
//    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        List<Type> typeList = typeDAO.getAll();
        request.setAttribute("typeList", typeList);
        List<Producer> producers = new ProducerDAO().getAll();
        request.setAttribute("producers", producers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/productCreate.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productDAO.findById(id);
        request.setAttribute("product", product);
        List<Type> typeList = typeDAO.getAll();
        request.setAttribute("typeList", typeList);
        List<Producer> producerList = producerDAO.getAll();
        request.setAttribute("producerList", producerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/productEdit.jsp");
        dispatcher.forward(request, response);

    }

    private String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename"))
                return content.substring(content.indexOf("=") + 2, content.length() - 1);
        }
        return null;
    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String message = "Thêm sản phẩm thành công";
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String name = request.getParameter("name");
        int amount = Integer.parseInt(request.getParameter("amount"));
        String image = request.getParameter("image");
        int amountSold = Integer.parseInt(request.getParameter("amountSold"));
        int evaluate = Integer.parseInt(request.getParameter("evaluate"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        int type_id_type = Integer.parseInt(request.getParameter("type_id_type"));
        int idProducer = Integer.parseInt(request.getParameter("idProducer"));
        Product product = new Product(price, description, name, amount, image, amountSold, evaluate, discount, type_id_type, idProducer);
        productDAO.save(product);
//        List<Type> typeList = typeDAO.getAll();
//        request.setAttribute("typeList", typeList);
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/productCreate.jsp");

        dispatcher.forward(request, response);
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String message = "Chỉnh sửa sản phẩm thành công";
        int id = Integer.parseInt(request.getParameter("id"));
        int price = Integer.parseInt(request.getParameter("price"));
        String description = request.getParameter("description");
        String name = request.getParameter("name");
        int amount = Integer.parseInt(request.getParameter("amount"));
        String image = request.getParameter("image");
        int amountsold = Integer.parseInt(request.getParameter("amountSold"));
        int evaluate = Integer.parseInt(request.getParameter("evaluate"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        int type_id_type = Integer.parseInt(request.getParameter("type_id_type"));
        int idProducer = Integer.parseInt(request.getParameter("idProducer"));
        Product product = new Product(id, price, description, name, amount, image, amountsold, evaluate, discount, type_id_type, idProducer);
        productDAO.update(product);
        request.setAttribute("product", product);
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/productEdit.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        productDAO.delete(id);
        List<Product> productList = productDAO.getAll();
        request.setAttribute("productList", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/productList.jsp");
        dispatcher.forward(request, response);
    }
}