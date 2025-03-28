package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShijianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShijianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShijianfenleiView;


/**
 * 时间分类
 *
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface ShijianfenleiService extends IService<ShijianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShijianfenleiVO> selectListVO(Wrapper<ShijianfenleiEntity> wrapper);
   	
   	ShijianfenleiVO selectVO(@Param("ew") Wrapper<ShijianfenleiEntity> wrapper);
   	
   	List<ShijianfenleiView> selectListView(Wrapper<ShijianfenleiEntity> wrapper);
   	
   	ShijianfenleiView selectView(@Param("ew") Wrapper<ShijianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShijianfenleiEntity> wrapper);
   	

}

