package com.ruoyi.hotel.service;

import java.util.List;
import com.ruoyi.hotel.domain.Nonstarmarketingrecords;

/**
 * 非星级酒店营销管理Service接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface INonstarmarketingrecordsService 
{
    /**
     * 查询非星级酒店营销管理
     * 
     * @param id 非星级酒店营销管理主键
     * @return 非星级酒店营销管理
     */
    public Nonstarmarketingrecords selectNonstarmarketingrecordsById(Long id);

    /**
     * 查询非星级酒店营销管理列表
     * 
     * @param nonstarmarketingrecords 非星级酒店营销管理
     * @return 非星级酒店营销管理集合
     */
    public List<Nonstarmarketingrecords> selectNonstarmarketingrecordsList(Nonstarmarketingrecords nonstarmarketingrecords);

    /**
     * 新增非星级酒店营销管理
     * 
     * @param nonstarmarketingrecords 非星级酒店营销管理
     * @return 结果
     */
    public int insertNonstarmarketingrecords(Nonstarmarketingrecords nonstarmarketingrecords);

    /**
     * 修改非星级酒店营销管理
     * 
     * @param nonstarmarketingrecords 非星级酒店营销管理
     * @return 结果
     */
    public int updateNonstarmarketingrecords(Nonstarmarketingrecords nonstarmarketingrecords);

    /**
     * 批量删除非星级酒店营销管理
     * 
     * @param ids 需要删除的非星级酒店营销管理主键集合
     * @return 结果
     */
    public int deleteNonstarmarketingrecordsByIds(Long[] ids);

    /**
     * 删除非星级酒店营销管理信息
     * 
     * @param id 非星级酒店营销管理主键
     * @return 结果
     */
    public int deleteNonstarmarketingrecordsById(Long id);
}
