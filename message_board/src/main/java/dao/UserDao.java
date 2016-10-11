package dao;

/**
 * Created by 傅華暘 on 2016/9/26.
 */

import model.user;
import util.HibernateUtil;

import java.util.List;

public class userDao {

    HibernateUtil hibernateUtil = new HibernateUtil();

    public <T> void creat(final T entity) {
        hibernateUtil.create(entity);
    }

    public boolean getbyacount(String acount, String password) {
        return hibernateUtil.getbyaccount(acount,password,user.class);
    }

}
