package com.ruoyi.hotel.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.hotel.domain.Starbookings;
import com.ruoyi.hotel.service.IStarbookingsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 星级酒店预定Controller
 * 
 * @author ningf
 * @date 2024-07-06
 */
@RestController
@RequestMapping("/starbookings")
public class StarbookingsController extends BaseController
{
    @Autowired
    private IStarbookingsService starbookingsService;

    /**
     * 查询星级酒店预定列表
     */
    @RequiresPermissions("hotel:starbookings:list")
    @GetMapping("/list")
    public TableDataInfo list(Starbookings starbookings)
    {
        startPage();
        List<Starbookings> list = starbookingsService.selectStarbookingsList(starbookings);
        return getDataTable(list);
    }

    /**
     * 导出星级酒店预定列表
     */
    @RequiresPermissions("hotel:starbookings:export")
    @Log(title = "星级酒店预定", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Starbookings starbookings)
    {
        List<Starbookings> list = starbookingsService.selectStarbookingsList(starbookings);
        ExcelUtil<Starbookings> util = new ExcelUtil<Starbookings>(Starbookings.class);
        util.exportExcel(response, list, "星级酒店预定数据");
    }

    /**
     * 获取星级酒店预定详细信息
     */
    @RequiresPermissions("hotel:starbookings:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(starbookingsService.selectStarbookingsById(id));
    }

    /**
     * 新增星级酒店预定
     */
    @RequiresPermissions("hotel:starbookings:add")
    @Log(title = "星级酒店预定", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Starbookings starbookings)
    {
        return toAjax(starbookingsService.insertStarbookings(starbookings));
    }

    /**
     * 修改星级酒店预定
     */
    @RequiresPermissions("hotel:starbookings:edit")
    @Log(title = "星级酒店预定", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Starbookings starbookings)
    {
        return toAjax(starbookingsService.updateStarbookings(starbookings));
    }

    /**
     * 删除星级酒店预定
     */
    @RequiresPermissions("hotel:starbookings:remove")
    @Log(title = "星级酒店预定", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(starbookingsService.deleteStarbookingsByIds(ids));
    }
}