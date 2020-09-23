import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "HomeServlet", urlPatterns = "/login")

public class HomeServlet extends HttpServlet {
    public static Map<String, User> listUser = new HashMap<>();
    public static boolean check;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user1 = new User("dotanphuc@gmail.com", "dotanphuc", "DoTanPhuc", "25");
        User user2 = new User("dochanhtin@gmail.com", "dochanhtin", "DoChanhTin", "25");
        User user3 = new User("tranthivolong@gmail.com", "tranthivolong", "Volong", "25");
        User user4 = new User("tranthihuong@gmail.com", "tranthihuong", "TranThiHuong", "31");
        User user5 = new User("LeThiHiep@gmail.com", "lethihiep", "LeThiHiep", "26");
        User user6 = new User("duongdonguyen96@gmail.com", "duongdonguyen", "DuongDoNguyen", "23");


        listUser.put(user1.getEmail(), user1);
        listUser.put(user2.getEmail(), user2);
        listUser.put(user3.getEmail(), user3);
        listUser.put(user4.getEmail(), user4);
        listUser.put(user5.getEmail(), user5);
        listUser.put(user6.getEmail(), user6);

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        check = listUser.containsKey(email);
        writer.println("<html>");
        if (check) {
            User user = listUser.get(email);
            if (user.getPassword().equals(password)) {
                writer.println("<h1>Information:</h1>");
                writer.println("<h5>Email:" + user.getEmail() + "</h5>");
                writer.println("<h5>UserName:" + user.getUserName() + "</h5>");
                writer.println("<h5>Age:" + user.getAge() + "</h5>");
            }else {
                writer.println("<h1>Password is not right</h1>");
            }
        } else {
            writer.println("<h5>Not found</h5>");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
