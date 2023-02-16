package com.example.books.models;

public class Book {
  private String title;
  private String author;
  private Integer pages; 
  private String description;


  public Book() {

  }


  public Book(String title, String author, Integer pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;
    // this.description = description;
  }


  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Integer getPages() {
    return this.pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public String getDescription() {
    return this.description;
  }

  // public void setDescription(String description) {
  //   this.description = description;
  // }



}
