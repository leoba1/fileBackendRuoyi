package com.ruoyi.system.bai.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.bai.mapper.OperationlogMapper;
import com.ruoyi.system.bai.domain.Operationlog;
import com.ruoyi.system.bai.service.IOperationlogService;

/**
 * logService业务层处理
 *
 * @author bai
 * @date 2024-01-20
 */
@Service
public class OperationlogServiceImpl implements IOperationlogService
{
    @Autowired
    private OperationlogMapper operationlogMapper;

    /**
     * 查询log
     *
     * @param operationLogId log主键
     * @return log
     */
    @Override
    public Operationlog selectOperationlogByOperationLogId(Long operationLogId)
    {
        return operationlogMapper.selectOperationlogByOperationLogId(operationLogId);
    }

    /**
     * 查询log列表
     *
     * @param operationlog log
     * @return log
     */
    @Override
    public List<Operationlog> selectOperationlogList(Operationlog operationlog)
    {
        return operationlogMapper.selectOperationlogList(operationlog);
    }

    /**
     * 新增log
     *
     * @param operationlog log
     * @return 结果
     */
    @Override
    public int insertOperationlog(Operationlog operationlog)
    {
        return operationlogMapper.insertOperationlog(operationlog);
    }

    /**
     * 修改log
     *
     * @param operationlog log
     * @return 结果
     */
    @Override
    public int updateOperationlog(Operationlog operationlog)
    {
        return operationlogMapper.updateOperationlog(operationlog);
    }

    /**
     * 批量删除log
     *
     * @param operationLogIds 需要删除的log主键
     * @return 结果
     */
    @Override
    public int deleteOperationlogByOperationLogIds(Long[] operationLogIds)
    {
        return operationlogMapper.deleteOperationlogByOperationLogIds(operationLogIds);
    }

    /**
     * 删除log信息
     *
     * @param operationLogId log主键
     * @return 结果
     */
    @Override
    public int deleteOperationlogByOperationLogId(Long operationLogId)
    {
        return operationlogMapper.deleteOperationlogByOperationLogId(operationLogId);
    }
}
