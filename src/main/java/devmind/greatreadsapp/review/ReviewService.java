package devmind.greatreadsapp.review;


import devmind.greatreadsapp.book.Book;
import devmind.greatreadsapp.book.BookDto;
import devmind.greatreadsapp.user.User;
import devmind.greatreadsapp.user.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    public void createReview(ReviewDto reviewDto, BookDto bookDto, UserDto userDto) {
        Review review = modelMapper.map(reviewDto, Review.class);
        review.setBook(modelMapper.map(bookDto, Book.class));
        review.setUser(modelMapper.map(userDto, User.class));
        reviewRepository.save(review);
    }
    public ReviewDto getReview(Long id) {
        return modelMapper.map(reviewRepository.findById(id), ReviewDto.class);
    }

    public List<ReviewDto> getAllReviews() {
        return  reviewRepository.findAll().stream()
                .map(review -> modelMapper.map(review, ReviewDto.class))
                .toList();
    }
    @Transactional
    public void updateReview(ReviewDto reviewDto) {
        final var review = reviewRepository.findById(reviewDto.getId()).orElseThrow(() -> new ReviewNotFoundException(reviewDto.getId()));
        reviewRepository.save(review);

    }
    public void deleteReview(ReviewDto reviewDto) {
        final var  review = reviewRepository.findById(reviewDto.getId()).orElseThrow(() -> new ReviewNotFoundException(reviewDto.getId()));
        reviewRepository.delete(review);
    }

    public List<ReviewDto> getAllReviewsByBookId(Long bookId) {
        return reviewRepository.findAllByBookId(bookId).stream().map(review -> modelMapper.map(review, ReviewDto.class)).toList();
    }
}
