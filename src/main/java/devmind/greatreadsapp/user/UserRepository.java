package devmind.greatreadsapp.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

    void update(User user);

    Optional<User> findById(Long id);

    List<User> findAll();

    void delete(User user);
}
