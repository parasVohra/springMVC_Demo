package com.pursharth.demoMVC;

import com.pursharth.demoMVC.model.Inquery;
import com.pursharth.demoMVC.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquery", new Inquery());
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/shop")
    public String shop(Model model){

        model.addAttribute("items",homeService.getItems() );

        return "shop";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @PostMapping("/shop")
    public String searchItem(Model model, @ModelAttribute Inquery inquery){
        String itemName = inquery.getSearchString();

        model.addAttribute("items",homeService.searchItem(itemName) );
        return "shop";
    }
}
