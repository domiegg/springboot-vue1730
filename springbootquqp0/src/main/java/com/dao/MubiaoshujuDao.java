package com.dao;

import com.entity.MubiaoshujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MubiaoshujuVO;
import com.entity.view.MubiaoshujuView;


/**
 * 目标数据
 * 
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface MubiaoshujuDao extends BaseMapper<MubiaoshujuEntity> {
	
	List<MubiaoshujuVO> selectListVO(@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);
	
	MubiaoshujuVO selectVO(@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);
	
	List<MubiaoshujuView> selectListView(@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);

	List<MubiaoshujuView> selectListView(Pagination page,@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);
	
	MubiaoshujuView selectView(@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);
}
