package devmind.greatreadsapp.author;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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

    @PostMapping(value ="/uploadBook",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void uploadBookPDF(@RequestParam MultipartFile file,
                              @RequestParam Long bookId) {
        try {
            bookService.uploadBook(file.getBytes(), file.getName(), bookId);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
