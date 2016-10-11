package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.messageDao;
import model.message;

import java.util.Collections;
import java.util.List;

/**
 * Created by 傅華暘 on 2016/10/9.
 */
public class messageAction extends ActionSupport {

    private dao.messageDao messageDao = new messageDao();
    private model.message message;
    private List<message> messageList;
    private int now = 1;
    private int pagecount = 0;
    private int showpage = 7;
    private int allcount = 0;

    public String welcome() throws Exception{
        allcount = messageDao.allcount();
        messageList = messageDao.getall(now,showpage,allcount);
        Collections.reverse(messageList);
        pagecount = messageDao.pagecount(showpage);
        return "SUCCESS";
    }

    public String showMessage() throws  Exception{
        message = messageDao.getallbyid(message.getNum());
        return "SUCCESS";
    }

    public String creat() throws  Exception{
        return "SUCCESS";
    }

    public String updata() throws  Exception{
        messageDao.updata(message);
        return "SUCCESS";
    }
    public String updata_show() throws  Exception{
        message = messageDao.getallbyid(message.getNum());
        return "SUCCESS";
    }

    public String add() throws  Exception{
        messageDao.creat(message);
        return "SUCCESS";
    }

    public String delete() throws  Exception{
        messageDao.delete(message.getNum());
        return "SUCCESS";
    }








//set and get
    public model.message getMessage() {
        return message;
    }

    public void setMessage(model.message message) {
        this.message = message;
    }

    public List<model.message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<model.message> messageList) {
        this.messageList = messageList;
    }

    public int getNow() {
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

}
