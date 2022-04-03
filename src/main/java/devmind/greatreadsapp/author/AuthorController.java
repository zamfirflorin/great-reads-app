package devmind.greatreadsapp.author;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class AuthorController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDto> getAllBooksByCategory(@RequestParam String category) {
        return bookService.getAllBooksByCategory(category);
    }

    public List<Book> getAllPublishedBooks() {
        return bookService.getAllPublishedBooks();
    }

    public void addBook(BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    public void addProfilPicture() {
        //to implement
    }

    public void addPdfFile() {
        //to implement
    }
}
