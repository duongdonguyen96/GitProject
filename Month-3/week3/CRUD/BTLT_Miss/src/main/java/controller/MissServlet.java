package controller;

import model.Miss;
import model.Province;
import service.MissService;
import service.MissServiceImpl;
import service.ProvinceService;
import service.ProvinceServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MissServlet", urlPatterns = "/misses")
public class MissServlet extends HttpServlet {
    private final MissService missService = new MissServiceImpl();
    private final ProvinceService provinceService = new ProvinceServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createMiss(request, response);

                break;
            case "edit":
                updateMiss(request, response);
                break;
            case "delete":
                deleteMiss(request, response);
                break;
            default:
                break;
        }
    }


    private void createMiss(HttpServletRequest request, HttpServletResponse response) {
        int id = (int) (Math.random() * 10000);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String dateofbirth = request.getParameter("dateofbirth");
        String phone = request.getParameter("phone");
        String idcard = request.getParameter("idcard");
        String job = request.getParameter("job");
        String educationallevel = request.getParameter("educationallevel");
        String nation = request.getParameter("nation");
        String workorstudyunit = request.getParameter("workorstudyunit");
        float height = Float.parseFloat(request.getParameter("height"));
        float weight = Float.parseFloat(request.getParameter("weight"));
        String othergifted = request.getParameter("othergifted");
        String image = request.getParameter("image");
        Province province1 = provinceService.findById(Long.parseLong(request.getParameter("province")));
        String province = province1.getName();

        Miss miss = new Miss(id, name, dateofbirth, address, phone, email,
                idcard, job, educationallevel, nation, workorstudyunit, height, weight, othergifted, image, province);
        this.missService.save(miss);
        RequestDispatcher dispatcher = request.getRequestDispatcher("miss/create.jsp");
        request.setAttribute("message", "New miss was created");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void updateMiss(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String dateofbirth = request.getParameter("dateofbirth");
        String phone = request.getParameter("phone");
        String idcard = request.getParameter("idcard");
        String job = request.getParameter("job");
        String educationallevel = request.getParameter("educationallevel");
        String nation = request.getParameter("nation");
        String workorstudyunit = request.getParameter("workorstudyunit");
        float height = Float.parseFloat(request.getParameter("height"));
        float weight = Float.parseFloat(request.getParameter("weight"));
        String othergifted = request.getParameter("othergifted");
        String image = request.getParameter("image");
        Province province1 = provinceService.findById(Long.parseLong(request.getParameter("province")));
        String province = province1.getName();


        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        if (miss == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            miss.setId(id);
            miss.setName(name);
            miss.setEmail(email);
            miss.setAddress(address);
            miss.setDateOfBirth(dateofbirth);
            miss.setPhone(phone);
            miss.setIdCard(idcard);
            miss.setJob(job);
            miss.setEducationalLevel(educationallevel);
            miss.setNation(nation);
            miss.setworkOrStudyUnit(workorstudyunit);
            miss.setHeight(height);
            miss.setWeight(weight);
            miss.setOtherGifted(othergifted);
            miss.setImage(image);
            miss.setProvince(province);
            this.missService.update(id, miss);
            request.setAttribute("missList", miss);
            request.setAttribute("message", "Miss information was updated");
            dispatcher = request.getRequestDispatcher("miss/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteMiss(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        if (miss == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            this.missService.remove(id);
            try {
                response.sendRedirect("/misses");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            case "view":
                showViewForm(request, response);
                break;
            default:
                listMisses(request, response);
                break;
        }
    }

    private void showViewForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        if (miss == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("miss", miss);
            dispatcher = request.getRequestDispatcher("miss/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Miss miss = this.missService.findById(id);
        List<Province> provinceList = provinceService.findAll();
        request.setAttribute("provinceList", provinceList);
        RequestDispatcher dispatcher;
        if (miss == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("missList", miss);
            dispatcher = request.getRequestDispatcher("miss/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Miss miss = this.missService.findById(id);
        RequestDispatcher dispatcher;
        request.setAttribute("misslist", miss);
        dispatcher = request.getRequestDispatcher("miss/delete.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<Province> provinceList = provinceService.findAll();
        request.setAttribute("provinceList", provinceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("miss/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void listMisses(HttpServletRequest request, HttpServletResponse response) {
        List<Miss> missList = this.missService.findAll();
        request.setAttribute("missList", missList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("miss/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (
                ServletException | IOException e) {
            e.printStackTrace();
        }
    }


}
