package com.LMS.LibraryMangmentSystem.Service;

import com.LMS.LibraryMangmentSystem.Model.Book;
import com.LMS.LibraryMangmentSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookRegisterServiceImpl implements BookRegisterService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Optional<Book> getBookById(String Id) {
        return bookRepository.findById(Id);
    }

    @Override
    public String deleteBookById(String Id) {
        bookRepository.deleteById(Id);
        return "Deleted Successfully";
    }

   /* @Override
    public String updateBookById(String Id) {
        bookRepository.save(Id);
        return "Updated";
    }*/

    @Override
    public String registerBook(Book book) {
        bookRepository.save(book);
        return "Book Saved Successfully";
    }

    @Override
    public List<Book> getAllBook() {
        return  bookRepository.findAll();
    }


}
