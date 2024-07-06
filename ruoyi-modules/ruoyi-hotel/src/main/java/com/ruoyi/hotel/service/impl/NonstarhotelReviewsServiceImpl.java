package com.ruoyi.hotel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hotel.mapper.NonstarhotelReviewsMapper;
import com.ruoyi.hotel.domain.NonstarhotelReviews;
import com.ruoyi.hotel.service.INonstarhotelReviewsService;

/**
 * 非星级酒店评价管理Service业务层处理
 * 
 * @author ningf
 * @date 2024-07-06
 */
@Service
public class NonstarhotelReviewsServiceImpl implements INonstarhotelReviewsService 
{
    @Autowired
    private NonstarhotelReviewsMapper nonstarhotelReviewsMapper;

    /**
     * 查询非星级酒店评价管理
     * 
     * @param id 非星级酒店评价管理主键
     * @return 非星级酒店评价管理
     */
    @Override
    public NonstarhotelReviews selectNonstarhotelReviewsById(Long id)
    {
        return nonstarhotelReviewsMapper.selectNonstarhotelReviewsById(id);
    }

    /**
     * 查询非星级酒店评价管理列表
     * 
     * @param nonstarhotelReviews 非星级酒店评价管理
     * @return 非星级酒店评价管理
     */
    @Override
    public List<NonstarhotelReviews> selectNonstarhotelReviewsList(NonstarhotelReviews nonstarhotelReviews)
    {
        return nonstarhotelReviewsMapper.selectNonstarhotelReviewsList(nonstarhotelReviews);
    }

    /**
     * 新增非星级酒店评价管理
     * 
     * @param nonstarhotelReviews 非星级酒店评价管理
     * @return 结果
     */
    @Override
    public int insertNonstarhotelReviews(NonstarhotelReviews nonstarhotelReviews)
    {
        return nonstarhotelReviewsMapper.insertNonstarhotelReviews(nonstarhotelReviews);
    }

    /**
     * 修改非星级酒店评价管理
     * 
     * @param nonstarhotelReviews 非星级酒店评价管理
     * @return 结果
     */
    @Override
    public int updateNonstarhotelReviews(NonstarhotelReviews nonstarhotelReviews)
    {
        return nonstarhotelReviewsMapper.updateNonstarhotelReviews(nonstarhotelReviews);
    }

    /**
     * 批量删除非星级酒店评价管理
     * 
     * @param ids 需要删除的非星级酒店评价管理主键
     * @return 结果
     */
    @Override
    public int deleteNonstarhotelReviewsByIds(Long[] ids)
    {
        return nonstarhotelReviewsMapper.deleteNonstarhotelReviewsByIds(ids);
    }

    /**
     * 删除非星级酒店评价管理信息
     * 
     * @param id 非星级酒店评价管理主键
     * @return 结果
     */
    @Override
    public int deleteNonstarhotelReviewsById(Long id)
    {
        return nonstarhotelReviewsMapper.deleteNonstarhotelReviewsById(id);
    }
}
