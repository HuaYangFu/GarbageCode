package com.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.*;
import com.sun.glass.ui.CommonDialogs.Type;
/**
 * Servlet implementation class registered_C
 */
@WebServlet("/registered_C")
public class registered_C extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registered_C() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String flag = request.getParameter("flag");
		
		//登入驗證
		if(flag.equals("loging")){
			
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			
			registered_BO rb = new registered_BO();
			
			if(rb.checkUser(email, password)){
				
				HttpSession hs =  request.getSession(true);
				
				hs.setAttribute("email", email);
				
				shoppcar_BO shoppcar_BO = (shoppcar_BO)request.getSession().getAttribute("mycar");
				
				ArrayList al = shoppcar_BO.showmacar();
				
				request.setAttribute("al", al);
				
				ArrayList all = rb.showmauser(email);
				
				request.setAttribute("all", all);
				
				request.getRequestDispatcher("confirms.jsp").forward(request, response);
			}
			else{
				request.getRequestDispatcher("loging_V.jsp").forward(request, response);
			}
			
			
		}
		
		//註冊會員
		if(flag.equals("registered")){
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			
			try {
				registered_BO rb = new registered_BO();
				rb.adduser(name, gender, email, password, address);
			} 
			catch (Exception e) {			
				e.printStackTrace();
			}
			request.getRequestDispatcher("registered_V.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
		
	}

}
