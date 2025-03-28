package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghurijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghurijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghurijiView;


/**
 * 用户日记
 *
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
public interface YonghurijiService extends IService<YonghurijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghurijiVO> selectListVO(Wrapper<YonghurijiEntity> wrapper);
   	
   	YonghurijiVO selectVO(@Param("ew") Wrapper<YonghurijiEntity> wrapper);
   	
   	List<YonghurijiView> selectListView(Wrapper<YonghurijiEntity> wrapper);
   	
   	YonghurijiView selectView(@Param("ew") Wrapper<YonghurijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghurijiEntity> wrapper);
   	

}

