package com.boom.controllers.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController{

  @RequestMapping("/")
  public String index(){
    System.out.println("testing");
    return "tmp/hello";
  }

  @RequestMapping("/greeting")
  public String greeting( @RequestParam(value = "name", required = false, defaultValue="World") String name,
                          Model model){
    model.addAttribute("use", name);
    return "greeting";
  }
}
