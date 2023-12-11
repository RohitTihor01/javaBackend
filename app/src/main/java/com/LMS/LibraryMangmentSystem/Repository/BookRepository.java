package com.LMS.LibraryMangmentSystem.Repository;

import com.LMS.LibraryMangmentSystem.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book,String>
{


}
