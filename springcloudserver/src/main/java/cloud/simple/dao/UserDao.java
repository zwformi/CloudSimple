package cloud.simple.dao;

import cloud.simple.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 */
public interface UserDao {
    List<User> findAll();
}
