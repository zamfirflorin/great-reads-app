package devmind.greatreadsapp.admin;

import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookNotFoundException;
import devmind.greatreadsapp.book.BookRepository;
import devmind.greatreadsapp.review.Review;
import devmind.greatreadsapp.review.ReviewNotFoundException;
import devmind.greatreadsapp.review.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AdministratorService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Transactional
    public void approveAuthorBook(final Long authorId, final Long bookId) {
        Book book  = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
        book.setPublished(true);
        bookRepository.save(book);
    }

    @Transactional
    public void rejectAuthorBook(final Long authorId, final Long bookId) {
        Book book  = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException(bookId));
        if (book.isPublished()) {
            book.setPublished(false);
        }
        bookRepository.save(book);
    }

    @Transactional
    public void deleteUserReview(final Long reviewId, final Long userId) {
        Review review = reviewRepository.findReviewByIdAndUserId(reviewId, userId).orElseThrow(() -> new ReviewNotFoundException(reviewId));
        reviewRepository.delete(review);
    }


}
