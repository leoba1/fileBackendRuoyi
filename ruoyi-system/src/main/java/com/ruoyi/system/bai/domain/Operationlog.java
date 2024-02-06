package com.ruoyi.system.bai.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * log对象 operationlog
 *
 * @author bai
 * @date 2024-01-20
 */
public class Operationlog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long operationLogId;

    /** 操作详情 */
    @Excel(name = "操作详情")
    private String detail;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long logLevel;

    /** 操作 */
    @Excel(name = "操作")
    private String operation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String operationObj;

    /** 平台(1-社区,2-管理端,3-网盘,4-股票) */
    @Excel(name = "平台(1-社区,2-管理端,3-网盘,4-股票)")
    private Long platform;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String requestMethod;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String requestURI;

    /** 操作结果 */
    @Excel(name = "操作结果")
    private String result;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String source;

    /** 终端ip地址 */
    @Excel(name = "终端ip地址")
    private String terminal;

    /** 操作时间 */
    @Excel(name = "操作时间")
    private String time;

    /** 用户id */
    @Excel(name = "用户id")
    private String userId;

    public void setOperationLogId(Long operationLogId)
    {
        this.operationLogId = operationLogId;
    }

    public Long getOperationLogId()
    {
        return operationLogId;
    }
    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public String getDetail()
    {
        return detail;
    }
    public void setLogLevel(Long logLevel)
    {
        this.logLevel = logLevel;
    }

    public Long getLogLevel()
    {
        return logLevel;
    }
    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getOperation()
    {
        return operation;
    }
    public void setOperationObj(String operationObj)
    {
        this.operationObj = operationObj;
    }

    public String getOperationObj()
    {
        return operationObj;
    }
    public void setPlatform(Long platform)
    {
        this.platform = platform;
    }

    public Long getPlatform()
    {
        return platform;
    }
    public void setRequestMethod(String requestMethod)
    {
        this.requestMethod = requestMethod;
    }

    public String getRequestMethod()
    {
        return requestMethod;
    }
    public void setRequestURI(String requestURI)
    {
        this.requestURI = requestURI;
    }

    public String getRequestURI()
    {
        return requestURI;
    }
    public void setResult(String result)
    {
        this.result = result;
    }

    public String getResult()
    {
        return result;
    }
    public void setSource(String source)
    {
        this.source = source;
    }

    public String getSource()
    {
        return source;
    }
    public void setTerminal(String terminal)
    {
        this.terminal = terminal;
    }

    public String getTerminal()
    {
        return terminal;
    }
    public void setTime(String time)
    {
        this.time = time;
    }

    public String getTime()
    {
        return time;
    }
    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("operationLogId", getOperationLogId())
            .append("detail", getDetail())
            .append("logLevel", getLogLevel())
            .append("operation", getOperation())
            .append("operationObj", getOperationObj())
            .append("platform", getPlatform())
            .append("requestMethod", getRequestMethod())
            .append("requestURI", getRequestURI())
            .append("result", getResult())
            .append("source", getSource())
            .append("terminal", getTerminal())
            .append("time", getTime())
            .append("userId", getUserId())
            .toString();
    }
}
