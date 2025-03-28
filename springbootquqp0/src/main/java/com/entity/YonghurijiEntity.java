package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 用户日记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
@TableName("yonghuriji")
public class YonghurijiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghurijiEntity() {
		
	}
	
	public YonghurijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 日记名称
	 */
					
	private String rijimingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date rijiriqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：日记名称
	 */
	public void setRijimingcheng(String rijimingcheng) {
		this.rijimingcheng = rijimingcheng;
	}
	/**
	 * 获取：日记名称
	 */
	public String getRijimingcheng() {
		return rijimingcheng;
	}
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
