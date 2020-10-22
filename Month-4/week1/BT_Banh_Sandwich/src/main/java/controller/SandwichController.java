package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping(value = "/sandwich", method = RequestMethod.GET)
    public String save(ModelMap model, @RequestParam(required = false, name = "condiment") String[] condiments) {
        model.addAttribute("condiments", condiments);
        return "sandwich";
    }
}




