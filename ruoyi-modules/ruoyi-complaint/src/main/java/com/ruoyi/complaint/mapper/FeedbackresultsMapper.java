package com.ruoyi.complaint.mapper;

import java.util.List;
import com.ruoyi.complaint.domain.Feedbackresults;

/**
 * 投诉处理结果反馈Mapper接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface FeedbackresultsMapper 
{
    /**
     * 查询投诉处理结果反馈
     * 
     * @param id 投诉处理结果反馈主键
     * @return 投诉处理结果反馈
     */
    public Feedbackresults selectFeedbackresultsById(Long id);

    /**
     * 查询投诉处理结果反馈列表
     * 
     * @param feedbackresults 投诉处理结果反馈
     * @return 投诉处理结果反馈集合
     */
    public List<Feedbackresults> selectFeedbackresultsList(Feedbackresults feedbackresults);

    /**
     * 新增投诉处理结果反馈
     * 
     * @param feedbackresults 投诉处理结果反馈
     * @return 结果
     */
    public int insertFeedbackresults(Feedbackresults feedbackresults);

    /**
     * 修改投诉处理结果反馈
     * 
     * @param feedbackresults 投诉处理结果反馈
     * @return 结果
     */
    public int updateFeedbackresults(Feedbackresults feedbackresults);

    /**
     * 删除投诉处理结果反馈
     * 
     * @param id 投诉处理结果反馈主键
     * @return 结果
     */
    public int deleteFeedbackresultsById(Long id);

    /**
     * 批量删除投诉处理结果反馈
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFeedbackresultsByIds(Long[] ids);
}
