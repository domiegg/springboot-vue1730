package com.entity.model;

import com.entity.ShijianshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 事件数据
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public class ShijianshujuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 时间分类
	 */
	
	private String shijianfenlei;
		
	/**
	 * 事件图片
	 */
	
	private String shijiantupian;
		
	/**
	 * 提交次数
	 */
	
	private Integer tijiaocishu;
		
	/**
	 * 事件标签
	 */
	
	private String shijianbiaoqian;
		
	/**
	 * 事件内容
	 */
	
	private String shijianneirong;
		
	/**
	 * 事件备注
	 */
	
	private String shijianbeizhu;
		
	/**
	 * 事件状态
	 */
	
	private String shijianzhuangtai;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 用时
	 */
	
	private String yongshi;
		
	/**
	 * 添加日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiariqi;
				
	
	/**
	 * 设置：时间分类
	 */
	 
	public void setShijianfenlei(String shijianfenlei) {
		this.shijianfenlei = shijianfenlei;
	}
	
	/**
	 * 获取：时间分类
	 */
	public String getShijianfenlei() {
		return shijianfenlei;
	}
				
	
	/**
	 * 设置：事件图片
	 */
	 
	public void setShijiantupian(String shijiantupian) {
		this.shijiantupian = shijiantupian;
	}
	
	/**
	 * 获取：事件图片
	 */
	public String getShijiantupian() {
		return shijiantupian;
	}
				
	
	/**
	 * 设置：提交次数
	 */
	 
	public void setTijiaocishu(Integer tijiaocishu) {
		this.tijiaocishu = tijiaocishu;
	}
	
	/**
	 * 获取：提交次数
	 */
	public Integer getTijiaocishu() {
		return tijiaocishu;
	}
				
	
	/**
	 * 设置：事件标签
	 */
	 
	public void setShijianbiaoqian(String shijianbiaoqian) {
		this.shijianbiaoqian = shijianbiaoqian;
	}
	
	/**
	 * 获取：事件标签
	 */
	public String getShijianbiaoqian() {
		return shijianbiaoqian;
	}
				
	
	/**
	 * 设置：事件内容
	 */
	 
	public void setShijianneirong(String shijianneirong) {
		this.shijianneirong = shijianneirong;
	}
	
	/**
	 * 获取：事件内容
	 */
	public String getShijianneirong() {
		return shijianneirong;
	}
				
	
	/**
	 * 设置：事件备注
	 */
	 
	public void setShijianbeizhu(String shijianbeizhu) {
		this.shijianbeizhu = shijianbeizhu;
	}
	
	/**
	 * 获取：事件备注
	 */
	public String getShijianbeizhu() {
		return shijianbeizhu;
	}
				
	
	/**
	 * 设置：事件状态
	 */
	 
	public void setShijianzhuangtai(String shijianzhuangtai) {
		this.shijianzhuangtai = shijianzhuangtai;
	}
	
	/**
	 * 获取：事件状态
	 */
	public String getShijianzhuangtai() {
		return shijianzhuangtai;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：用时
	 */
	 
	public void setYongshi(String yongshi) {
		this.yongshi = yongshi;
	}
	
	/**
	 * 获取：用时
	 */
	public String getYongshi() {
		return yongshi;
	}
				
	
	/**
	 * 设置：添加日期
	 */
	 
	public void setTianjiariqi(Date tianjiariqi) {
		this.tianjiariqi = tianjiariqi;
	}
	
	/**
	 * 获取：添加日期
	 */
	public Date getTianjiariqi() {
		return tianjiariqi;
	}
			
}
