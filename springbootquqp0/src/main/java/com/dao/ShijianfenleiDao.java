package com.dao;

import com.entity.ShijianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijianfenleiVO;
import com.entity.view.ShijianfenleiView;


/**
 * 时间分类
 * 
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface ShijianfenleiDao extends BaseMapper<ShijianfenleiEntity> {
	
	List<ShijianfenleiVO> selectListVO(@Param("ew") Wrapper<ShijianfenleiEntity> wrapper);
	
	ShijianfenleiVO selectVO(@Param("ew") Wrapper<ShijianfenleiEntity> wrapper);
	
	List<ShijianfenleiView> selectListView(@Param("ew") Wrapper<ShijianfenleiEntity> wrapper);

	List<ShijianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShijianfenleiEntity> wrapper);
	
	ShijianfenleiView selectView(@Param("ew") Wrapper<ShijianfenleiEntity> wrapper);
	

}
