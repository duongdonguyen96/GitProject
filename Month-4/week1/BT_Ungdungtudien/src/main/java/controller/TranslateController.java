package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
public class TranslateController {
    private static final HashMap<String, String> listDictionary = new HashMap<>();

    static {
        listDictionary.put("điện thoại", "phone");
        listDictionary.put("chuột", "mouse");
        listDictionary.put("máy tính", "computer");
        listDictionary.put("ti vi", "television");
        listDictionary.put("ngôi nhà", "house");
    }

    @GetMapping(value = "/translate")
    public String translate(HttpServletRequest request) {
        String vietnames = request.getParameter("vietnamese");
        if (listDictionary.containsKey(vietnames)) {
            request.setAttribute("vocabulary", listDictionary.get(vietnames));
        } else if(vietnames!=null && !vietnames.equals("")) {
            request.setAttribute("vocabulary", "Từ điển còn yếu");
        }

        return "index";

    }
}


