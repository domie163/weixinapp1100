package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchangzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchangzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchangzixunView;


/**
 * 农场资讯
 *
 * @author 
 * @email 
 * @date 2021-03-24 22:39:00
 */
public interface NongchangzixunService extends IService<NongchangzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchangzixunVO> selectListVO(Wrapper<NongchangzixunEntity> wrapper);
   	
   	NongchangzixunVO selectVO(@Param("ew") Wrapper<NongchangzixunEntity> wrapper);
   	
   	List<NongchangzixunView> selectListView(Wrapper<NongchangzixunEntity> wrapper);
   	
   	NongchangzixunView selectView(@Param("ew") Wrapper<NongchangzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchangzixunEntity> wrapper);
   	
}

