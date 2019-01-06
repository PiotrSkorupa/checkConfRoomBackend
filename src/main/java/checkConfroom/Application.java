package checkConfroom;

import checkConfroom.model.ConfRoomModel;
import checkConfroom.model.User;
import checkConfroom.model.UserRole;
import checkConfroom.repository.ConfRoomRepository;
import checkConfroom.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.util.Arrays;


@SpringBootApplication
public class Application extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);




    }


/*
    @Bean
    public CommandLineRunner commandLineRunner(UserRepository userRepository, ConfRoomRepository confRoomRepository) {
        return (String... args) -> {
            User user = new User();
            user.setUserName("admin");
            user.setPassword("admin");

            UserRole adminRole = new UserRole();
            adminRole.setRole("ROLE_ADMIN");

            UserRole userRole = new UserRole();
            userRole.setRole("ROLE_USER");

            //user.setUserRoles(Arrays.asList(adminRole, userRole));
            user.setUserRoles(Arrays.asList(adminRole));

            userRepository.save(user);

            ConfRoomModel confRoomModel = ConfRoomModel.builder()
                    .floor(1)
                    .name("Kraków")
                    .hdmi(true)
                    .skypeVc(true)
                    .lan(true)
                    .labels(true)
                    .remotes(true)
                    .instruction(true)
                    .comments("comment")
                    .build();

            confRoomRepository.save(confRoomModel);
        };
    }*/


}