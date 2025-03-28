package com.entity.view;

import com.entity.ShijianshujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 事件数据
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
@TableName("shijianshuju")
public class ShijianshujuView  extends ShijianshujuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShijianshujuView(){
	}
 
 	public ShijianshujuView(ShijianshujuEntity shijianshujuEntity){
 	try {
			BeanUtils.copyProperties(this, shijianshujuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
