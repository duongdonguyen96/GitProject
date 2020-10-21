package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ConvertMoneyController {
    @GetMapping(value = "/convert")
    public String convertMoney(HttpServletRequest request) {
        try {
            double vnd = Double.parseDouble(request.getParameter("vnd"));
            double usd = vnd / 22000;
            request.setAttribute("usd", usd);
            return "index";

        } catch (Exception e) {

            try {
                double usd = Double.parseDouble(request.getParameter("usd"));
                double vnd = usd * 22000;
                request.setAttribute("vnd", vnd);
                return "index";
            } catch (Exception e2) {
                return "index";
            }
        }
    }

}

