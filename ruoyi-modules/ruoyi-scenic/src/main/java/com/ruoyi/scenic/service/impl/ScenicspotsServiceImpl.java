package com.ruoyi.scenic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.scenic.mapper.ScenicspotsMapper;
import com.ruoyi.scenic.domain.Scenicspots;
import com.ruoyi.scenic.service.IScenicspotsService;

/**
 * 景点信息管理Service业务层处理
 * 
 * @author ningf
 * @date 2024-07-17
 */
@Service
public class ScenicspotsServiceImpl implements IScenicspotsService 
{
    @Autowired
    private ScenicspotsMapper scenicspotsMapper;

    /**
     * 查询景点信息管理
     * 
     * @param id 景点信息管理主键
     * @return 景点信息管理
     */
    @Override
    public Scenicspots selectScenicspotsById(Long id)
    {
        return scenicspotsMapper.selectScenicspotsById(id);
    }

    /**
     * 查询景点信息管理列表
     * 
     * @param scenicspots 景点信息管理
     * @return 景点信息管理
     */
    @Override
    public List<Scenicspots> selectScenicspotsList(Scenicspots scenicspots)
    {
        return scenicspotsMapper.selectScenicspotsList(scenicspots);
    }

    /**
     * 新增景点信息管理
     * 
     * @param scenicspots 景点信息管理
     * @return 结果
     */
    @Override
    public int insertScenicspots(Scenicspots scenicspots)
    {
        return scenicspotsMapper.insertScenicspots(scenicspots);
    }

    /**
     * 修改景点信息管理
     * 
     * @param scenicspots 景点信息管理
     * @return 结果
     */
    @Override
    public int updateScenicspots(Scenicspots scenicspots)
    {
        return scenicspotsMapper.updateScenicspots(scenicspots);
    }

    /**
     * 批量删除景点信息管理
     * 
     * @param ids 需要删除的景点信息管理主键
     * @return 结果
     */
    @Override
    public int deleteScenicspotsByIds(Long[] ids)
    {
        return scenicspotsMapper.deleteScenicspotsByIds(ids);
    }

    /**
     * 删除景点信息管理信息
     * 
     * @param id 景点信息管理主键
     * @return 结果
     */
    @Override
    public int deleteScenicspotsById(Long id)
    {
        return scenicspotsMapper.deleteScenicspotsById(id);
    }
}
