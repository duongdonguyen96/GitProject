package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculationController {
    @GetMapping(value = "/calculator")
    public String showForm() {
        return "calculator";
    }


    @PostMapping("/result")
    public String tinhToan(ModelMap modelMap, @RequestParam(name = "numberA") double numberA,
                           @RequestParam(name = "numberB") double numberB,
                           @RequestParam(name = "pheptinh") String pheptinh) {
        switch (pheptinh) {
            case "+":
                double result = numberA + numberB;
                modelMap.addAttribute("result", result);
                break;
            case "-":
                result = numberA - numberB;
                modelMap.addAttribute("result", result);
                break;
            case "*":
                result = numberA * numberB;
                modelMap.addAttribute("result", result);
                break;
            case "/":
                if (numberB == 0) {
                    modelMap.addAttribute("message", "Chia cho 0 cung duoc a ban");
                }
                result = numberA / numberB;
                modelMap.addAttribute("result", result);
                break;

        }
        return "calculator";
    }
}

//@Controller
//public class CalculatorController {
//    @GetMapping("/calculator")
//    public String calculator(ModelMap model, @RequestParam(required = false, name="number1") String strnumber1,
//                             @RequestParam(required = false, name="number2") String strnumber2) {
//        double number1=0;
//        double number2=0;
//        model.addAttribute("number1",number1);
//        model.addAttribute("number2",number2);
//        return "index";
//    }
//
//    @PostMapping("/result")
//    public String save(ModelMap model, @RequestParam(name="number1") double number1,
//                       @RequestParam(name="number2") double number2,
//                       @RequestParam(name="calculation") String calculation) {
//        try{
//            switch (calculation){
//                case "+":
//                    double result=number1+number2;
//                    model.addAttribute("result",result);
//                    break;
//                case "-":
//                    result=number1-number2;
//                    model.addAttribute("result",result);
//                    break;
//                case "*":
//                    result=number1*number2;
//                    model.addAttribute("result",result);
//                    break;
//                case "/":
//                    if(number2==0){
//                        String message="Khong the chia cho 0";
//                        model.addAttribute("message",message);
//                    } else {
//                        result = number1 / number2;
//                        model.addAttribute("result",result);
//                    }
//                    break;
//            }
//
//        } catch (Exception ex){
//            ex.printStackTrace();
//        } finally {
//            model.addAttribute("number1",number1);
//            model.addAttribute("number2",number2);
//            return "index";
//        }
//
//    }
//}
