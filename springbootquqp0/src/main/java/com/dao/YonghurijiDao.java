package com.dao;

import com.entity.YonghurijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghurijiVO;
import com.entity.view.YonghurijiView;


/**
 * 用户日记
 * 
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface YonghurijiDao extends BaseMapper<YonghurijiEntity> {
	
	List<YonghurijiVO> selectListVO(@Param("ew") Wrapper<YonghurijiEntity> wrapper);
	
	YonghurijiVO selectVO(@Param("ew") Wrapper<YonghurijiEntity> wrapper);
	
	List<YonghurijiView> selectListView(@Param("ew") Wrapper<YonghurijiEntity> wrapper);

	List<YonghurijiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghurijiEntity> wrapper);
	
	YonghurijiView selectView(@Param("ew") Wrapper<YonghurijiEntity> wrapper);
	

}
