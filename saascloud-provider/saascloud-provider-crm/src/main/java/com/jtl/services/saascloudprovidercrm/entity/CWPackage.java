package com.jtl.services.saascloudprovidercrm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CWPackage implements Serializable {
    /** ID */
    private Long id;

    /** 合同名称 */
    private String cwContractName;

    /** 发包类型0:材料采购;1:劳务分包;2:专业分包;3:劳辅双包;4:措施合同;默认0 */
    private Byte packageType;

    /** 来源 0-新建发包 1-暂存单生成 */
    private Byte source;

    /** 施工id */
    private Long constructionId;

    /** 业务id */
    private Long businessId;

    /** 供应商ID */
    private Long supplierId;

    /** 供应商名称 */
    private String supplierName;

    /** 分包金额 */
    private BigDecimal packageAmount;

    /** 首签合同金额 */
    private BigDecimal contractAmount;

    /** 已入库金额 */
    private BigDecimal inAmount;

    /** 累计核算金额 */
    private BigDecimal auditAmount;

    /** 已付款金额 */
    private BigDecimal paymentAmount;

    /** 是否删除1：删除；0：有效 */
    private Byte deleted;

    /** 备注 */
    private String remark;

    /** 创建人 */
    private String createUser;

    /** 创建日期 */
    private Date createTime;

    /** 更新人 */
    private String updateUser;

    /** 更新日期 */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCwContractName() {
        return cwContractName;
    }

    public void setCwContractName(String cwContractName) {
        this.cwContractName = cwContractName == null ? null : cwContractName.trim();
    }

    public Byte getPackageType() {
        return packageType;
    }

    public void setPackageType(Byte packageType) {
        this.packageType = packageType;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Long getConstructionId() {
        return constructionId;
    }

    public void setConstructionId(Long constructionId) {
        this.constructionId = constructionId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public BigDecimal getPackageAmount() {
        return packageAmount;
    }

    public void setPackageAmount(BigDecimal packageAmount) {
        this.packageAmount = packageAmount;
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public BigDecimal getInAmount() {
        return inAmount;
    }

    public void setInAmount(BigDecimal inAmount) {
        this.inAmount = inAmount;
    }

    public BigDecimal getAuditAmount() {
        return auditAmount;
    }

    public void setAuditAmount(BigDecimal auditAmount) {
        this.auditAmount = auditAmount;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}