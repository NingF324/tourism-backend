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
import com.ruoyi.hotel.domain.Starhotels;
import com.ruoyi.hotel.service.IStarhotelsService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 星级酒店Controller
 * 
 * @author ruoyi
 * @date 2024-07-06
 */
@RestController
@RequestMapping("/starhotels")
public class StarhotelsController extends BaseController
{
    @Autowired
    private IStarhotelsService starhotelsService;

    /**
     * 查询星级酒店列表
     */
    @RequiresPermissions("hotel:starhotels:list")
    @GetMapping("/list")
    public TableDataInfo list(Starhotels starhotels)
    {
        startPage();
        List<Starhotels> list = starhotelsService.selectStarhotelsList(starhotels);
        return getDataTable(list);
    }


    /**
     * 获取星级酒店
     */
    @RequiresPermissions("hotel:starhotels:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(starhotelsService.selectStarhotelsById(id));
    }
}
