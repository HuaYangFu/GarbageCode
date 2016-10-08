package dao;

import model.message;
import util.HibernateUtil;
import java.util.List;

/**
 * Created by 傅華暘 on 2016/10/9.
 */
public class messageDao {

    HibernateUtil hibernateUtil = new HibernateUtil();

    public List<message> getall() {
        return hibernateUtil.getAllUsers(message.class);
    }

    public <T> void delete(final T entity) {
        hibernateUtil.delete(entity);
    }
}
