
package com.lexelpro.service;
import com.lexelpro.entity.User;
import com.lexelpro.entity.javabean;

import java.util.List;

/**
 * @author Lexel PRO
 * @version 1.0
 */
public interface UserService {
	public long createUser(User user);
    public User updateUser(User user);
    public void deleteUser(long id);
    public List<javabean> getAllUsers();
    public javabean getUser(int id);
    public List<javabean> getbyID(String id);
    }
