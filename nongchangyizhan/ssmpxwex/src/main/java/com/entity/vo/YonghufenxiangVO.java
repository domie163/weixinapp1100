package com.entity.vo;

import com.entity.YonghufenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 用户分享
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-24 22:39:00
 */
public class YonghufenxiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分享类型
	 */
	
	private String fenxiangleixing;
		
	/**
	 * 分享内容
	 */
	
	private String fenxiangneirong;
		
	/**
	 * 分享图片
	 */
	
	private String fenxiangtupian;
		
	/**
	 * 分享日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fenxiangriqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：分享类型
	 */
	 
	public void setFenxiangleixing(String fenxiangleixing) {
		this.fenxiangleixing = fenxiangleixing;
	}
	
	/**
	 * 获取：分享类型
	 */
	public String getFenxiangleixing() {
		return fenxiangleixing;
	}
				
	
	/**
	 * 设置：分享内容
	 */
	 
	public void setFenxiangneirong(String fenxiangneirong) {
		this.fenxiangneirong = fenxiangneirong;
	}
	
	/**
	 * 获取：分享内容
	 */
	public String getFenxiangneirong() {
		return fenxiangneirong;
	}
				
	
	/**
	 * 设置：分享图片
	 */
	 
	public void setFenxiangtupian(String fenxiangtupian) {
		this.fenxiangtupian = fenxiangtupian;
	}
	
	/**
	 * 获取：分享图片
	 */
	public String getFenxiangtupian() {
		return fenxiangtupian;
	}
				
	
	/**
	 * 设置：分享日期
	 */
	 
	public void setFenxiangriqi(Date fenxiangriqi) {
		this.fenxiangriqi = fenxiangriqi;
	}
	
	/**
	 * 获取：分享日期
	 */
	public Date getFenxiangriqi() {
		return fenxiangriqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
