package com.entity.view;

import com.entity.YonghurijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户日记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
@TableName("yonghuriji")
public class YonghurijiView  extends YonghurijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghurijiView(){
	}
 
 	public YonghurijiView(YonghurijiEntity yonghurijiEntity){
 	try {
			BeanUtils.copyProperties(this, yonghurijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
