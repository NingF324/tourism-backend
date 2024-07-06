package com.ruoyi.hotel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 星级酒店房型管理对象 starroomtypes
 * 
 * @author ningf
 * @date 2024-07-06
 */
public class Starroomtypes extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 星级酒店房型id */
    private Long id;

    /** 酒店id */
    @Excel(name = "酒店id")
    private Long hotelId;

    /** 房型名称 */
    @Excel(name = "房型名称")
    private String name;

    /** 价格 */
    @Excel(name = "价格")
    private Long price;

    /** 剩余数量 */
    @Excel(name = "剩余数量")
    private Long quantity;

    /** 销量 */
    @Excel(name = "销量")
    private Long sales;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHotelId(Long hotelId) 
    {
        this.hotelId = hotelId;
    }

    public Long getHotelId() 
    {
        return hotelId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setQuantity(Long quantity) 
    {
        this.quantity = quantity;
    }

    public Long getQuantity() 
    {
        return quantity;
    }
    public void setSales(Long sales) 
    {
        this.sales = sales;
    }

    public Long getSales() 
    {
        return sales;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hotelId", getHotelId())
            .append("name", getName())
            .append("price", getPrice())
            .append("quantity", getQuantity())
            .append("sales", getSales())
            .toString();
    }
}
