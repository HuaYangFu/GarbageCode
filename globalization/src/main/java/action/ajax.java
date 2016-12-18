package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 傅華暘 on 2016/12/3.
 */
public class ajax extends ActionSupport {

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String loadData() throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        PrintWriter out = response.getWriter();
        out.println("Hello " + getName());
        out.flush();
        // return null;
        return SUCCESS;
    }
}

