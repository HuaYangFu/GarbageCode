package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 傅華暘 on 2016/12/3.
 */
public class welcome extends ActionSupport {

    public String execute(){
        return SUCCESS;
    }
}

