package com.abhinavan.spring5webapp.bootstrap;

import com.abhinavan.spring5webapp.models.Author;
import com.abhinavan.spring5webapp.models.Book;
import com.abhinavan.spring5webapp.repositories.IAuthorRepository;
import com.abhinavan.spring5webapp.repositories.IBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class BootStrapDataLoader implements CommandLineRunner
{
    private Logger LOGGER = Logger.getLogger("bootstrapDataLoader");
    private IAuthorRepository authorRepository;
    private IBookRepository bookRepository;

    public BootStrapDataLoader(IAuthorRepository authorRepository, IBookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("abhinav","anand");
        Book book1 = new Book("my childhood","1");

        authorRepository.save(author1);
        bookRepository.save(book1);

        LOGGER.log(Level.INFO,"Book and author saved successfully");


    }
}
