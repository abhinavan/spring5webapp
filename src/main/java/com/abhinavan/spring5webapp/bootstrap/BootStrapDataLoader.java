package com.abhinavan.spring5webapp.bootstrap;

import com.abhinavan.spring5webapp.models.Address;
import com.abhinavan.spring5webapp.models.Author;
import com.abhinavan.spring5webapp.models.Book;
import com.abhinavan.spring5webapp.models.Publisher;
import com.abhinavan.spring5webapp.repositories.IAddressRepository;
import com.abhinavan.spring5webapp.repositories.IAuthorRepository;
import com.abhinavan.spring5webapp.repositories.IBookRepository;
import com.abhinavan.spring5webapp.repositories.IPublisherRepository;
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

    private IAddressRepository addressRepository;
    private IPublisherRepository publisherRepository;

    public BootStrapDataLoader(IAuthorRepository authorRepository,
                               IBookRepository bookRepository,
                               IAddressRepository addressRepository,
                               IPublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.addressRepository = addressRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("abhinav","anand");
        Book book1 = new Book("my childhood","1");
        Address address = new Address("flat no - 102, Confluence","Pune","Maharastra","411036");
        Publisher publisher = new Publisher("my publisher");
        publisher.setAddress(address);

        authorRepository.save(author1);
        bookRepository.save(book1);
        addressRepository.save(address);
        publisherRepository.save(publisher);

        LOGGER.log(Level.INFO,"Book and author saved successfully");
        LOGGER.log(Level.INFO,"Publisher saved successfully "+publisherRepository.count());


    }
}
