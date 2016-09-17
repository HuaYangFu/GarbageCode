package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//==============================================================================================================
/**
 * 封裝javabean方法方法
 */
public class method {
	
	private Connection con = null;
	private PreparedStatement pr = null;
	private ResultSet rs = null;
	private int pageCoint = 0; //共有幾頁
	
	//透過ID得到BEAN方法===============================================================================
	public ArrayList idbean(String id){
		
		ArrayList al = new ArrayList();
		
		try {
			connet_M cn = new connet_M();
			con = cn.getConn();
			pr = con.prepareStatement("select * from uniqlo where id='"+id+"' ");
			rs = pr.executeQuery();
			while (rs.next()) {
				javabean ub = new javabean();
				ub.setId(rs.getInt(1));
				ub.setCommodityClass(rs.getString(2));
				ub.setPrice(rs.getFloat(3));
				ub.setInfo(rs.getString(4));
				ub.setMaterial(rs.getString(5));
				ub.setLaundryGuide(rs.getString(6));
				ub.setType(rs.getString(7));
				ub.setNum(rs.getInt(8));
				ub.setPhto(rs.getString(9));

				al.add(ub);
			} 
		} 
		catch (Exception e) {
			e.printStackTrace();
		}  
			finally{
				this.close();
			}
				return al;
	}
	
	
	//得到BEAN方法======================================================================================	
	public ArrayList bean(){
		
		ArrayList al = new ArrayList();
		
		try {
			connet_M cn = new connet_M();
			con = cn.getConn();
			pr = con.prepareStatement("select * from uniqlo");
			rs = pr.executeQuery();
			while (rs.next()) {
				javabean ub = new javabean();
				ub.setId(rs.getInt(1));
				ub.setCommodityClass(rs.getString(2));
				ub.setPrice(rs.getFloat(3));
				ub.setInfo(rs.getString(4));
				ub.setMaterial(rs.getString(5));
				ub.setLaundryGuide(rs.getString(6));
				ub.setType(rs.getString(7));
				ub.setNum(rs.getInt(8));
				ub.setPhto(rs.getString(9));

				al.add(ub);
			} 
		} 
		catch (Exception e) {
			e.printStackTrace();
		}  
			finally{
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
