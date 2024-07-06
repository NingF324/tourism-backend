package com.ruoyi.hotel.service;

import java.util.List;
import com.ruoyi.hotel.domain.Starmarketingrecords;

/**
 * 星级酒店营销管理Service接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface IStarmarketingrecordsService 
{
    /**
     * 查询星级酒店营销管理
     * 
     * @param id 星级酒店营销管理主键
     * @return 星级酒店营销管理
     */
    public Starmarketingrecords selectStarmarketingrecordsById(Long id);

    /**
     * 查询星级酒店营销管理列表
     * 
     * @param starmarketingrecords 星级酒店营销管理
     * @return 星级酒店营销管理集合
     */
    public List<Starmarketingrecords> selectStarmarketingrecordsList(Starmarketingrecords starmarketingrecords);

    /**
     * 新增星级酒店营销管理
     * 
     * @param starmarketingrecords 星级酒店营销管理
     * @return 结果
     */
    public int insertStarmarketingrecords(Starmarketingrecords starmarketingrecords);

    /**
     * 修改星级酒店营销管理
     * 
     * @param starmarketingrecords 星级酒店营销管理
     * @return 结果
     */
    public int updateStarmarketingrecords(Starmarketingrecords starmarketingrecords);

    /**
     * 批量删除星级酒店营销管理
     * 
     * @param ids 需要删除的星级酒店营销管理主键集合
     * @return 结果
     */
    public int deleteStarmarketingrecordsByIds(Long[] ids);

    /**
     * 删除星级酒店营销管理信息
     * 
     * @param id 星级酒店营销管理主键
     * @return 结果
     */
    public int deleteStarmarketingrecordsById(Long id);
}
