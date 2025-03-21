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


import com.dao.NongchangzixunDao;
import com.entity.NongchangzixunEntity;
import com.service.NongchangzixunService;
import com.entity.vo.NongchangzixunVO;
import com.entity.view.NongchangzixunView;

@Service("nongchangzixunService")
public class NongchangzixunServiceImpl extends ServiceImpl<NongchangzixunDao, NongchangzixunEntity> implements NongchangzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchangzixunEntity> page = this.selectPage(
                new Query<NongchangzixunEntity>(params).getPage(),
                new EntityWrapper<NongchangzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchangzixunEntity> wrapper) {
		  Page<NongchangzixunView> page =new Query<NongchangzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongchangzixunVO> selectListVO(Wrapper<NongchangzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchangzixunVO selectVO(Wrapper<NongchangzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchangzixunView> selectListView(Wrapper<NongchangzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchangzixunView selectView(Wrapper<NongchangzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
