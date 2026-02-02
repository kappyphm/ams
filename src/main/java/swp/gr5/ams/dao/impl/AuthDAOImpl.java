package swp.gr5.ams.dao.impl;



import swp.gr5.ams.dao.AuthDAO;
import swp.gr5.ams.model.Users;

import java.util.Optional;

public class AuthDAOImpl implements AuthDAO {
    @Override
    public boolean isUserNameExists(String userName) {
        String sql = "";
        return false;
    }


    @Override
    public Optional<Users> getUserDetail(String username, String passwordHash) {
        return Optional.empty();
    }
}
