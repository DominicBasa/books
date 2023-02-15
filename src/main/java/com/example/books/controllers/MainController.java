package com.example.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
  
  //? CREATE 

  @RequestMapping("books/new") 
  public String newBook() {
    return "new.jsp";
  }


  //? READ ALL  

  @RequestMapping("/")
  public String index() {
    return "index.jsp";
  }

  @PostMapping("/books")
  public String createBook() {
    return "redirect:/";
  }


  //? READ ONE 


  //? UPDATE 



  //? DELETE
}
