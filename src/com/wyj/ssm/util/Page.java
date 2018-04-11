package com.wyj.ssm.util;

import com.wyj.ssm.pojo.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/7.
 */
public class Page {

    private int pageNo = 1;
    private int pageSize = 3;
    private int pages;
    private int pageCount;
    private List<Product> products = new ArrayList<Product>();

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
        this.pages = this.pageCount % this.pageSize == 0 ?
                this.pageCount / this.pageSize :
                this.pageCount / this.pageSize + 1;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
