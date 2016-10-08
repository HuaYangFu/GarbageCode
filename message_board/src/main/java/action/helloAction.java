package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.UserDao;
import dao.messageDao;
import model.User;
import model.message;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 傅華暘 on 2016/10/6.
 */
public class helloAction extends ActionSupport {

    private UserDao dao = new UserDao();
    private messageDao messageDao = new messageDao();
    private message message;
    private List<User> userList;
    private List<message> messageList;

    public String execute() throws Exception{
        messageList = messageDao.getall();
        return "SUCCESS";
    }

    public String delete() throws Exception{
        messageDao.delete(message);
        return "SUCCESS";
    }









    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<message> messageList) {
        this.messageList = messageList;
    }

}
