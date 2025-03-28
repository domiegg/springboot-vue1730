package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MubiaoshujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MubiaoshujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MubiaoshujuView;


/**
 * 目标数据
 *
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface MubiaoshujuService extends IService<MubiaoshujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MubiaoshujuVO> selectListVO(Wrapper<MubiaoshujuEntity> wrapper);
   	
   	MubiaoshujuVO selectVO(@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);
   	
   	List<MubiaoshujuView> selectListView(Wrapper<MubiaoshujuEntity> wrapper);
   	
   	MubiaoshujuView selectView(@Param("ew") Wrapper<MubiaoshujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MubiaoshujuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<MubiaoshujuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<MubiaoshujuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<MubiaoshujuEntity> wrapper);
}

