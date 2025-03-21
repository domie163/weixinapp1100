package com.dao;

import com.entity.NongchangzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchangzixunVO;
import com.entity.view.NongchangzixunView;


/**
 * 农场资讯
 * 
 * @author 
 * @email 
 * @date 2021-03-24 22:39:00
 */
public interface NongchangzixunDao extends BaseMapper<NongchangzixunEntity> {
	
	List<NongchangzixunVO> selectListVO(@Param("ew") Wrapper<NongchangzixunEntity> wrapper);
	
	NongchangzixunVO selectVO(@Param("ew") Wrapper<NongchangzixunEntity> wrapper);
	
	List<NongchangzixunView> selectListView(@Param("ew") Wrapper<NongchangzixunEntity> wrapper);

	List<NongchangzixunView> selectListView(Pagination page,@Param("ew") Wrapper<NongchangzixunEntity> wrapper);
	
	NongchangzixunView selectView(@Param("ew") Wrapper<NongchangzixunEntity> wrapper);
	
}
