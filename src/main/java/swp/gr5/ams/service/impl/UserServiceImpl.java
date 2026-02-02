package swp.gr5.ams.service.impl;

import swp.gr5.ams.dao.UserDAO;
import swp.gr5.ams.dto.request.UseCreateRequest;
import swp.gr5.ams.model.Users;
import swp.gr5.ams.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Override
    public void createUser(UseCreateRequest request) {
        if (userDAO.existsByUsername(request.getUsername())) {
            throw new IllegalArgumentException("Username already exists");
        }

        Users user = new Users();
        user.setUsername(request.getUsername());
        user.setPasswordHash(request.getPassword());
        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setRole(request.getRole());
        user.setStatus("ACTIVE");
        user.setCreatedDate(LocalDateTime.now());
        user.setDepartmentId(request.getDepartmentId());

        userDAO.insert(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return userDAO.findAll();
    }
}
