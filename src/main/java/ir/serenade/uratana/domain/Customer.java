package ir.serenade.uratana.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Set;

@Entity
public class Customer extends User{

    @OneToMany
    private Set<Device> deviceSet;
}
