package com.dao;

import com.entity.XitonggonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XitonggonggaoVO;
import com.entity.view.XitonggonggaoView;


/**
 * 系统公告
 * 
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface XitonggonggaoDao extends BaseMapper<XitonggonggaoEntity> {
	
	List<XitonggonggaoVO> selectListVO(@Param("ew") Wrapper<XitonggonggaoEntity> wrapper);
	
	XitonggonggaoVO selectVO(@Param("ew") Wrapper<XitonggonggaoEntity> wrapper);
	
	List<XitonggonggaoView> selectListView(@Param("ew") Wrapper<XitonggonggaoEntity> wrapper);

	List<XitonggonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<XitonggonggaoEntity> wrapper);
	
	XitonggonggaoView selectView(@Param("ew") Wrapper<XitonggonggaoEntity> wrapper);
	

}
