package com.ruoyi.entertainment.service;

import java.util.List;
import com.ruoyi.entertainment.domain.Dining;

/**
 * 餐饮信息Service接口
 * 
 * @author ningf
 * @date 2024-07-09
 */
public interface IDiningService 
{
    /**
     * 查询餐饮信息
     * 
     * @param id 餐饮信息主键
     * @return 餐饮信息
     */
    public Dining selectDiningById(Long id);

    /**
     * 查询餐饮信息列表
     * 
     * @param dining 餐饮信息
     * @return 餐饮信息集合
     */
    public List<Dining> selectDiningList(Dining dining);

    /**
     * 新增餐饮信息
     * 
     * @param dining 餐饮信息
     * @return 结果
     */
    public int insertDining(Dining dining);

    /**
     * 修改餐饮信息
     * 
     * @param dining 餐饮信息
     * @return 结果
     */
    public int updateDining(Dining dining);

    /**
     * 批量删除餐饮信息
     * 
     * @param ids 需要删除的餐饮信息主键集合
     * @return 结果
     */
    public int deleteDiningByIds(Long[] ids);

    /**
     * 删除餐饮信息信息
     * 
     * @param id 餐饮信息主键
     * @return 结果
     */
    public int deleteDiningById(Long id);
}
