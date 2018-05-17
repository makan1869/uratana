package ir.serenade.uratana.service;

import ir.serenade.uratana.domain.Role;
import ir.serenade.uratana.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

    User saveUser(User user);
    User findUserByUsername(String username);

    Role saveRole(Role role);
    Role findRoleByName(String name);


}
