package devmind.greatreadsapp.admin;

import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/administrator")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private BookService bookService;

    @GetMapping(value ="/approveOrReject")
    public void approve(@RequestParam Long authorId, @RequestParam Long bookId, boolean status) {
        administratorService.approveOrRejectBook(authorId, bookId, status);
    }

    @DeleteMapping(value ="/deleteUserReview")
    public void deleteUserReview(@RequestParam Long userId, @RequestParam Long reviewId) {
        administratorService.deleteUserReview(userId, reviewId);
    }

    @PutMapping(value = "/updateBook", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookDto> updateBook(@RequestBody BookDto bookDto) {
        return ResponseEntity.ok(bookService.updateBook(bookDto));
    }


}
