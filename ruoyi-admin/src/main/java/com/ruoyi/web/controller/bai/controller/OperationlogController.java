package com.ruoyi.web.controller.bai.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.bai.domain.Operationlog;
import com.ruoyi.system.bai.service.IOperationlogService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * logController
 *
 * @author bai
 * @date 2024-01-20
 */
@RestController
@RequestMapping("/file/operationlog")
public class OperationlogController extends BaseController
{
    @Autowired
    private IOperationlogService operationlogService;

    /**
     * 查询log列表
     */
    @PreAuthorize("@ss.hasPermi('file:operationlog:list')")
    @GetMapping("/list")
    public TableDataInfo list(Operationlog operationlog)
    {
        startPage();
        List<Operationlog> list = operationlogService.selectOperationlogList(operationlog);
        return getDataTable(list);
    }

    /**
     * 导出log列表
     */
    @PreAuthorize("@ss.hasPermi('file:operationlog:export')")
    @Log(title = "log", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Operationlog operationlog)
    {
        List<Operationlog> list = operationlogService.selectOperationlogList(operationlog);
        ExcelUtil<Operationlog> util = new ExcelUtil<Operationlog>(Operationlog.class);
        util.exportExcel(response, list, "log数据");
    }

    /**
     * 获取log详细信息
     */
    @PreAuthorize("@ss.hasPermi('file:operationlog:query')")
    @GetMapping(value = "/{operationLogId}")
    public AjaxResult getInfo(@PathVariable("operationLogId") Long operationLogId)
    {
        return success(operationlogService.selectOperationlogByOperationLogId(operationLogId));
    }

    /**
     * 新增log
     */
    @PreAuthorize("@ss.hasPermi('file:operationlog:add')")
    @Log(title = "log", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Operationlog operationlog)
    {
        return toAjax(operationlogService.insertOperationlog(operationlog));
    }

    /**
     * 修改log
     */
    @PreAuthorize("@ss.hasPermi('file:operationlog:edit')")
    @Log(title = "log", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Operationlog operationlog)
    {
        return toAjax(operationlogService.updateOperationlog(operationlog));
    }

    /**
     * 删除log
     */
    @PreAuthorize("@ss.hasPermi('file:operationlog:remove')")
    @Log(title = "log", businessType = BusinessType.DELETE)
	@DeleteMapping("/{operationLogIds}")
    public AjaxResult remove(@PathVariable Long[] operationLogIds)
    {
        return toAjax(operationlogService.deleteOperationlogByOperationLogIds(operationLogIds));
    }
}
