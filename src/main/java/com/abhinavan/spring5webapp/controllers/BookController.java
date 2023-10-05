package com.abhinavan.spring5webapp.controllers;

import com.abhinavan.spring5webapp.repositories.IBookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController
{

    private IBookRepository bookRepository;

    public BookController(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getAllBooks(Model model)
    {
        model.addAttribute("books",bookRepository.findAll());
        return "books/books";
    }
}
