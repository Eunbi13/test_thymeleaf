package com.iu.s1.util;

public class Pager {
	//베이스
	private Long curPage;
	private Long perPage;
	private Long startRow;
	//블록작업
	private Long startNum;
	private Long lastNum;
	private boolean pre;
	private boolean next;
	//search용
	private String kind;
	private String search;
	
	public void makeNum(Long totalCount) throws Exception{
		int perBlock=5;
		//페이지 계산
		Long totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!=0) {
			totalPage++;
		}
		//블록 계산
		Long totalBlock = totalPage/perBlock;
		if(totalPage%perBlock!=0) {
			totalBlock++;
		}
		//현재페이지가 몇번째 블록인지
		Long curBlock = curPage/perBlock;
		if(curPage%perBlock!=0) {
			curBlock++;
		}
		//밑에 보여질 startNum, lastNum
		startNum = (curBlock-1)*perBlock+1;
		lastNum = curBlock*perBlock;
		//pre next 버튼용 블록 기준
		pre=true;
		if(curBlock==1) {
			pre=false;
		}
		next=true;
		if(curBlock==totalBlock) {
			lastNum=totalPage;
			next=false;
		}
		//끝,,!
	}
	
	public void makeRow()throws Exception{
		this.startRow = (this.getCurPage()-1)*this.getPerPage();
	}

	public Long getCurPage() {
		if(this.curPage==null||this.curPage==0) {
			curPage=1L;
		}
		return curPage;
	}

	public void setCurPage(Long curPage) {
		if(this.curPage==null||this.curPage==0) {
			curPage=1L;
		}else {
			this.curPage = curPage;
		}
	}

	public Long getPerPage() {
		if(this.perPage==null||this.perPage==0) {
			this.perPage=10L;
		}
		return perPage;
	}

	public void setPerPage(Long perPage) {
		if(this.perPage==null||this.perPage==0) {
			this.perPage=10L;
		}else {
			this.perPage = perPage;
		}
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}

	public boolean isPre() {
		return pre;
	}

	public void setPre(boolean pre) {
		this.pre = pre;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSearch() {
		if(this.search==null) {
			search="";
		}
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
