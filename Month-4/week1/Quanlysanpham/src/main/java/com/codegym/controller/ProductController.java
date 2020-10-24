package com.codegym.controller;
import com.codegym.model.Products;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService = new ProductServiceImpl();

    @GetMapping("/list")
    public String index(Model model) {
        List<Products> productsList = productService.findAll();
        model.addAttribute("productsList", productsList);
        return "list";
    }
    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Products());
        return "/create";
    }
    @PostMapping("/product/save")
    public String save(Products products, RedirectAttributes redirect) {
        products.setId((int)(Math.random() * 10000));
        productService.save(products);
        redirect.addFlashAttribute("success", "Saved product successfully!");
        return "redirect:/list";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }
    @PostMapping("/product/update")
    public String update(Products products, RedirectAttributes redirect) {
        productService.update(products.getId(), products);
        redirect.addFlashAttribute("success", "Modified product successfully!");
        return "redirect:/list";
    }
    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/delete";
    }
    @PostMapping("/product/delete")
    public String delete(Products product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/list";
    }
    @GetMapping("/product/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }

}
