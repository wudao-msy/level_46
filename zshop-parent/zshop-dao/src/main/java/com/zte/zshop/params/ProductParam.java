package com.zte.zshop.params;

/**
 * Author:helloboy
 * Date:2020-06-13 9:06
 * Description:<描述>
 * 用于封装前台首页按条件查询的查询条件
 */
public class ProductParam {

    private String name;

    private Double minPrice;

    private Double maxPrice;

    private Integer productTypeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
}
