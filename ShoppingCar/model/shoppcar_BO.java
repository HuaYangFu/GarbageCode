package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class shoppcar_BO {

	HashMap<String, String> hm = new HashMap<String,String>();
	
	private Connection con = null;
	private PreparedStatement pr = null;
	private ResultSet rs = null;
	private float total;
	
	//返回總價
	public float total(){
		
		return this.total;
		
	}
	
	//根據ID返回商品數量
	public String getnum(String id){
		return (String)hm.get(id);
	}
	
	//新增商品
	public void addshopp(String id,String num){
		hm.put(id, num);
	}
	//刪除商品
	public void deleteshopp(String id){
		hm.remove(id);
	}
	
	//修改商品數量
	public void edit(String id,String num){
		hm.put(id, num);
	}
	
	//顯示購物車內容方法================================================================================
	
	public ArrayList showmacar(){
		
		ArrayList al = new ArrayList();
		connet_M cn = new connet_M();
		
		
		try {
			
			String sql ="select * from uniqlo where id in";
			
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
			
			sql += sub;
						
			con = cn.getConn();
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
			
			this.total = 0.0f;
			while (rs.next()) {
				
				javabean ub = new javabean();
				int id = rs.getInt(1);
				ub.setId(id);
				ub.setCommodityClass(rs.getString(2));
				float price = rs.getFloat(3);
				ub.setPrice(price);
				ub.setInfo(rs.getString(4));
				ub.setMaterial(rs.getString(5));
				ub.setLaundryGuide(rs.getString(6));
				ub.setType(rs.getString(7));
				ub.setNum(rs.getInt(8));
				ub.setPhto(rs.getString(9));

				this.total = this.total+price*Integer.parseInt(hm.get(id+""));
				
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
