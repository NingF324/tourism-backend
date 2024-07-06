package com.ruoyi.hotel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hotel.mapper.StarhotelreviewsMapper;
import com.ruoyi.hotel.domain.Starhotelreviews;
import com.ruoyi.hotel.service.IStarhotelreviewsService;

/**
 * 星级酒店评价管理Service业务层处理
 * 
 * @author ningf
 * @date 2024-07-06
 */
@Service
public class StarhotelreviewsServiceImpl implements IStarhotelreviewsService 
{
    @Autowired
    private StarhotelreviewsMapper starhotelreviewsMapper;

    /**
     * 查询星级酒店评价管理
     * 
     * @param id 星级酒店评价管理主键
     * @return 星级酒店评价管理
     */
    @Override
    public Starhotelreviews selectStarhotelreviewsById(Long id)
    {
        return starhotelreviewsMapper.selectStarhotelreviewsById(id);
    }

    /**
     * 查询星级酒店评价管理列表
     * 
     * @param starhotelreviews 星级酒店评价管理
     * @return 星级酒店评价管理
     */
    @Override
    public List<Starhotelreviews> selectStarhotelreviewsList(Starhotelreviews starhotelreviews)
    {
        return starhotelreviewsMapper.selectStarhotelreviewsList(starhotelreviews);
    }

    /**
     * 新增星级酒店评价管理
     * 
     * @param starhotelreviews 星级酒店评价管理
     * @return 结果
     */
    @Override
    public int insertStarhotelreviews(Starhotelreviews starhotelreviews)
    {
        return starhotelreviewsMapper.insertStarhotelreviews(starhotelreviews);
    }

    /**
     * 修改星级酒店评价管理
     * 
     * @param starhotelreviews 星级酒店评价管理
     * @return 结果
     */
    @Override
    public int updateStarhotelreviews(Starhotelreviews starhotelreviews)
    {
        return starhotelreviewsMapper.updateStarhotelreviews(starhotelreviews);
    }

    /**
     * 批量删除星级酒店评价管理
     * 
     * @param ids 需要删除的星级酒店评价管理主键
     * @return 结果
     */
    @Override
    public int deleteStarhotelreviewsByIds(Long[] ids)
    {
        return starhotelreviewsMapper.deleteStarhotelreviewsByIds(ids);
    }

    /**
     * 删除星级酒店评价管理信息
     * 
     * @param id 星级酒店评价管理主键
     * @return 结果
     */
    @Override
    public int deleteStarhotelreviewsById(Long id)
    {
        return starhotelreviewsMapper.deleteStarhotelreviewsById(id);
    }
}