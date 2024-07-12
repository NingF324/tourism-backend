package com.ruoyi.hotel.mapper;

import com.ruoyi.hotel.domain.StarhotelReviews;
import com.ruoyi.hotel.domain.StarhotelRooms;

import java.util.List;

public interface StarhotelReviewsMapper {
    /**
     * 查询星级酒店评论列表
     *
     * @param id 星级酒店ID
     * @return 指定星级酒店房间集合
     */
    public List<StarhotelReviews> selectStarhotelReviewsList(Long id);
}
