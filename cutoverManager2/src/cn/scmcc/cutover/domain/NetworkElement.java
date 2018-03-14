package cn.scmcc.cutover.domain;

import java.util.Date;

public class NetworkElement {
	private String id;
	private String eomsID;//工单编号
	private String projectID;//工程预约编号
	private String projectType;//预约类型（网元/STP/SPC）
	private String elementType;// 网元类型
	private String neName;// 网元名称
	private Date startTime;// 开始时间
	private Date endTime;// 结束时间
	private String sourceSystem;// 来源系统（默认“话务网管”）
	private String operator;//操作人
	private String endNeName;//对端网元名称（SPC预约）/对端局向名称（STP预约）
	private String endSignallingPoint ;//对端信令点编码（SPC预约）
	private String projectName;//割接工程名称
	public String getEomsID() {
		return eomsID;
	}
	public void setEomsID(String eomsID) {
		this.eomsID = eomsID;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public String getElementType() {
		return elementType;
	}
	public void setElementType(String elementType) {
		this.elementType = elementType;
	}
	public String getNeName() {
		return neName;
	}
	public void setNeName(String neName) {
		this.neName = neName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getEndNeName() {
		return endNeName;
	}
	public void setEndNeName(String endNeName) {
		this.endNeName = endNeName;
	}
	public String getEndSignallingPoint() {
		return endSignallingPoint;
	}
	public void setEndSignallingPoint(String endSignallingPoint) {
		this.endSignallingPoint = endSignallingPoint;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
