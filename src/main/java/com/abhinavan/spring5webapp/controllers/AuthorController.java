package com.abhinavan.spring5webapp.controllers;

import com.abhinavan.spring5webapp.repositories.IAuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorController
{

    private IAuthorRepository authorRepository;

    public AuthorController(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public String getAllAuthor(Model model)
    {
        model.addAttribute("author",authorRepository.findAll());
        return "authors/list";
    }
}
