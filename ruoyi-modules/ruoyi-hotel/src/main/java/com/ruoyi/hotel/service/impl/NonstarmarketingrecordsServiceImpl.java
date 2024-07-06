package com.ruoyi.hotel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hotel.mapper.NonstarmarketingrecordsMapper;
import com.ruoyi.hotel.domain.Nonstarmarketingrecords;
import com.ruoyi.hotel.service.INonstarmarketingrecordsService;

/**
 * 非星级酒店营销管理Service业务层处理
 * 
 * @author ningf
 * @date 2024-07-06
 */
@Service
public class NonstarmarketingrecordsServiceImpl implements INonstarmarketingrecordsService 
{
    @Autowired
    private NonstarmarketingrecordsMapper nonstarmarketingrecordsMapper;

    /**
     * 查询非星级酒店营销管理
     * 
     * @param id 非星级酒店营销管理主键
     * @return 非星级酒店营销管理
     */
    @Override
    public Nonstarmarketingrecords selectNonstarmarketingrecordsById(Long id)
    {
        return nonstarmarketingrecordsMapper.selectNonstarmarketingrecordsById(id);
    }

    /**
     * 查询非星级酒店营销管理列表
     * 
     * @param nonstarmarketingrecords 非星级酒店营销管理
     * @return 非星级酒店营销管理
     */
    @Override
    public List<Nonstarmarketingrecords> selectNonstarmarketingrecordsList(Nonstarmarketingrecords nonstarmarketingrecords)
    {
        return nonstarmarketingrecordsMapper.selectNonstarmarketingrecordsList(nonstarmarketingrecords);
    }

    /**
     * 新增非星级酒店营销管理
     * 
     * @param nonstarmarketingrecords 非星级酒店营销管理
     * @return 结果
     */
    @Override
    public int insertNonstarmarketingrecords(Nonstarmarketingrecords nonstarmarketingrecords)
    {
        return nonstarmarketingrecordsMapper.insertNonstarmarketingrecords(nonstarmarketingrecords);
    }

    /**
     * 修改非星级酒店营销管理
     * 
     * @param nonstarmarketingrecords 非星级酒店营销管理
     * @return 结果
     */
    @Override
    public int updateNonstarmarketingrecords(Nonstarmarketingrecords nonstarmarketingrecords)
    {
        return nonstarmarketingrecordsMapper.updateNonstarmarketingrecords(nonstarmarketingrecords);
    }

    /**
     * 批量删除非星级酒店营销管理
     * 
     * @param ids 需要删除的非星级酒店营销管理主键
     * @return 结果
     */
    @Override
    public int deleteNonstarmarketingrecordsByIds(Long[] ids)
    {
        return nonstarmarketingrecordsMapper.deleteNonstarmarketingrecordsByIds(ids);
    }

    /**
     * 删除非星级酒店营销管理信息
     * 
     * @param id 非星级酒店营销管理主键
     * @return 结果
     */
    @Override
    public int deleteNonstarmarketingrecordsById(Long id)
    {
        return nonstarmarketingrecordsMapper.deleteNonstarmarketingrecordsById(id);
    }
}