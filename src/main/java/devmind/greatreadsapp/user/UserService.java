package devmind.greatreadsapp.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional
    public UserDto create(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
        return userDto;
    }

    @Override
    @Transactional
    public void update(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .toList();
    }

    @Override
    @Transactional
    public void delete(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.delete(user);
    }
}
