package dao;

/**
 * Created by 傅華暘 on 2016/9/26.
 */

import java.util.List;

import util.HibernateUtil;
import model.User;

public class UserDao {

    HibernateUtil hibernateUtil = new HibernateUtil();

    public List<User> getAllUsers() {
       return hibernateUtil.getAllUsers(User.class);
    }

}
