package swp.gr5.ams.dao;



import swp.gr5.ams.model.Users;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    Optional<Users> findUserByUsername(String username);
    void insert (Users users);
    void update (Users users);
    void delete (Integer id);
    boolean existsByUsername(String username);
    List<Users> findAll();
}
