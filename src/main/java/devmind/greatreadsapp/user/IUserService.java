package devmind.greatreadsapp.user;

import java.util.List;

public interface IUserService {

    UserDto create(UserDto user);
    void update(UserDto user);
    User getUser(Long id);
    void delete(UserDto user);
    List<UserDto> getAllUsers();

}
