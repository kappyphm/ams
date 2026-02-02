package swp.gr5.ams.dao;



import swp.gr5.ams.model.Users;

import java.util.Optional;

public interface AuthDAO{
    boolean isUserNameExists(String userName);
    Optional<Users> getUserDetail(String username, String passwordHash);
}
