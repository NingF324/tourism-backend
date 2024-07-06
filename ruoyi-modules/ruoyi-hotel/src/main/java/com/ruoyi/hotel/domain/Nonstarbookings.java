package com.ruoyi.hotel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 非星级酒店预定信息对象 nonstarbookings
 * 
 * @author ningf
 * @date 2024-07-06
 */
public class Nonstarbookings extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 非星级酒店预定id */
    private Long id;

    /** 酒店id */
    @Excel(name = "酒店id")
    private Long hotelId;

    /** 房型id */
    @Excel(name = "房型id")
    private Long roomTypeId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long guestName;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String contactNumber;

    /** 是否已确认 */
    @Excel(name = "是否已确认")
    private Integer recorded;

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
    public void setRoomTypeId(Long roomTypeId) 
    {
        this.roomTypeId = roomTypeId;
    }

    public Long getRoomTypeId() 
    {
        return roomTypeId;
    }
    public void setGuestName(Long guestName) 
    {
        this.guestName = guestName;
    }

    public Long getGuestName() 
    {
        return guestName;
    }
    public void setContactNumber(String contactNumber) 
    {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() 
    {
        return contactNumber;
    }
    public void setRecorded(Integer recorded) 
    {
        this.recorded = recorded;
    }

    public Integer getRecorded() 
    {
        return recorded;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hotelId", getHotelId())
            .append("roomTypeId", getRoomTypeId())
            .append("guestName", getGuestName())
            .append("contactNumber", getContactNumber())
            .append("recorded", getRecorded())
            .toString();
    }
}
