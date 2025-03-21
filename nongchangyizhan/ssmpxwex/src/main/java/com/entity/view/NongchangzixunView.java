package com.entity.view;

import com.entity.NongchangzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农场资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 22:39:00
 */
@TableName("nongchangzixun")
public class NongchangzixunView  extends NongchangzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongchangzixunView(){
	}
 
 	public NongchangzixunView(NongchangzixunEntity nongchangzixunEntity){
 	try {
			BeanUtils.copyProperties(this, nongchangzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
