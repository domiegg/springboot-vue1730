package com.entity.model;

import com.entity.YonghurijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户日记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public class YonghurijiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日记图片
	 */
	
	private String rijitupian;
		
	/**
	 * 日记便签
	 */
	
	private String rijibianqian;
		
	/**
	 * 日记内容
	 */
	
	private String rijineirong;
		
	/**
	 * 日记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rijiriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
				
	
	/**
	 * 设置：日记图片
	 */
	 
	public void setRijitupian(String rijitupian) {
		this.rijitupian = rijitupian;
	}
	
	/**
	 * 获取：日记图片
	 */
	public String getRijitupian() {
		return rijitupian;
	}
				
	
	/**
	 * 设置：日记便签
	 */
	 
	public void setRijibianqian(String rijibianqian) {
		this.rijibianqian = rijibianqian;
	}
	
	/**
	 * 获取：日记便签
	 */
	public String getRijibianqian() {
		return rijibianqian;
	}
				
	
	/**
	 * 设置：日记内容
	 */
	 
	public void setRijineirong(String rijineirong) {
		this.rijineirong = rijineirong;
	}
	
	/**
	 * 获取：日记内容
	 */
	public String getRijineirong() {
		return rijineirong;
	}
				
	
	/**
	 * 设置：日记日期
	 */
	 
	public void setRijiriqi(Date rijiriqi) {
		this.rijiriqi = rijiriqi;
	}
	
	/**
	 * 获取：日记日期
	 */
	public Date getRijiriqi() {
		return rijiriqi;
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
			
}
