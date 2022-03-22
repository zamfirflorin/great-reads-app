package devmind.greatreadsapp.review;

import devmind.greatreadsapp.InMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

    @Autowired
    InMemoryRepository inMemoryRepository;

    public void create(Review review) {
        inMemoryRepository.getReviewMap().put(review.getId(), review);
    }

    public Review getReviewById(Long id) {
        return inMemoryRepository.getReviewMap().get(id);
    }

    public void updateReview(Review review) {
        Review persistedReview = inMemoryRepository.getReviewMap().get(review.getId());
    }

    public void delete(Long id) {
        inMemoryRepository.getReviewMap().remove(id);
    }



}
