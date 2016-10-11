package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.userDao;
import model.user;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by 傅華暘 on 2016/10/9.
 */
public class userAction extends ActionSupport{

    private userDao userDao = new userDao();
    private user user;
    private int aco;
    private String pas;




    public String loging() throws Exception{
        return "SUCCESS";
    }

    public String verification() throws Exception{
        boolean result = userDao.getbyacount(user.getAccount(), user.getPassword());
        if (result == false) {
            return "error";
        }
        else {
            return "SUCCESS";
        }
    }

    public String registered() throws Exception{
        return "SUCCESS";
    }

    public String creat() throws  Exception{
        userDao.creat(user);
        return "SUCCESS";
    }

//set and get
    public model.user getUser() {
        return user;
    }

    public void setUser(model.user user) {
        this.user = user;
    }
    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public int getAco() {
        return aco;
    }

    public void setAco(int aco) {
        this.aco = aco;
    }

}
