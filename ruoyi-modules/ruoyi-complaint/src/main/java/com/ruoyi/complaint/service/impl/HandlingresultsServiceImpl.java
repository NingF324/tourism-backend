package com.ruoyi.complaint.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.complaint.mapper.HandlingresultsMapper;
import com.ruoyi.complaint.domain.Handlingresults;
import com.ruoyi.complaint.service.IHandlingresultsService;

/**
 * 投诉处理信息Service业务层处理
 * 
 * @author ningf
 * @date 2024-07-06
 */
@Service
public class HandlingresultsServiceImpl implements IHandlingresultsService 
{
    @Autowired
    private HandlingresultsMapper handlingresultsMapper;

    /**
     * 查询投诉处理信息
     * 
     * @param id 投诉处理信息主键
     * @return 投诉处理信息
     */
    @Override
    public Handlingresults selectHandlingresultsById(Long id)
    {
        return handlingresultsMapper.selectHandlingresultsById(id);
    }

    /**
     * 查询投诉处理信息列表
     * 
     * @param handlingresults 投诉处理信息
     * @return 投诉处理信息
     */
    @Override
    public List<Handlingresults> selectHandlingresultsList(Handlingresults handlingresults)
    {
        return handlingresultsMapper.selectHandlingresultsList(handlingresults);
    }

    /**
     * 新增投诉处理信息
     * 
     * @param handlingresults 投诉处理信息
     * @return 结果
     */
    @Override
    public int insertHandlingresults(Handlingresults handlingresults)
    {
        return handlingresultsMapper.insertHandlingresults(handlingresults);
    }

    /**
     * 修改投诉处理信息
     * 
     * @param handlingresults 投诉处理信息
     * @return 结果
     */
    @Override
    public int updateHandlingresults(Handlingresults handlingresults)
    {
        return handlingresultsMapper.updateHandlingresults(handlingresults);
    }

    /**
     * 批量删除投诉处理信息
     * 
     * @param ids 需要删除的投诉处理信息主键
     * @return 结果
     */
    @Override
    public int deleteHandlingresultsByIds(Long[] ids)
    {
        return handlingresultsMapper.deleteHandlingresultsByIds(ids);
    }

    /**
     * 删除投诉处理信息信息
     * 
     * @param id 投诉处理信息主键
     * @return 结果
     */
    @Override
    public int deleteHandlingresultsById(Long id)
    {
        return handlingresultsMapper.deleteHandlingresultsById(id);
    }
}
