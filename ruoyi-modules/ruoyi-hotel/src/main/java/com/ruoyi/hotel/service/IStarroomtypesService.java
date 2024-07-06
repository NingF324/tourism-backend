package com.ruoyi.hotel.service;

import java.util.List;
import com.ruoyi.hotel.domain.Starroomtypes;

/**
 * 星级酒店房型管理Service接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface IStarroomtypesService 
{
    /**
     * 查询星级酒店房型管理
     * 
     * @param id 星级酒店房型管理主键
     * @return 星级酒店房型管理
     */
    public Starroomtypes selectStarroomtypesById(Long id);

    /**
     * 查询星级酒店房型管理列表
     * 
     * @param starroomtypes 星级酒店房型管理
     * @return 星级酒店房型管理集合
     */
    public List<Starroomtypes> selectStarroomtypesList(Starroomtypes starroomtypes);

    /**
     * 新增星级酒店房型管理
     * 
     * @param starroomtypes 星级酒店房型管理
     * @return 结果
     */
    public int insertStarroomtypes(Starroomtypes starroomtypes);

    /**
     * 修改星级酒店房型管理
     * 
     * @param starroomtypes 星级酒店房型管理
     * @return 结果
     */
    public int updateStarroomtypes(Starroomtypes starroomtypes);

    /**
     * 批量删除星级酒店房型管理
     * 
     * @param ids 需要删除的星级酒店房型管理主键集合
     * @return 结果
     */
    public int deleteStarroomtypesByIds(Long[] ids);

    /**
     * 删除星级酒店房型管理信息
     * 
     * @param id 星级酒店房型管理主键
     * @return 结果
     */
    public int deleteStarroomtypesById(Long id);
}
