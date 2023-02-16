package com.example.books.controllers;

import com.example.books.models.Book;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  ArrayList<Book> books = new ArrayList<>();

  //? CREATE

  @RequestMapping("books/new")
  public String newBook() {
    return "new.jsp";
  }

  @PostMapping("/books")
  public String createBook(
    @RequestParam("title") String title,
    @RequestParam("author") String author,
    @RequestParam("pages") Integer pages,
    // @RequestParam("description") String description,
    HttpSession session
  ) {
    Book book = new Book(title, author, pages);
    System.out.println(book.getTitle());
    books.add(book);
    session.setAttribute("title", title);
    session.setAttribute("author", author);
    session.setAttribute("pages", pages);
    return "redirect:/";
  }

  //? READ ALL

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("books", books);
    return "index.jsp";
  }
  
  
  //? READ ONE
  @RequestMapping("/books/1")
  public String show(Model model) {
    model.addAttribute("books", books.get(1));
    model.addAttribute("books", books);
    return "show.jsp";
  }
  
  
  
  //? UPDATE

  
  
  
  
  //? DELETE
}
