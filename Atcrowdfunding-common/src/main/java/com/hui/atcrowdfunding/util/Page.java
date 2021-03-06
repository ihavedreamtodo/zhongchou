package com.hui.atcrowdfunding.util;

import java.util.List;

public class Page {

	private List datas;//数据
	private Integer pageno;//当前页面、码
	private Integer pagesize;//一页有多少数据
	private Integer totalno;//总的页数
	private Integer totalsize;//
	
	
	public Page(Integer pageno,Integer pagesize) {
		if(pageno<= 0) {
			this.pageno = 1;
		}else {
			this.pageno = pageno;
		}
		
		if(pagesize<= 0) {
			this.pageno = 10;
		}else {
			this.pagesize = pagesize;
		}
		
	
		
		
	}
	
	
	public List getDatas() {
		return datas;
	}


	public void setDatas(List datas) {
		this.datas = datas;
	}


	public Integer getPageno() {
		return pageno;
	}
	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public Integer getTotalno() {
		return totalno;
	}
	private void setTotalno(Integer totalno) {
		this.totalno = totalno;
	}
	public Integer getTotalsize() {
		return totalsize;
	}
	public void setTotalsize(Integer totalsize) {
		this.totalsize = totalsize;
		totalno = ((totalsize%pagesize)==0)?(totalsize/pagesize):((totalsize/pagesize)+1);
	}
	
	public Integer getStartIndex() {
		return (this.pageno - 1) * pagesize;
	}
	
	
}
