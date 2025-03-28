package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShijianfenleiDao;
import com.entity.ShijianfenleiEntity;
import com.service.ShijianfenleiService;
import com.entity.vo.ShijianfenleiVO;
import com.entity.view.ShijianfenleiView;

@Service("shijianfenleiService")
public class ShijianfenleiServiceImpl extends ServiceImpl<ShijianfenleiDao, ShijianfenleiEntity> implements ShijianfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShijianfenleiEntity> page = this.selectPage(
                new Query<ShijianfenleiEntity>(params).getPage(),
                new EntityWrapper<ShijianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShijianfenleiEntity> wrapper) {
		  Page<ShijianfenleiView> page =new Query<ShijianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShijianfenleiVO> selectListVO(Wrapper<ShijianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShijianfenleiVO selectVO(Wrapper<ShijianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShijianfenleiView> selectListView(Wrapper<ShijianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShijianfenleiView selectView(Wrapper<ShijianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
