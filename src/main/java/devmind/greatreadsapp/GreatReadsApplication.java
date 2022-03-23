package devmind.greatreadsapp;

import devmind.greatreadsapp.config.AppConfig;
import devmind.greatreadsapp.reader.Reader;
import devmind.greatreadsapp.user.User;
import devmind.greatreadsapp.user.UserDto;
import devmind.greatreadsapp.user.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class GreatReadsApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ModelMapper modelMapper = new ModelMapper();

        User florin = new Reader("florin@zamfir", "asdada", "florin", "zamfir", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        User calin = new Reader("calin@marinescu", "asdada", "calin", "marinescu", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        UserDto florinDto = modelMapper.map(florin, UserDto.class);
        UserDto calinDto = modelMapper.map(calin, UserDto.class);

        UserService userService = context.getBean("userService", UserService.class);
        userService.create(florinDto);
        userService.create(calinDto);
        userService.getAllUsers().forEach(usr -> System.out.println(usr.getId() + " " + usr.getFirstName() + " " + usr.getLastName()));
    }

}
