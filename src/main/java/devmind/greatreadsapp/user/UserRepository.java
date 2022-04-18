package devmind.greatreadsapp.user;


import devmind.greatreadsapp.InMemoryDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class UserRepository {

    @Autowired
    private InMemoryDataStore inMemoryDataStore;

    public void create(User user) {
        inMemoryDataStore.getUserMap().put(user.getId(), user);
    }

    public void update(User user) {
        inMemoryDataStore.getUserMap().put(user.getId(), user);
    }

    public User getUser(Long id) {
        return inMemoryDataStore.getUserMap().get(id);
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        Map<Long, User> userMap = inMemoryDataStore.getUserMap();
        for (Long key : userMap.keySet()) {
            userList.add(userMap.get(key));
        }
        return userList;
    }

    public void delete(User user) {
        inMemoryDataStore.getUserMap().remove(user.getId());
    }
}
