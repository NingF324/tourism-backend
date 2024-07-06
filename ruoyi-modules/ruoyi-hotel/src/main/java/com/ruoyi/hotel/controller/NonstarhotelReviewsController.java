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
import com.ruoyi.hotel.domain.NonstarhotelReviews;
import com.ruoyi.hotel.service.INonstarhotelReviewsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 非星级酒店评价管理Controller
 * 
 * @author ningf
 * @date 2024-07-06
 */
@RestController
@RequestMapping("/reviews")
public class NonstarhotelReviewsController extends BaseController
{
    @Autowired
    private INonstarhotelReviewsService nonstarhotelReviewsService;

    /**
     * 查询非星级酒店评价管理列表
     */
    @RequiresPermissions("hotel:reviews:list")
    @GetMapping("/list")
    public TableDataInfo list(NonstarhotelReviews nonstarhotelReviews)
    {
        startPage();
        List<NonstarhotelReviews> list = nonstarhotelReviewsService.selectNonstarhotelReviewsList(nonstarhotelReviews);
        return getDataTable(list);
    }

    /**
     * 导出非星级酒店评价管理列表
     */
    @RequiresPermissions("hotel:reviews:export")
    @Log(title = "非星级酒店评价管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NonstarhotelReviews nonstarhotelReviews)
    {
        List<NonstarhotelReviews> list = nonstarhotelReviewsService.selectNonstarhotelReviewsList(nonstarhotelReviews);
        ExcelUtil<NonstarhotelReviews> util = new ExcelUtil<NonstarhotelReviews>(NonstarhotelReviews.class);
        util.exportExcel(response, list, "非星级酒店评价管理数据");
    }

    /**
     * 获取非星级酒店评价管理详细信息
     */
    @RequiresPermissions("hotel:reviews:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nonstarhotelReviewsService.selectNonstarhotelReviewsById(id));
    }

    /**
     * 新增非星级酒店评价管理
     */
    @RequiresPermissions("hotel:reviews:add")
    @Log(title = "非星级酒店评价管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NonstarhotelReviews nonstarhotelReviews)
    {
        return toAjax(nonstarhotelReviewsService.insertNonstarhotelReviews(nonstarhotelReviews));
    }

    /**
     * 修改非星级酒店评价管理
     */
    @RequiresPermissions("hotel:reviews:edit")
    @Log(title = "非星级酒店评价管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NonstarhotelReviews nonstarhotelReviews)
    {
        return toAjax(nonstarhotelReviewsService.updateNonstarhotelReviews(nonstarhotelReviews));
    }

    /**
     * 删除非星级酒店评价管理
     */
    @RequiresPermissions("hotel:reviews:remove")
    @Log(title = "非星级酒店评价管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nonstarhotelReviewsService.deleteNonstarhotelReviewsByIds(ids));
    }
}
