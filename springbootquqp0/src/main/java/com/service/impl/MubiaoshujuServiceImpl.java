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


import com.dao.MubiaoshujuDao;
import com.entity.MubiaoshujuEntity;
import com.service.MubiaoshujuService;
import com.entity.vo.MubiaoshujuVO;
import com.entity.view.MubiaoshujuView;

@Service("mubiaoshujuService")
public class MubiaoshujuServiceImpl extends ServiceImpl<MubiaoshujuDao, MubiaoshujuEntity> implements MubiaoshujuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MubiaoshujuEntity> page = this.selectPage(
                new Query<MubiaoshujuEntity>(params).getPage(),
                new EntityWrapper<MubiaoshujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MubiaoshujuEntity> wrapper) {
		  Page<MubiaoshujuView> page =new Query<MubiaoshujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MubiaoshujuVO> selectListVO(Wrapper<MubiaoshujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MubiaoshujuVO selectVO(Wrapper<MubiaoshujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MubiaoshujuView> selectListView(Wrapper<MubiaoshujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MubiaoshujuView selectView(Wrapper<MubiaoshujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<MubiaoshujuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<MubiaoshujuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<MubiaoshujuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
