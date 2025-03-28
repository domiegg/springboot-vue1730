package com.dao;

import com.entity.ShijianshujuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijianshujuVO;
import com.entity.view.ShijianshujuView;


/**
 * 事件数据
 * 
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface ShijianshujuDao extends BaseMapper<ShijianshujuEntity> {
	
	List<ShijianshujuVO> selectListVO(@Param("ew") Wrapper<ShijianshujuEntity> wrapper);
	
	ShijianshujuVO selectVO(@Param("ew") Wrapper<ShijianshujuEntity> wrapper);
	
	List<ShijianshujuView> selectListView(@Param("ew") Wrapper<ShijianshujuEntity> wrapper);

	List<ShijianshujuView> selectListView(Pagination page,@Param("ew") Wrapper<ShijianshujuEntity> wrapper);
	
	ShijianshujuView selectView(@Param("ew") Wrapper<ShijianshujuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShijianshujuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShijianshujuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShijianshujuEntity> wrapper);
}
