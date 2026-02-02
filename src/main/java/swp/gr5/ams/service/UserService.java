package swp.gr5.ams.service;

import swp.gr5.ams.dto.request.UseCreateRequest;
import swp.gr5.ams.model.Users;

import java.util.List;

public interface UserService {
    void createUser(UseCreateRequest request);
    List<Users> getAllUsers();
}
