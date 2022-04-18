package devmind.greatreadsapp.reader;

import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
