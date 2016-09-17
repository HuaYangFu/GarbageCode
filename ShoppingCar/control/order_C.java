package com.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.javabean;
import com.model.order_BO;
import com.model.registered_B;
import com.model.registered_BO;
import com.model.shoppcar_BO;

import sun.text.normalizer.UBiDiProps;

/**
 * Servlet implementation class order_C
 */
@WebServlet("/order_C")
public class order_C extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public order_C() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String flag = request.getParameter("flag");
		
		//顯示訂單商品內容
		if(flag.equals("showmodi")){
			
			String id = request.getParameter("id");
			order_BO order_BO = new order_BO();
			ArrayList al = order_BO.showordermodi(Integer.parseInt(id));
			request.setAttribute("al", al);
			request.getRequestDispatcher("showordermodi.jsp").forward(request, response);
			
		}
		//顯示訂單
		if(flag.equals("order")){
			HttpSession hs =  request.getSession(true);
			String email = (String)hs.getAttribute("email");
			
			order_BO order_BO = new order_BO();
			registered_BO rb = new registered_BO();
			shoppcar_BO shoppcar_BO = (shoppcar_BO)hs.getAttribute("mycar");
	
			ArrayList al = shoppcar_BO.showmacar();
			ArrayList all = rb.showmauser(email);
			
			for(int i =0 ; i<all.size() ;i++){
				
					registered_B ub = (registered_B)all.get(i);
			  		//往訂單資料庫添加
			  		order_BO.addorder(shoppcar_BO.total(), ub.getName(), ub.getEmal(), ub.getAddress());
			  		
				}
		
			for(int n =0 ; n<al.size() ;n++){
				
					javabean ab = (javabean)al.get(n);
					
					//往商品資料庫添加
					order_BO.addmodi(ab.getPhto(), ab.getCommodityClass(), ab.getPrice(), Integer.parseInt(shoppcar_BO.getnum(ab.getId()+"")));
				}
			
			//顯示訂單
			ArrayList al1 = order_BO.showorder(email);
			request.setAttribute("al1", al1);
			request.getRequestDispatcher("order.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
		
	}

}
