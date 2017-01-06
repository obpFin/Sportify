package sportify.service;

//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sportify.dao.UserDao;
import sportify.model.User;

/**
 * Created by admin on 06/01/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void save(User user) {
        userDao.save(user);

    }

    @Override
    public void delete(User user) {

    }
}
