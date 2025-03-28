package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YonghurijiEntity;
import com.entity.view.YonghurijiView;

import com.service.YonghurijiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 用户日记
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-04 15:54:43
 */
@RestController
@RequestMapping("/yonghuriji")
public class YonghurijiController {
    @Autowired
    private YonghurijiService yonghurijiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YonghurijiEntity yonghuriji,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rijiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rijiriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			yonghuriji.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YonghurijiEntity> ew = new EntityWrapper<YonghurijiEntity>();
                if(rijiriqistart!=null) ew.ge("rijiriqi", rijiriqistart);
                if(rijiriqiend!=null) ew.le("rijiriqi", rijiriqiend);
		PageUtils page = yonghurijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghuriji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YonghurijiEntity yonghuriji, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rijiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date rijiriqiend,
		HttpServletRequest request){
        EntityWrapper<YonghurijiEntity> ew = new EntityWrapper<YonghurijiEntity>();
                if(rijiriqistart!=null) ew.ge("rijiriqi", rijiriqistart);
                if(rijiriqiend!=null) ew.le("rijiriqi", rijiriqiend);
		PageUtils page = yonghurijiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonghuriji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YonghurijiEntity yonghuriji){
       	EntityWrapper<YonghurijiEntity> ew = new EntityWrapper<YonghurijiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonghuriji, "yonghuriji")); 
        return R.ok().put("data", yonghurijiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YonghurijiEntity yonghuriji){
        EntityWrapper< YonghurijiEntity> ew = new EntityWrapper< YonghurijiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonghuriji, "yonghuriji")); 
		YonghurijiView yonghurijiView =  yonghurijiService.selectView(ew);
		return R.ok("查询用户日记成功").put("data", yonghurijiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YonghurijiEntity yonghuriji = yonghurijiService.selectById(id);
        return R.ok().put("data", yonghuriji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YonghurijiEntity yonghuriji = yonghurijiService.selectById(id);
        return R.ok().put("data", yonghuriji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YonghurijiEntity yonghuriji, HttpServletRequest request){
    	yonghuriji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghuriji);
        yonghurijiService.insert(yonghuriji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YonghurijiEntity yonghuriji, HttpServletRequest request){
    	yonghuriji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yonghuriji);
        yonghurijiService.insert(yonghuriji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YonghurijiEntity yonghuriji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonghuriji);
        yonghurijiService.updateById(yonghuriji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yonghurijiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YonghurijiEntity> wrapper = new EntityWrapper<YonghurijiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = yonghurijiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
