package com.ruoyi.hotel.service;

import java.util.List;
import com.ruoyi.hotel.domain.Nonstarroomtypes;

/**
 * 非星级房型Service接口
 * 
 * @author ningf
 * @date 2024-07-06
 */
public interface INonstarroomtypesService 
{
    /**
     * 查询非星级房型
     * 
     * @param id 非星级房型主键
     * @return 非星级房型
     */
    public Nonstarroomtypes selectNonstarroomtypesById(Long id);

    /**
     * 查询非星级房型列表
     * 
     * @param nonstarroomtypes 非星级房型
     * @return 非星级房型集合
     */
    public List<Nonstarroomtypes> selectNonstarroomtypesList(Nonstarroomtypes nonstarroomtypes);

    /**
     * 新增非星级房型
     * 
     * @param nonstarroomtypes 非星级房型
     * @return 结果
     */
    public int insertNonstarroomtypes(Nonstarroomtypes nonstarroomtypes);

    /**
     * 修改非星级房型
     * 
     * @param nonstarroomtypes 非星级房型
     * @return 结果
     */
    public int updateNonstarroomtypes(Nonstarroomtypes nonstarroomtypes);

    /**
     * 批量删除非星级房型
     * 
     * @param ids 需要删除的非星级房型主键集合
     * @return 结果
     */
    public int deleteNonstarroomtypesByIds(Long[] ids);

    /**
     * 删除非星级房型信息
     * 
     * @param id 非星级房型主键
     * @return 结果
     */
    public int deleteNonstarroomtypesById(Long id);
}
