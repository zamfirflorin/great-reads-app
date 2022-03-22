package devmind.greatreadsapp.user;


import devmind.greatreadsapp.InMemoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    @Autowired
    InMemoryRepository inMemoryRepository;

    ModelMapper modelMapper;

    void create(User user) {
        inMemoryRepository.getUserMap().get(user.getId());
    }

    void update(User user) {
        User us = getUser(user.getId());

    }

    User getUser(Long id) {
        return inMemoryRepository.getUserMap().get(id);
    }

    void delete(User user) {
        inMemoryRepository.getUserMap().remove(user.getId());
    }
}
