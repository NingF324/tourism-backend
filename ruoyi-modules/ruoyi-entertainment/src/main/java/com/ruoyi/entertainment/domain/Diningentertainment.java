package com.ruoyi.entertainment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 餐饮娱乐信息对象 diningentertainment
 * 
 * @author ningf
 * @date 2024-07-06
 */
public class Diningentertainment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 餐饮娱乐id */
    private Long id;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 营业开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "营业开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date openingTime;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 营业结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "营业结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date closingTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setOpeningTime(Date openingTime) 
    {
        this.openingTime = openingTime;
    }

    public Date getOpeningTime() 
    {
        return openingTime;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setClosingTime(Date closingTime) 
    {
        this.closingTime = closingTime;
    }

    public Date getClosingTime() 
    {
        return closingTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("name", getName())
            .append("openingTime", getOpeningTime())
            .append("address", getAddress())
            .append("closingTime", getClosingTime())
            .toString();
    }
}
