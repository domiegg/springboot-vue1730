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


import com.dao.YonghurijiDao;
import com.entity.YonghurijiEntity;
import com.service.YonghurijiService;
import com.entity.vo.YonghurijiVO;
import com.entity.view.YonghurijiView;

@Service("yonghurijiService")
public class YonghurijiServiceImpl extends ServiceImpl<YonghurijiDao, YonghurijiEntity> implements YonghurijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghurijiEntity> page = this.selectPage(
                new Query<YonghurijiEntity>(params).getPage(),
                new EntityWrapper<YonghurijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghurijiEntity> wrapper) {
		  Page<YonghurijiView> page =new Query<YonghurijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghurijiVO> selectListVO(Wrapper<YonghurijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghurijiVO selectVO(Wrapper<YonghurijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghurijiView> selectListView(Wrapper<YonghurijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghurijiView selectView(Wrapper<YonghurijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
