package uz.pdp;

import java.util.List;
import java.util.Random;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import uz.pdp.config.AppConfig;
import uz.pdp.entity.User;
import uz.pdp.repository.UserRepository;
import uz.pdp.service.UserService;

public class Main {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(AppConfig.class);
        final var userService = context.getBean(UserService.class);
//        User johnDoe = User.builder()
//                .username("King Kong")
//                .password("1234")
//                .build();
//        johnDoe = userService.saveUser(johnDoe);
//        System.out.println(johnDoe);


//        User user = userService.getUserById(1L);
//        user.setUsername("John Mc'Kenny");
//        System.out.println(user);
//
//        User updateUser = userService.updateUser(user);
//        System.out.println(updateUser);

//        List<User> allUsers = userService.getAllUsers();
//        System.out.println(allUsers);

        Page<User> page = userService.getAllByPage(0, 2);

        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
        System.out.println(page.getContent());
    }
}