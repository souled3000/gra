package gra.busi;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装分页对象 
 **/
public class Page {
    private int curPageNo;   //当前页
    private String staff;
    public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public int getCurPageNo() {
		return curPageNo;
	}

	public void setCurPageNo(int curPageNo) {
		this.curPageNo = curPageNo;
	}

	public boolean isCanPrevious() {
		return canPrevious;
	}

	public void setCanPrevious(boolean canPrevious) {
		this.canPrevious = canPrevious;
	}

	public boolean isCanNext() {
		return canNext;
	}

	public void setCanNext(boolean canNext) {
		this.canNext = canNext;
	}

	private int totalRows;   //总行数
    private int pages;    //总页数
    boolean canPrevious;
    boolean canNext;
    private List<?> list=new ArrayList<Object>();



    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<?> getList() {
        if(list==null){
            list=new ArrayList<Object>();
        }
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }
}