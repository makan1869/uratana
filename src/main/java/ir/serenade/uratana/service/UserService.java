package ir.serenade.uratana.service;

import ir.serenade.uratana.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

    public User save(User user);
}
