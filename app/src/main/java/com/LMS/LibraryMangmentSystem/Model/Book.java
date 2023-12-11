package com.LMS.LibraryMangmentSystem.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Book_Details")
@Getter
@Setter
public class Book
{
    @Id
    private String subject;
    private String semester;
    private String publishYear;
    private String author;
}
