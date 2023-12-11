package com.LMS.LibraryMangmentSystem.Controller;

import com.LMS.LibraryMangmentSystem.Model.Book;
import com.LMS.LibraryMangmentSystem.Service.BookRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Rohit")
@CrossOrigin
public class TestController
{
    @Autowired
    private BookRegisterService registerService;
    @PostMapping("/Register")
    public String registerBook (@RequestBody Book book)
    {
        return registerService.registerBook(book);
    }
    @GetMapping("/GetAllBook")
    public List<Book>getAllBooks()
    {
        return registerService.getAllBook();
    }
    @GetMapping("/GetBookById")
    public Optional<Book> getBookById(@RequestParam String Id)
    {
        return registerService.getBookById(Id);
    }

    @DeleteMapping("/DeleteBookById")
    public String deleteBookById(@RequestParam String Id)
    {
        return registerService.deleteBookById(Id);
    }
/*
    @PutMapping("/UpdateBookById")
    public String updateBookById(String Id)
    {
        return registerService.updateBookById(Id);
    }

 */

}
