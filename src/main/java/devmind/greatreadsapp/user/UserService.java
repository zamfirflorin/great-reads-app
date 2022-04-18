package devmind.greatreadsapp.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void create(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.create(user);
    }

    @Override
    public void update(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.update(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getUser(id);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.getAllUsers().stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .toList();
    }

    @Override
    public void delete(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.delete(user);
    }
}
