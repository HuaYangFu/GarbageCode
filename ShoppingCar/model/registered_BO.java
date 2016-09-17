package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

public class registered_BO {

	private Connection con = null;
	private PreparedStatement pr = null;
	private ResultSet rs = null;

	
//顯示用戶信息方法================================================================================
	
		public ArrayList showmauser(String m){
			
			ArrayList al = new ArrayList();
			connet_M cn = new connet_M();
			
			
			
			try {
				String sql ="select * from uniqlo_user where email='"+m+"' ";
				con = cn.getConn();
				pr = con.prepareStatement(sql);
				rs = pr.executeQuery();
										
				while (rs.next()) {
					
					registered_B ub = new registered_B();
					ub.setName(rs.getString(1));
					ub.setGender(rs.getString(2));
					ub.setEmal(rs.getString(3));
					ub.setPassword(rs.getString(4));
					ub.setAddress(rs.getString(5));

					al.add(ub);
				} 
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				this.close();
			}
			return al;
		}	
//用戶登入驗證方法===========================================================================================================
		
		public boolean checkUser(String m,String p){
			
			boolean b = false;
			
			try {
				connet_M cd = new connet_M();
				con = cd.getConn();
				pr = con.prepareStatement("select password from uniqlo_user where email=? limit 1 ");
				pr.setString(1, m);
				rs = pr.executeQuery();
				
				if(rs.next()){
					String dbpass = rs.getString(1);
					if(dbpass.equals(p)){
						b = true;
					}
				}	
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			//關閉數據庫
			finally{		
					try {
						this.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			return b;
		}	
//註冊用戶	
public boolean adduser(String name,String gender,String email,String password,String address){
		
		boolean b = false;
		
		try {
			connet_M cn = new connet_M();
			con = cn.getConn();
			pr = con.prepareStatement("INSERT INTO uniqlo_user(name,gender,email,password,address) VALUES('"+name+"','"+gender+"','"+email+"','"+password+"','"+address+"')");
			int num = pr.executeUpdate();
			
			if(num == 1){
				b = true;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			this.close();
		}
		return b;
	}

//==============================================================================================================
/**
 * 關閉數據庫方法
 */
public void close(){
	try {
		if(rs != null){
		rs.close();
		}
		if(pr != null){
		pr.close();
		}
		if(con != null){
		con.close();
		}
	} catch (Exception e2) {
		e2.printStackTrace();
	}
}
}
