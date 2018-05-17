package ir.serenade.uratana.config;

import ir.serenade.uratana.domain.Role;
import ir.serenade.uratana.domain.User;
import ir.serenade.uratana.repository.UserRepository;
import ir.serenade.uratana.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UratanaApplicationStarup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Role adminRole = userService.findRoleByName("ROLE_ADMIN");
        if(adminRole == null) {
            adminRole = new Role("ROLE_ADMIN");
            adminRole = userService.saveRole(adminRole);
        }

        User admin = userService.findUserByUsername("admin");
        if(admin == null) {
            admin = new User();
            admin.setUsername("admin");
            admin.setPassword("password");
            admin.addRole(adminRole);
            userService.saveUser(admin);

        }

    }
}
