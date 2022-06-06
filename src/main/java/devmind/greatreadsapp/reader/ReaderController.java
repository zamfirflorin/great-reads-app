package devmind.greatreadsapp.reader;

import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import devmind.greatreadsapp.review.ReviewDto;
import devmind.greatreadsapp.review.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reader")
public class ReaderController {

    @Autowired
    private BookService bookService;

    @Autowired
    private ReaderService readerService;

    @Autowired
    private ReviewService reviewService;

    private ModelMapper mapper = new ModelMapper();

    public List<BookDto> getAllBooksByCategory(String category) {
        return bookService.getAllBooksByCategory(category);
    }

    public void addBookToReadingList(ReaderDto readerDto, BookDto readBook) {
       readerService.addToReadList(readerDto, readBook.getId());
    }

    @PostMapping("/addReview")
    public ResponseEntity<ReviewDto> addReview(@RequestBody ReviewDto reviewDto, @RequestParam Long bookId) {
        return ResponseEntity.ok(reviewService.addReview(reviewDto, bookId));
    }

    @PostMapping("/updateReview")
    public ResponseEntity<ReviewDto> addReview(@RequestBody ReviewDto reviewDto) {
        return ResponseEntity.ok(reviewService.updateReview(reviewDto));
    }

    @DeleteMapping("/deleteReview")
    public ResponseEntity<String> deleteReview(@RequestBody ReviewDto reviewDto) {
        reviewService.deleteReview(reviewDto);
        return ResponseEntity.ok("{ \"Deleted review id\""+": "+"\""+ reviewDto.getId() +"\"}");
    }

    @PostMapping("/addBookToWishList")
    public ResponseEntity<String> addBookToWishList(@RequestParam Long readerId,
                                                    @RequestParam Long bookId) {
        readerService.addToWishList(readerId, bookId);
        return ResponseEntity.ok("{ \"Added book id\""+": "+"\""+ bookId +"\""+ "towishList}");
    }


}
