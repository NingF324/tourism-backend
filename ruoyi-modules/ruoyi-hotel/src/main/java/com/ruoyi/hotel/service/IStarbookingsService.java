package com.ruoyi.hotel.service;

import java.util.List;
import com.ruoyi.hotel.domain.Starbookings;

/**
 * 星级酒店预定Service接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface IStarbookingsService 
{
    /**
     * 查询星级酒店预定
     * 
     * @param id 星级酒店预定主键
     * @return 星级酒店预定
     */
    public Starbookings selectStarbookingsById(Long id);

    /**
     * 查询星级酒店预定列表
     * 
     * @param starbookings 星级酒店预定
     * @return 星级酒店预定集合
     */
    public List<Starbookings> selectStarbookingsList(Starbookings starbookings);

    /**
     * 新增星级酒店预定
     * 
     * @param starbookings 星级酒店预定
     * @return 结果
     */
    public int insertStarbookings(Starbookings starbookings);

    /**
     * 修改星级酒店预定
     * 
     * @param starbookings 星级酒店预定
     * @return 结果
     */
    public int updateStarbookings(Starbookings starbookings);

    /**
     * 批量删除星级酒店预定
     * 
     * @param ids 需要删除的星级酒店预定主键集合
     * @return 结果
     */
    public int deleteStarbookingsByIds(Long[] ids);

    /**
     * 删除星级酒店预定信息
     * 
     * @param id 星级酒店预定主键
     * @return 结果
     */
    public int deleteStarbookingsById(Long id);
}
