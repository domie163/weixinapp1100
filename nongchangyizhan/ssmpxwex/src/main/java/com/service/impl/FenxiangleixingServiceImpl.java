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


import com.dao.FenxiangleixingDao;
import com.entity.FenxiangleixingEntity;
import com.service.FenxiangleixingService;
import com.entity.vo.FenxiangleixingVO;
import com.entity.view.FenxiangleixingView;

@Service("fenxiangleixingService")
public class FenxiangleixingServiceImpl extends ServiceImpl<FenxiangleixingDao, FenxiangleixingEntity> implements FenxiangleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenxiangleixingEntity> page = this.selectPage(
                new Query<FenxiangleixingEntity>(params).getPage(),
                new EntityWrapper<FenxiangleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenxiangleixingEntity> wrapper) {
		  Page<FenxiangleixingView> page =new Query<FenxiangleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenxiangleixingVO> selectListVO(Wrapper<FenxiangleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenxiangleixingVO selectVO(Wrapper<FenxiangleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenxiangleixingView> selectListView(Wrapper<FenxiangleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenxiangleixingView selectView(Wrapper<FenxiangleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
