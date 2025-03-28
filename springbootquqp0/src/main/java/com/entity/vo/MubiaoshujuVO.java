package com.entity.vo;

import com.entity.MubiaoshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 目标数据
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public class MubiaoshujuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 目标图片
	 */
	
	private String mubiaotupian;
		
	/**
	 * 时间分类
	 */
	
	private String shijianfenlei;
		
	/**
	 * 提交次数
	 */
	
	private Integer tijiaocishu;
		
	/**
	 * 目标内容
	 */
	
	private String mubiaoneirong;
		
	/**
	 * 添加日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiariqi;
		
	/**
	 * 事件状态
	 */
	
	private String shijianzhuangtai;
		
	/**
	 * 目标备注
	 */
	
	private String mubiaobeizhu;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 用时
	 */
	
	private String yongshi;
				
	
	/**
	 * 设置：目标图片
	 */
	 
	public void setMubiaotupian(String mubiaotupian) {
		this.mubiaotupian = mubiaotupian;
	}
	
	/**
	 * 获取：目标图片
	 */
	public String getMubiaotupian() {
		return mubiaotupian;
	}
				
	
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
	 * 设置：目标内容
	 */
	 
	public void setMubiaoneirong(String mubiaoneirong) {
		this.mubiaoneirong = mubiaoneirong;
	}
	
	/**
	 * 获取：目标内容
	 */
	public String getMubiaoneirong() {
		return mubiaoneirong;
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
	 * 设置：目标备注
	 */
	 
	public void setMubiaobeizhu(String mubiaobeizhu) {
		this.mubiaobeizhu = mubiaobeizhu;
	}
	
	/**
	 * 获取：目标备注
	 */
	public String getMubiaobeizhu() {
		return mubiaobeizhu;
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
			
}
