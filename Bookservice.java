package com.library.service;
import com.library.model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class BookService {
    private List<Book> books = new ArrayList<>();
    private int currentId = 1;
    public List<Book> getAllBooks() {
        return books;
    }
    public Optional<Book> getBookById(int id) {
        return books.stream().filter(book -> book.getId() == id).findFirst();
    }
    public Book addBook(Book book) {
        book.setId(currentId++);
        books.add(book);
        return book;
    }
    public boolean removeBook(int id) {
        return books.removeIf(book -> book.getId() == id);
    }
}
