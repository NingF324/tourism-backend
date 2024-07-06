package com.ruoyi.hotel.mapper;

import java.util.List;
import com.ruoyi.hotel.domain.Starmarketingrecords;

/**
 * 星级酒店营销管理Mapper接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface StarmarketingrecordsMapper 
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
     * 删除星级酒店营销管理
     * 
     * @param id 星级酒店营销管理主键
     * @return 结果
     */
    public int deleteStarmarketingrecordsById(Long id);

    /**
     * 批量删除星级酒店营销管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStarmarketingrecordsByIds(Long[] ids);
}
