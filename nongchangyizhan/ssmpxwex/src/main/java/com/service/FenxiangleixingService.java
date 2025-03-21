package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenxiangleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenxiangleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenxiangleixingView;


/**
 * 分享类型
 *
 * @author 
 * @email 
 * @date 2021-03-24 22:39:00
 */
public interface FenxiangleixingService extends IService<FenxiangleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenxiangleixingVO> selectListVO(Wrapper<FenxiangleixingEntity> wrapper);
   	
   	FenxiangleixingVO selectVO(@Param("ew") Wrapper<FenxiangleixingEntity> wrapper);
   	
   	List<FenxiangleixingView> selectListView(Wrapper<FenxiangleixingEntity> wrapper);
   	
   	FenxiangleixingView selectView(@Param("ew") Wrapper<FenxiangleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenxiangleixingEntity> wrapper);
   	
}

