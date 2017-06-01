package cloud.simple.service.impl;

import cloud.simple.dao.UserDao;
import cloud.simple.entity.User;
import cloud.simple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userdao;

    @Override
    public List<User> searchAll(){
        List<User> list = userdao.findAll();
        return list;
    }
}
