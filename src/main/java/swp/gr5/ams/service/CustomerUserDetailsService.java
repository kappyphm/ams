package swp.gr5.ams.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface CustomerUserDetailsService extends UserDetailsService {
    UserDetails loadUserByUsername(String username);
}
