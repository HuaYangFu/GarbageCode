package com.lexelpro.controller;

import com.lexelpro.entity.User;
import com.lexelpro.entity.javabean;
import com.lexelpro.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author Lexel PRO
 * @version 1.0
 */
@Controller
public class UserController {

	public UserController() {
		System.out.println("UserController()");
	}

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView getlist() {
        ModelAndView MV = new ModelAndView("index");
        List<javabean> list = userService.getAllUsers();
        MV.addObject("list",list);
        return MV;
    }

    @RequestMapping(value = "showmodi")
    public ModelAndView getlist(HttpServletRequest request) {
        ModelAndView MV = new ModelAndView("modi");
        int id = Integer.parseInt(request.getParameter("id"));
        javabean javabean = userService.getUser(id);
        MV.addObject("javabean",javabean);
        System.out.print("hello");
        return MV;
    }

    @RequestMapping("shopcar")
    public ModelAndView  addcar(HttpServletRequest request) {
        ModelAndView MV = new ModelAndView("shoppcar");
        String ID = request.getParameter("id");
        //選中的id放入集合中
        HashMap<String, String> hm = new HashMap<String,String>();
        hm.put(ID, "1");
        //從集合中取出ID組合成字串
        Iterator iterator = hm.keySet().iterator();
        String sub="(";
        while(iterator.hasNext()){

            String id = (String)iterator.next();

            if(iterator.hasNext()){
                sub += id+",";
            }
            else{
                sub += id+")";
            }
        }

        List<javabean> listt = userService.getbyID(sub);
        MV.addObject("list",listt);
        return MV;
    }
/**
    @RequestMapping("/test")
    public ModelAndView getAllUsers() {
      List<User> userList = userService.getAllUsers();
        return new ModelAndView("index", "userList", userList);
    }

    @RequestMapping("createUser")
    public ModelAndView createUser(@ModelAttribute User user) {
        ModelAndView MV = new ModelAndView("index");
        List<User> userList = userService.getAllUsers();
        MV.addObject("userList",userList);
        return MV;
    }

    @RequestMapping("update")
    public ModelAndView getAllUsers(@RequestParam User user) {
        userService.updateUser(user);
        List<User> userList = userService.getAllUsers();
        return new ModelAndView("index", "userList", userList);
    }

    @RequestMapping("editUser")
    public ModelAndView editUser(@RequestParam long id, @ModelAttribute User user) {
        ModelAndView MV = new ModelAndView("index");
        user = userService.getUser(id);
        List<User> userList = userService.getAllUsers();
        MV.addObject("userObject",user);
        MV.addObject("userList",userList);
        return MV;
    }
    
    @RequestMapping("deleteUser")
    public ModelAndView deleteUser(@RequestParam long id) {
        userService.deleteUser(id);
        List<User> userList = userService.getAllUsers();
        ModelAndView MV = new ModelAndView("index");
        MV.addObject("userList",userList);
        return MV;
    }

    @RequestMapping("saveUser")
    public ModelAndView saveUser(@ModelAttribute User user) {
        if(user.getId() == 0){ // if user id is 0 then creating the user other updating the user
            userService.createUser(user);
        } else {
            userService.updateUser(user);
        }
        ModelAndView MV = new ModelAndView("index");
        List<User> userList = userService.getAllUsers();
        MV.addObject("userList",userList);
        return MV;
    }
**/
}