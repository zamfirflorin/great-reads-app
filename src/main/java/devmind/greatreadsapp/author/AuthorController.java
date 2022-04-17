package devmind.greatreadsapp.author;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/getBooksByCategory", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BookDto> getAllBooksByCategory(@RequestParam(name = "bookCategory") String category) {
        return bookService.getAllBooksByCategory(category);
    }

    @GetMapping(value = "/getAllPublishedBooks", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllPublishedBooks() {
        return bookService.getAllPublishedBooks();
    }

    @PostMapping(value ="/saveBook", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @PostMapping(value ="/addProfilePicture", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void addProfilPicture(@RequestBody File file, @RequestParam Long userId) {
       bookService.addProfilePicture(file, userId);
    }

    public void addPdfFile() {
        //to implement
    }
}
