package com.example.books.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  //? CREATE

  @RequestMapping("books/new")
  public String newBook() {
    return "new.jsp";
  }

  @PostMapping("/books")
  public String createBook(
    @RequestParam("title") String title,
    @RequestParam("author") String author,
    @RequestParam("pages") Integer pages, HttpSession session
  ) {
    System.out.println(title);
    session.setAttribute("title", title);
    session.setAttribute("author", author);
    session.setAttribute("pages", pages);
    return "redirect:/";
  }

  //? READ ALL

  @RequestMapping("/")
  public String index() {
    return "index.jsp";
  }
  //? READ ONE

  //? UPDATE

  //? DELETE
}
