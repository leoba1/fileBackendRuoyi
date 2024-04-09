package com.ruoyi.web.controller.bai.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.bai.domain.Userfile;
import com.ruoyi.system.bai.service.IUserfileService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文件Controller
 *
 * @author bai
 * @date 2024-04-09
 */
@RestController
@RequestMapping("/system/userfile")
public class UserfileController extends BaseController
{
    @Autowired
    private IUserfileService userfileService;

    /**
     * 查询文件列表
     */
    @PreAuthorize("@ss.hasPermi('system:userfile:list')")
    @GetMapping("/list")
    public TableDataInfo list(Userfile userfile)
    {
        startPage();
        List<Userfile> list = userfileService.selectUserfileList(userfile);
        return getDataTable(list);
    }

    /**
     * 导出文件列表
     */
    @PreAuthorize("@ss.hasPermi('system:userfile:export')")
    @Log(title = "文件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Userfile userfile)
    {
        List<Userfile> list = userfileService.selectUserfileList(userfile);
        ExcelUtil<Userfile> util = new ExcelUtil<Userfile>(Userfile.class);
        util.exportExcel(response, list, "文件数据");
    }

    /**
     * 获取文件详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:userfile:query')")
    @GetMapping(value = "/{userFileId}")
    public AjaxResult getInfo(@PathVariable("userFileId") String userFileId)
    {
        return success(userfileService.selectUserfileByUserFileId(userFileId));
    }

    /**
     * 新增文件
     */
    @PreAuthorize("@ss.hasPermi('system:userfile:add')")
    @Log(title = "文件", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Userfile userfile)
    {
        return toAjax(userfileService.insertUserfile(userfile));
    }

    /**
     * 修改文件
     */
    @PreAuthorize("@ss.hasPermi('system:userfile:edit')")
    @Log(title = "文件", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Userfile userfile)
    {
        return toAjax(userfileService.updateUserfile(userfile));
    }

    /**
     * 删除文件
     */
    @PreAuthorize("@ss.hasPermi('system:userfile:remove')")
    @Log(title = "文件", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userFileIds}")
    public AjaxResult remove(@PathVariable String[] userFileIds)
    {
        return toAjax(userfileService.deleteUserfileByUserFileIds(userFileIds));
    }
}
