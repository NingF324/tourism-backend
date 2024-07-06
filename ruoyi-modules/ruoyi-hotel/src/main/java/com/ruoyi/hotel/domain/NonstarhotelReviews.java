package com.ruoyi.hotel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 非星级酒店评价管理对象 nonstarhotel_reviews
 * 
 * @author ningf
 * @date 2024-07-06
 */
public class NonstarhotelReviews extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 非星级酒店评价id */
    private Long id;

    /** 酒店id */
    @Excel(name = "酒店id")
    private Long hotelId;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 用户id */
    @Excel(name = "用户id")
    private Long guestId;

    /** 评分 */
    @Excel(name = "评分")
    private Long rating;

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
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setGuestId(Long guestId) 
    {
        this.guestId = guestId;
    }

    public Long getGuestId() 
    {
        return guestId;
    }
    public void setRating(Long rating) 
    {
        this.rating = rating;
    }

    public Long getRating() 
    {
        return rating;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hotelId", getHotelId())
            .append("content", getContent())
            .append("guestId", getGuestId())
            .append("rating", getRating())
            .toString();
    }
}
