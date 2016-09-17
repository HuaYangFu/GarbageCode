package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class order_BO {

	private Connection con = null;
	private PreparedStatement pr = null;
	private ResultSet rs = null;
	
	
	String photo = null;
	String modiname = null;
	float Price = 0;
	int Num = 0;
	//顯示訂單商品方法=================================================================================================================
	public ArrayList showordermodi(int id){
		
		ArrayList al = new ArrayList();
		connet_M cn = new connet_M();
		
		try {
			String sql ="select * from test.order_modi where id='"+id+"' ";
			con = cn.getConn();
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
									
			while (rs.next()) {
				
				order_B ub = new order_B();
				ub.setPhoto(rs.getString(2));
				ub.setModiname(rs.getString(3));
				ub.setPrice(rs.getFloat(4));
				ub.setNum(rs.getInt(5));

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
	
	//顯示訂單方法=================================================================================================================
	public ArrayList showorder(String m){
			
		ArrayList al = new ArrayList();
		connet_M cn = new connet_M();
		
		try {
			String sql ="select * from test.order where email='"+m+"' ";
			con = cn.getConn();
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
									
			while (rs.next()) {
				
				order_B ub = new order_B();
				ub.setId(rs.getInt(1));
				ub.setName(rs.getString(2));
				ub.setEmail(rs.getString(3));
				ub.setAddress(rs.getString(4));
				ub.setTotal(rs.getFloat(5));

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
	
	//添加商品訂單方法==============================================================================================================
	public boolean addmodi(String photo,String modiname,float Price,int Num){
		
		boolean b = false;
		
		try {
			connet_M cn = new connet_M();
			con = cn.getConn();
			String sql2 = "select max(id) from test.order" ;
			pr=con.prepareStatement(sql2);
			rs=pr.executeQuery();
			
			int id = 0;
			while(rs.next()){
				id = Integer.parseInt(rs.getString(1));
			}
			
			String sql = "INSERT INTO test.order_modi(id,photo,modiname,price,num) VALUES('"+id+"','"+photo+"','"+modiname+"','"+Price+"','"+Num+"')";
			pr = con.prepareStatement(sql);
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

	//添加訂單方法==============================================================================================================
	public boolean addorder(float total,String name,String email,String address){
			
			boolean b = false;
			
			try {
				String sql="INSERT INTO test.order(total,name,email,address) VALUES('"+total+"','"+name+"','"+email+"','"+address+"')" ;
				connet_M cn = new connet_M();
				con = cn.getConn();
				pr = con.prepareStatement(sql);
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
