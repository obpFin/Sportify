package sportify.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import sportify.model.User;

/**
 * Created by admin on 06/01/17.
 */
public interface UserService extends UserDetailsService {

    User findByUsername(String username);
    void save(User user);
    void delete(User user);
}
