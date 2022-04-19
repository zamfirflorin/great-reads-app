package devmind.greatreadsapp.reader;

import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reader")
public class ReaderController {

    @Autowired
    private BookService bookService;

    @Autowired
    private ReaderService readerService;

    private ModelMapper mapper = new ModelMapper();

    public List<BookDto> getAllBooksByCategory(String category) {
        return bookService.getAllBooksByCategory(category);
    }

    public void addBookToReadingList(ReaderDto readerDto, BookDto readBook) {
       readerService.addToReadList(readerDto, readBook.getId());
    }


}
