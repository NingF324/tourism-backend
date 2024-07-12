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
import com.ruoyi.hotel.domain.Nonstarhotels;
import com.ruoyi.hotel.service.INonstarhotelsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 非星级酒店Controller
 * 
 * @author ruoyi
 * @date 2024-07-11
 */
@RestController
@RequestMapping("/nonstarhotels")
public class NonstarhotelsController extends BaseController
{
    @Autowired
    private INonstarhotelsService nonstarhotelsService;

    /**
     * 查询非星级酒店列表
     */
    @RequiresPermissions("hotel:nonstarhotels:list")
    @GetMapping("/list")
    public TableDataInfo list(Nonstarhotels nonstarhotels)
    {
        startPage();
        List<Nonstarhotels> list = nonstarhotelsService.selectNonstarhotelsList(nonstarhotels);
        return getDataTable(list);
    }



    /**
     * 获取非星级酒店详细信息
     */
    @RequiresPermissions("hotel:nonstarhotels:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nonstarhotelsService.selectNonstarhotelsById(id));
    }
}
