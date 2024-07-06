package com.ruoyi.hotel.service;

import java.util.List;
import com.ruoyi.hotel.domain.Nonstarhotels;

/**
 * 非星级酒店管理Service接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface INonstarhotelsService 
{
    /**
     * 查询非星级酒店管理
     * 
     * @param id 非星级酒店管理主键
     * @return 非星级酒店管理
     */
    public Nonstarhotels selectNonstarhotelsById(Long id);

    /**
     * 查询非星级酒店管理列表
     * 
     * @param nonstarhotels 非星级酒店管理
     * @return 非星级酒店管理集合
     */
    public List<Nonstarhotels> selectNonstarhotelsList(Nonstarhotels nonstarhotels);

    /**
     * 新增非星级酒店管理
     * 
     * @param nonstarhotels 非星级酒店管理
     * @return 结果
     */
    public int insertNonstarhotels(Nonstarhotels nonstarhotels);

    /**
     * 修改非星级酒店管理
     * 
     * @param nonstarhotels 非星级酒店管理
     * @return 结果
     */
    public int updateNonstarhotels(Nonstarhotels nonstarhotels);

    /**
     * 批量删除非星级酒店管理
     * 
     * @param ids 需要删除的非星级酒店管理主键集合
     * @return 结果
     */
    public int deleteNonstarhotelsByIds(Long[] ids);

    /**
     * 删除非星级酒店管理信息
     * 
     * @param id 非星级酒店管理主键
     * @return 结果
     */
    public int deleteNonstarhotelsById(Long id);
}