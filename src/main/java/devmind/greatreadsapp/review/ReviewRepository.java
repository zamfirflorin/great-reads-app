package devmind.greatreadsapp.review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

     Review save(Review review);

     Optional<Review> findById(Long id);

     List<Review> findAll();

     List<Review> findAllByBookId(Long bookId);

     Optional<Review> findReviewByIdAndUserId(Long reviewId, Long userId);

     void delete(Review review);
}
