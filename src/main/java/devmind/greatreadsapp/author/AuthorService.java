package devmind.greatreadsapp.author;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {


    @Autowired
    private BookService bookService;

    public List<BookDto> getAllBooksByCategory(String category) {
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
