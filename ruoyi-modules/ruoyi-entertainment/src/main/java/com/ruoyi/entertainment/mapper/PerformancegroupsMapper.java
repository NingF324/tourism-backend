package com.ruoyi.entertainment.mapper;

import java.util.List;
import com.ruoyi.entertainment.domain.Performancegroups;

/**
 * 演出团体信息Mapper接口
 * 
 * @author ningf
 * @date 2024-07-08
 */
public interface PerformancegroupsMapper 
{
    /**
     * 查询演出团体信息
     * 
     * @param id 演出团体信息主键
     * @return 演出团体信息
     */
    public Performancegroups selectPerformancegroupsById(Long id);

    /**
     * 查询演出团体信息列表
     * 
     * @param performancegroups 演出团体信息
     * @return 演出团体信息集合
     */
    public List<Performancegroups> selectPerformancegroupsList(Performancegroups performancegroups);

    /**
     * 新增演出团体信息
     * 
     * @param performancegroups 演出团体信息
     * @return 结果
     */
    public int insertPerformancegroups(Performancegroups performancegroups);

    /**
     * 修改演出团体信息
     * 
     * @param performancegroups 演出团体信息
     * @return 结果
     */
    public int updatePerformancegroups(Performancegroups performancegroups);

    /**
     * 删除演出团体信息
     * 
     * @param id 演出团体信息主键
     * @return 结果
     */
    public int deletePerformancegroupsById(Long id);

    /**
     * 批量删除演出团体信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePerformancegroupsByIds(Long[] ids);
}
