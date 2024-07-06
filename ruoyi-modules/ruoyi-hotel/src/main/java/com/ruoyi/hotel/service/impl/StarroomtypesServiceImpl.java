package com.ruoyi.hotel.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.hotel.mapper.StarroomtypesMapper;
import com.ruoyi.hotel.domain.Starroomtypes;
import com.ruoyi.hotel.service.IStarroomtypesService;

/**
 * 星级酒店房型管理Service业务层处理
 * 
 * @author ningf
 * @date 2024-07-06
 */
@Service
public class StarroomtypesServiceImpl implements IStarroomtypesService 
{
    @Autowired
    private StarroomtypesMapper starroomtypesMapper;

    /**
     * 查询星级酒店房型管理
     * 
     * @param id 星级酒店房型管理主键
     * @return 星级酒店房型管理
     */
    @Override
    public Starroomtypes selectStarroomtypesById(Long id)
    {
        return starroomtypesMapper.selectStarroomtypesById(id);
    }

    /**
     * 查询星级酒店房型管理列表
     * 
     * @param starroomtypes 星级酒店房型管理
     * @return 星级酒店房型管理
     */
    @Override
    public List<Starroomtypes> selectStarroomtypesList(Starroomtypes starroomtypes)
    {
        return starroomtypesMapper.selectStarroomtypesList(starroomtypes);
    }

    /**
     * 新增星级酒店房型管理
     * 
     * @param starroomtypes 星级酒店房型管理
     * @return 结果
     */
    @Override
    public int insertStarroomtypes(Starroomtypes starroomtypes)
    {
        return starroomtypesMapper.insertStarroomtypes(starroomtypes);
    }

    /**
     * 修改星级酒店房型管理
     * 
     * @param starroomtypes 星级酒店房型管理
     * @return 结果
     */
    @Override
    public int updateStarroomtypes(Starroomtypes starroomtypes)
    {
        return starroomtypesMapper.updateStarroomtypes(starroomtypes);
    }

    /**
     * 批量删除星级酒店房型管理
     * 
     * @param ids 需要删除的星级酒店房型管理主键
     * @return 结果
     */
    @Override
    public int deleteStarroomtypesByIds(Long[] ids)
    {
        return starroomtypesMapper.deleteStarroomtypesByIds(ids);
    }

    /**
     * 删除星级酒店房型管理信息
     * 
     * @param id 星级酒店房型管理主键
     * @return 结果
     */
    @Override
    public int deleteStarroomtypesById(Long id)
    {
        return starroomtypesMapper.deleteStarroomtypesById(id);
    }
}
