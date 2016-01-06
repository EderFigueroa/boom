package com.boom.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class VideosController{
  @RequestMapping("/video")
  public String index(){
    System.out.println("testing");
    return "video";
  }
}
