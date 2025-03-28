package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShijianshujuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShijianshujuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShijianshujuView;


/**
 * 事件数据
 *
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface ShijianshujuService extends IService<ShijianshujuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShijianshujuVO> selectListVO(Wrapper<ShijianshujuEntity> wrapper);
   	
   	ShijianshujuVO selectVO(@Param("ew") Wrapper<ShijianshujuEntity> wrapper);
   	
   	List<ShijianshujuView> selectListView(Wrapper<ShijianshujuEntity> wrapper);
   	
   	ShijianshujuView selectView(@Param("ew") Wrapper<ShijianshujuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShijianshujuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShijianshujuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShijianshujuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShijianshujuEntity> wrapper);
}

