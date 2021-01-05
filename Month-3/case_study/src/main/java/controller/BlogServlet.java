package controller;
import dao.BlogDAO;
import model.Blog;
import model.User;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "BlogServlet", urlPatterns = "/blog")
public class BlogServlet extends HttpServlet {
    private BlogDAO blogDAO;

    public void init() {
        blogDAO = new BlogDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertBlog(request, response);
                    break;
                case "edit":
                    updateBlog(request, response);
                    break;
                case "search":
//                    searchUserByCountry(request, response);
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateBlog(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String message = "Sửa đã xong";
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Blog blog = new Blog(id, title, content);
        blogDAO.update(blog);
        request.setAttribute("message", message);
        request.setAttribute("blog", blog);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/blogEdit.jsp");
        dispatcher.forward(request, response);
    }

    private void insertBlog(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String message = "Thêm đã xong";
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Blog blog = new Blog(title, content);
        blogDAO.save(blog);
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/blogCreate.jsp");
        dispatcher.forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
                        deleteBlog(request, response);
                        break;
                    case "sort":
//                    sortUser(request, response);
                        break;
                    default:
                        listBlog(request, response);
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            response.sendRedirect("view/admin_view/dist/login.jsp");
        }
    }

    private void listBlog(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Blog> blogList = blogDAO.getAll();
        request.setAttribute("blogList", blogList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/blogList.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteBlog(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        blogDAO.delete(id);
        List<Blog> blogList = blogDAO.getAll();
        request.setAttribute("blogList", blogList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/blogList.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int id = Integer.parseInt(request.getParameter("id"));
        Blog blog = blogDAO.findById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/blogEdit.jsp");
        request.setAttribute("blog", blog);
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/blogCreate.jsp");
        dispatcher.forward(request, response);
    }
}


////    private void searchUserByCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        String name = request.getParameter("search");
////        List<Producer> producers = producerDAO.s(name);
////        request.setAttribute("listUser", listUser);
////        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
////        dispatcher.forward(request, response);
////
////    }


////    private void sortUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        List<Producer> producers = producerDAO.sortAllUsers();
////        request.setAttribute("listUser", producers);
////        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
////        dispatcher.forward(request, response);
////
////    }

//    private void listType(HttpServletRequest request, HttpServletResponse response)
//            throws Exception {
//        List<Type> typeList = typeDAO.getAll();
//        request.setAttribute("typeList", typeList);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("view/admin_view/dist/typeList.jsp");
//        dispatcher.forward(request, response);
//    }
//

