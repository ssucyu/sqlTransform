package sun;

import java.sql.Timestamp;

public class IndexResultVO{

    
    private String id;
    
    private String creatorId;
    private Timestamp updatedTime;
    
    @Override
	public String toString() {
		return "IndexResultVO [id=" + id + ", creatorId=" + creatorId + ", updatedTime=" + updatedTime + ", createTime="
				+ createTime + ", updatorId=" + updatorId + ", indexCode=" + indexCode + ", indexName=" + indexName
				+ ", indexValue=" + indexValue + ", lastYearSame=" + lastYearSame + ", yearOnYearCent=" + yearOnYearCent
				+ ", monthOnMonthCent=" + monthOnMonthCent + ", plannedSpeed=" + plannedSpeed + ", indexWarning="
				+ indexWarning + ", orgMrid=" + orgMrid + ", orgName=" + orgName + ", orgLevel=" + orgLevel
				+ ", indexType=" + indexType + ", submitWay=" + submitWay + ", lastYearTotal=" + lastYearTotal
				+ ", totalValue=" + totalValue + ", totalYearCent=" + totalYearCent + ", indexAimValue=" + indexAimValue
				+ ", countTime=" + countTime + ", indexId=" + indexId + ", countCycle=" + countCycle + ", getId()="
				+ getId() + ", getCreatorId()=" + getCreatorId() + ", getUpdatedTime()=" + getUpdatedTime()
				+ ", getCreateTime()=" + getCreateTime() + ", getUpdatorId()=" + getUpdatorId() + ", getIndexCode()="
				+ getIndexCode() + ", getIndexName()=" + getIndexName() + ", getIndexValue()=" + getIndexValue()
				+ ", getLastYearSame()=" + getLastYearSame() + ", getYearOnYearCent()=" + getYearOnYearCent()
				+ ", getMonthOnMonthCent()=" + getMonthOnMonthCent() + ", getPlannedSpeed()=" + getPlannedSpeed()
				+ ", getIndexWarning()=" + getIndexWarning() + ", getOrgMrid()=" + getOrgMrid() + ", getOrgName()="
				+ getOrgName() + ", getOrgLevel()=" + getOrgLevel() + ", getIndexType()=" + getIndexType()
				+ ", getSubmitWay()=" + getSubmitWay() + ", getLastYearTotal()=" + getLastYearTotal()
				+ ", getTotalValue()=" + getTotalValue() + ", getTotalYearCent()=" + getTotalYearCent()
				+ ", getIndexAimValue()=" + getIndexAimValue() + ", getCountTime()=" + getCountTime()
				+ ", getIndexId()=" + getIndexId() + ", getCountCycle()=" + getCountCycle() + ", getPrimaryValue()="
				+ getPrimaryValue() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public IndexResultVO(String id, String creatorId, Timestamp updatedTime, Timestamp createTime, String updatorId,
			String indexCode, String indexName, Double indexValue, Double lastYearSame, Double yearOnYearCent,
			Double monthOnMonthCent, Double plannedSpeed, String indexWarning, String orgMrid, String orgName,
			String orgLevel, String indexType, String submitWay, Double lastYearTotal, Double totalValue,
			Double totalYearCent, Double indexAimValue, String countTime, String indexId, String countCycle) {
		super();
		this.id = id;
		this.creatorId = creatorId;
		this.updatedTime = updatedTime;
		this.createTime = createTime;
		this.updatorId = updatorId;
		this.indexCode = indexCode;
		this.indexName = indexName;
		this.indexValue = indexValue;
		this.lastYearSame = lastYearSame;
		this.yearOnYearCent = yearOnYearCent;
		this.monthOnMonthCent = monthOnMonthCent;
		this.plannedSpeed = plannedSpeed;
		this.indexWarning = indexWarning;
		this.orgMrid = orgMrid;
		this.orgName = orgName;
		this.orgLevel = orgLevel;
		this.indexType = indexType;
		this.submitWay = submitWay;
		this.lastYearTotal = lastYearTotal;
		this.totalValue = totalValue;
		this.totalYearCent = totalYearCent;
		this.indexAimValue = indexAimValue;
		this.countTime = countTime;
		this.indexId = indexId;
		this.countCycle = countCycle;
	}

	private Timestamp createTime;
    private String updatorId;
    
    private String indexCode;
    
    private String indexName;
    
    private Double indexValue;
    
    private Double lastYearSame;
    
    private Double yearOnYearCent;
    
    private Double monthOnMonthCent;
    
    private Double plannedSpeed;
    
    private String indexWarning;
    
    
    private String orgMrid;
    
    private String orgName;
    
    private String orgLevel;
    
    private String indexType;
    
    private String submitWay;
    
    private Double lastYearTotal;
    
    private Double totalValue;
    
    
    
    
    
    
    
    
    
    
    private Double totalYearCent;
    
    private Double indexAimValue;
    
    private String countTime;
    
    private String indexId;
    
    private String countCycle;
    
	
    public String getId() {
        return id;
    }
    	
    public void setId(String id) {
        this.id = id;
    }
    
    public String getCreatorId() {
        return creatorId;
    }
    	
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
    
    public Timestamp getUpdatedTime() {
        return updatedTime;
    }
    	
    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }
    
