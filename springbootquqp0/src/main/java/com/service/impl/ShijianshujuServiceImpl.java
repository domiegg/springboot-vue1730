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


import com.dao.ShijianshujuDao;
import com.entity.ShijianshujuEntity;
import com.service.ShijianshujuService;
import com.entity.vo.ShijianshujuVO;
import com.entity.view.ShijianshujuView;

@Service("shijianshujuService")
public class ShijianshujuServiceImpl extends ServiceImpl<ShijianshujuDao, ShijianshujuEntity> implements ShijianshujuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShijianshujuEntity> page = this.selectPage(
                new Query<ShijianshujuEntity>(params).getPage(),
                new EntityWrapper<ShijianshujuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShijianshujuEntity> wrapper) {
		  Page<ShijianshujuView> page =new Query<ShijianshujuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShijianshujuVO> selectListVO(Wrapper<ShijianshujuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShijianshujuVO selectVO(Wrapper<ShijianshujuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShijianshujuView> selectListView(Wrapper<ShijianshujuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShijianshujuView selectView(Wrapper<ShijianshujuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShijianshujuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShijianshujuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShijianshujuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
