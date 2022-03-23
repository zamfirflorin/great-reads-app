package devmind.greatreadsapp.user;


import devmind.greatreadsapp.InMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserRepository {

    @Autowired
    private InMemoryRepository inMemoryRepository;

    public void create(User user) {
        inMemoryRepository.getUserMap().put(user.getId(), user);
    }

    public void update(User user) {
        inMemoryRepository.getUserMap().put(user.getId(), user);
    }

    public User getUser(Long id) {
        return inMemoryRepository.getUserMap().get(id);
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        Map<Long, User> userMap = inMemoryRepository.getUserMap();
        for (Long key : userMap.keySet()) {
            userList.add(userMap.get(key));
        }
        return userList;
    }

    public void delete(User user) {
        inMemoryRepository.getUserMap().remove(user.getId());
    }
}
