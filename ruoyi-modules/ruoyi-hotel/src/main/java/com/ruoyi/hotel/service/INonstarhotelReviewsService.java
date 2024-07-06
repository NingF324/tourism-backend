package com.ruoyi.hotel.service;

import java.util.List;
import com.ruoyi.hotel.domain.NonstarhotelReviews;

/**
 * 非星级酒店评价管理Service接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface INonstarhotelReviewsService 
{
    /**
     * 查询非星级酒店评价管理
     * 
     * @param id 非星级酒店评价管理主键
     * @return 非星级酒店评价管理
     */
    public NonstarhotelReviews selectNonstarhotelReviewsById(Long id);

    /**
     * 查询非星级酒店评价管理列表
     * 
     * @param nonstarhotelReviews 非星级酒店评价管理
     * @return 非星级酒店评价管理集合
     */
    public List<NonstarhotelReviews> selectNonstarhotelReviewsList(NonstarhotelReviews nonstarhotelReviews);

    /**
     * 新增非星级酒店评价管理
     * 
     * @param nonstarhotelReviews 非星级酒店评价管理
     * @return 结果
     */
    public int insertNonstarhotelReviews(NonstarhotelReviews nonstarhotelReviews);

    /**
     * 修改非星级酒店评价管理
     * 
     * @param nonstarhotelReviews 非星级酒店评价管理
     * @return 结果
     */
    public int updateNonstarhotelReviews(NonstarhotelReviews nonstarhotelReviews);

    /**
     * 批量删除非星级酒店评价管理
     * 
     * @param ids 需要删除的非星级酒店评价管理主键集合
     * @return 结果
     */
    public int deleteNonstarhotelReviewsByIds(Long[] ids);

    /**
     * 删除非星级酒店评价管理信息
     * 
     * @param id 非星级酒店评价管理主键
     * @return 结果
     */
    public int deleteNonstarhotelReviewsById(Long id);
}
