package sportify.dao;

import sportify.model.User;

/**
 * Created by admin on 06/01/17.
 */
public interface UserDao {

    User findById(int id);
    void save(User user);
    void delete(User user);
}
