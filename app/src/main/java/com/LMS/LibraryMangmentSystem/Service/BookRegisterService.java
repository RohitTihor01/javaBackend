package com.LMS.LibraryMangmentSystem.Service;

import com.LMS.LibraryMangmentSystem.Model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRegisterService
{
    String registerBook(Book book);
    List<Book>getAllBook();
    Optional<Book> getBookById(String Id);
    String deleteBookById(String Id);
   // String updateBookById (String Id);

}
