package devmind.greatreadsapp.admin;

import devmind.greatreadsapp.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdministratorService {

    @Autowired
    private UserRepository administratorRepository;

    public void approveAuthorBook(final Long authorId, final Long bookId) {

    }

    public void rejectAuthorBook(final Long authorId, final Long bookId) {

    }

    public void deleteUserReview(final Long userId, final Long reviewId) {

    }

}
