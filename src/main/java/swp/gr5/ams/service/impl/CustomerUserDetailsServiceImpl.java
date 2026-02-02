package swp.gr5.ams.service.impl;

import swp.gr5.ams.dao.UserDAO;
import swp.gr5.ams.model.Users;
import swp.gr5.ams.service.CustomerUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerUserDetailsServiceImpl implements CustomerUserDetailsService {

    private final UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Users users = userDAO.findUserByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User không tồn tại: " + username));

        return User
                .withUsername(users.getUsername())
                .password(users.getPasswordHash())
                .roles(users.getRole())
                .build();
    }
}
