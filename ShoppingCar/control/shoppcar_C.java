package com.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.shoppcar_BO;

/**
 * Servlet implementation class shoppcar_C
 */
@WebServlet("/shoppcar_C")
public class shoppcar_C extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shoppcar_C() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String type = (String)request.getParameter("type");
		
		shoppcar_BO shoppcar_BO = (shoppcar_BO)request.getSession().getAttribute("mycar");
		
			if(shoppcar_BO == null){
			shoppcar_BO = new shoppcar_BO();
			request.getSession().setAttribute("mycar", shoppcar_BO);
			}
		
			//修改購買數量
		if(type.equals("edit")){
			String id = (String)request.getParameter("id");
			String num = (String)request.getParameter("textfield");
			
			shoppcar_BO.edit(id, num);
			
			ArrayList al = shoppcar_BO.showmacar();
			
			request.setAttribute("al", al);
			
			request.getRequestDispatcher("shoppcar_V.jsp").forward(request, response);
		}
		//從購物車刪除商品
		if(type.equals("delete")){
			
			String id = (String)request.getParameter("id");
			
			shoppcar_BO.deleteshopp(id);
			
			ArrayList al = shoppcar_BO.showmacar();
			
			request.setAttribute("al", al);
			
			request.getRequestDispatcher("shoppcar_V.jsp").forward(request, response);
		}
		//添加商品到購物車
		if(type.equals("add")){
									
			String id = (String)request.getParameter("id");
			
			shoppcar_BO.addshopp(id , "1");
			
			ArrayList al = shoppcar_BO.showmacar();
			
			request.setAttribute("al", al);
			
			request.getRequestDispatcher("shoppcar_V.jsp").forward(request, response);
		}
		//顯示購物車內容
		if(type.equals("show")){
				
			ArrayList al = shoppcar_BO.showmacar();
			
			request.setAttribute("al", al);
			
			request.getRequestDispatcher("shoppcar_V.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