    public Timestamp getCreateTime() {
        return createTime;
    }
    	
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    public String getUpdatorId() {
        return updatorId;
    }
    	
    public void setUpdatorId(String updatorId) {
        this.updatorId = updatorId;
    }
    
    public String getIndexCode() {
        return indexCode;
    }
    	
    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }
    
    public String getIndexName() {
        return indexName;
    }
    	
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
    public Double getIndexValue() {
        return indexValue;
    }
    	
    public void setIndexValue(Double indexValue) {
        this.indexValue = indexValue;
    }
    
    public Double getLastYearSame() {
        return lastYearSame;
    }
    	
    public void setLastYearSame(Double lastYearSame) {
        this.lastYearSame = lastYearSame;
    }
    
    public Double getYearOnYearCent() {
        return yearOnYearCent;
    }
    	
    public void setYearOnYearCent(Double yearOnYearCent) {
        this.yearOnYearCent = yearOnYearCent;
    }
    
    public Double getMonthOnMonthCent() {
        return monthOnMonthCent;
    }
    	
    public void setMonthOnMonthCent(Double monthOnMonthCent) {
        this.monthOnMonthCent = monthOnMonthCent;
    }
    
    public Double getPlannedSpeed() {
        return plannedSpeed;
    }
    	
    public void setPlannedSpeed(Double plannedSpeed) {
        this.plannedSpeed = plannedSpeed;
    }
    
    /**
     * @return 获取 预警信息(RED:红;YELLOW) 属性值
     */
    public String getIndexWarning() {
        return indexWarning;
    }
    	
    /**
     * @param indexWarning 设置 预警信息(RED:红;YELLOW) 属性值为参数值 indexWarning
     */
    public void setIndexWarning(String indexWarning) {
        this.indexWarning = indexWarning;
    }
    
    /**
     * @return 获取 组织编码 属性值
     */
    public String getOrgMrid() {
        return orgMrid;
    }
    	
    /**
     * @param orgMrid 设置 组织编码 属性值为参数值 orgMrid
     */
    public void setOrgMrid(String orgMrid) {
        this.orgMrid = orgMrid;
    }
    
    /**
     * @return 获取 组织名称 属性值
     */
    public String getOrgName() {
        return orgName;
    }
    	
    /**
     * @param orgName 设置 组织名称 属性值为参数值 orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    /**
     * @return 获取 组织层级 属性值
     */
    public String getOrgLevel() {
        return orgLevel;
    }
    	
    /**
     * @param orgLevel 设置 组织层级 属性值为参数值 orgLevel
     */
    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }
    
    /**
     * @return 获取 指标类型 属性值
     */
    public String getIndexType() {
        return indexType;
    }
    	
    /**
     * @param indexType 设置 指标类型 属性值为参数值 indexType
     */
    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }
    
    /**
     * @return 获取 指标报送方式 属性值
     */
    public String getSubmitWay() {
        return submitWay;
    }
    	
    /**
     * @param submitWay 设置 指标报送方式 属性值为参数值 submitWay
     */
    public void setSubmitWay(String submitWay) {
        this.submitWay = submitWay;
    }
    
    /**
     * @return 获取 去年累计值 属性值
     */
    public Double getLastYearTotal() {
        return lastYearTotal;
    }
    	
    /**
     * @param lastYearTotal 设置 去年累计值 属性值为参数值 lastYearTotal
     */
    public void setLastYearTotal(Double lastYearTotal) {
        this.lastYearTotal = lastYearTotal;
    }
    
    /**
     * @return 获取 年累计值 属性值
     */
    public Double getTotalValue() {
        return totalValue;
    }
    	
    /**
     * @param totalValue 设置 年累计值 属性值为参数值 totalValue
     */
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
    
    /**
     * @return 获取 年累计值同比 属性值
     */
    public Double getTotalYearCent() {
        return totalYearCent;
    }
    	
    /**
     * @param totalYearCent 设置 年累计值同比 属性值为参数值 totalYearCent
     */
    public void setTotalYearCent(Double totalYearCent) {
        this.totalYearCent = totalYearCent;
    }
    
    /**
     * @return 获取 目标值 属性值
     */
    public Double getIndexAimValue() {
        return indexAimValue;
    }
    	
    /**
     * @param indexAimValue 设置 目标值 属性值为参数值 indexAimValue
     */
    public void setIndexAimValue(Double indexAimValue) {
        this.indexAimValue = indexAimValue;
    }
    
    /**
     * @return 获取 统计时间 属性值
     */
    public String getCountTime() {
        return countTime;
    }
    	
    /**
     * @param countTime 设置 统计时间 属性值为参数值 countTime
     */
    public void setCountTime(String countTime) {
        this.countTime = countTime;
    }
    
    /**
     * @return 获取 指标定义id 属性值
     */
    public String getIndexId() {
        return indexId;
    }
    	
    /**
     * @param indexId 设置 指标定义id 属性值为参数值 indexId
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }
    
    /**
     * @return 获取 统计周期(1年2季3月4累计) 属性值
     */
    public String getCountCycle() {
        return countCycle;
    }
    	
    /**
     * @param countCycle 设置 统计周期(1年2季3月4累计) 属性值为参数值 countCycle
     */
    public void setCountCycle(String countCycle) {
        this.countCycle = countCycle;
    }
    
    public String getPrimaryValue(){
    		return  this.id;
    }
}