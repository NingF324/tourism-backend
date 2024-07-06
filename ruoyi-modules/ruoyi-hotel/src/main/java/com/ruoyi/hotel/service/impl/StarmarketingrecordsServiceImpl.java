package com.ruoyi.hotel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hotel.mapper.StarmarketingrecordsMapper;
import com.ruoyi.hotel.domain.Starmarketingrecords;
import com.ruoyi.hotel.service.IStarmarketingrecordsService;

/**
 * 星级酒店营销管理Service业务层处理
 * 
 * @author ningf
 * @date 2024-07-06
 */
@Service
public class StarmarketingrecordsServiceImpl implements IStarmarketingrecordsService 
{
    @Autowired
    private StarmarketingrecordsMapper starmarketingrecordsMapper;

    /**
     * 查询星级酒店营销管理
     * 
     * @param id 星级酒店营销管理主键
     * @return 星级酒店营销管理
     */
    @Override
    public Starmarketingrecords selectStarmarketingrecordsById(Long id)
    {
        return starmarketingrecordsMapper.selectStarmarketingrecordsById(id);
    }

    /**
     * 查询星级酒店营销管理列表
     * 
     * @param starmarketingrecords 星级酒店营销管理
     * @return 星级酒店营销管理
     */
    @Override
    public List<Starmarketingrecords> selectStarmarketingrecordsList(Starmarketingrecords starmarketingrecords)
    {
        return starmarketingrecordsMapper.selectStarmarketingrecordsList(starmarketingrecords);
    }

    /**
     * 新增星级酒店营销管理
     * 
     * @param starmarketingrecords 星级酒店营销管理
     * @return 结果
     */
    @Override
    public int insertStarmarketingrecords(Starmarketingrecords starmarketingrecords)
    {
        return starmarketingrecordsMapper.insertStarmarketingrecords(starmarketingrecords);
    }

    /**
     * 修改星级酒店营销管理
     * 
     * @param starmarketingrecords 星级酒店营销管理
     * @return 结果
     */
    @Override
    public int updateStarmarketingrecords(Starmarketingrecords starmarketingrecords)
    {
        return starmarketingrecordsMapper.updateStarmarketingrecords(starmarketingrecords);
    }

    /**
     * 批量删除星级酒店营销管理
     * 
     * @param ids 需要删除的星级酒店营销管理主键
     * @return 结果
     */
    @Override
    public int deleteStarmarketingrecordsByIds(Long[] ids)
    {
        return starmarketingrecordsMapper.deleteStarmarketingrecordsByIds(ids);
    }

    /**
     * 删除星级酒店营销管理信息
     * 
     * @param id 星级酒店营销管理主键
     * @return 结果
     */
    @Override
    public int deleteStarmarketingrecordsById(Long id)
    {
        return starmarketingrecordsMapper.deleteStarmarketingrecordsById(id);
    }
}
