package sportify.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sportify.model.User;

/**
 * Created by admin on 06/01/17.
 */
@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUsername(String username);



}
