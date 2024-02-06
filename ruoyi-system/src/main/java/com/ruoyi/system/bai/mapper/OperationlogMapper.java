package com.ruoyi.system.bai.mapper;

import java.util.List;
import com.ruoyi.system.bai.domain.Operationlog;

/**
 * logMapper接口
 *
 * @author bai
 * @date 2024-01-20
 */
public interface OperationlogMapper
{
    /**
     * 查询log
     *
     * @param operationLogId log主键
     * @return log
     */
    public Operationlog selectOperationlogByOperationLogId(Long operationLogId);

    /**
     * 查询log列表
     *
     * @param operationlog log
     * @return log集合
     */
    public List<Operationlog> selectOperationlogList(Operationlog operationlog);

    /**
     * 新增log
     *
     * @param operationlog log
     * @return 结果
     */
    public int insertOperationlog(Operationlog operationlog);

    /**
     * 修改log
     *
     * @param operationlog log
     * @return 结果
     */
    public int updateOperationlog(Operationlog operationlog);

    /**
     * 删除log
     *
     * @param operationLogId log主键
     * @return 结果
     */
    public int deleteOperationlogByOperationLogId(Long operationLogId);

    /**
     * 批量删除log
     *
     * @param operationLogIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOperationlogByOperationLogIds(Long[] operationLogIds);
}
