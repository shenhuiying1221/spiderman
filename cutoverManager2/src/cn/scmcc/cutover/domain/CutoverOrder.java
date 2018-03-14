package cn.scmcc.cutover.domain;

import java.util.Date;

public class CutoverOrder {	
	private String id;//系统id
	private Date cutoverdate;//日期
	private String grade;//割接级别
	private String orderName;//工单名称
	private String orderNumber;//工单编号
	private String city;//地市
	private String department;//操作人部门
	private String major;//专业
	private String subject;//主题
	private String effect;//割接影响情况
	private String isAffectBusiness;//是否影响业务
	private String isInOrOut;//是否属于入退网割接
	private String inOrOutType;//入退网类型
	private String inType;//入网类型
	private String notInOrOutType;//非入退网类型
	private String isFirstSoftwareChange;//是否涉及首次软件变更
	private String isAffectDestinationSignalingPoint;//是否影响目的信令点
	private String isAffectMonitoring;//是否影响监控
	private Date applyStartTime;//割接开始时间
	private Date applyEndTime;//割接结束时间
	private String cooperatorName;//割接配合人名
	private String cooperatorPhone;//割接配合联系方式
	private String affectNetworkElement;//影响网元
	private String emergencyMeasure;//应急措施
	private String isNeedDialTest;//是否需要割接拨测验证
	private String projectReservationID;//工程预约ID
	private String projectReservationResource;//工程预约来源（直真/话务网管）
	private String transmissionClassification;//传输割接分类
	private String isNeedOpticalPowerTest;//是否需要光功率验证
	private Date realStartTime;//实际割接开始时间
	private Date realEndTime;//实际割接结束时间 
	private Date projectReservationCancelTime;//工程预约取消时间
	private String cutoverState;//割接状态
	private String userOpertor;//用户操作 取消/确认
	
	private String cancelReason;//割接取消原因
	private String ReasonOfAlarmFiling;//有告警归档的原因
	
	
	public String getCancelReason() {
		return cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	public String getReasonOfAlarmFiling() {
		return ReasonOfAlarmFiling;
	}
	public void setReasonOfAlarmFiling(String reasonOfAlarmFiling) {
		ReasonOfAlarmFiling = reasonOfAlarmFiling;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getIsAffectBusiness() {
		return isAffectBusiness;
	}
	public void setIsAffectBusiness(String isAffectBusiness) {
		this.isAffectBusiness = isAffectBusiness;
	}
	public String getIsInOrOut() {
		return isInOrOut;
	}
	public void setIsInOrOut(String isInOrOut) {
		this.isInOrOut = isInOrOut;
	}
	public String getInOrOutType() {
		return inOrOutType;
	}
	public void setInOrOutType(String inOrOutType) {
		this.inOrOutType = inOrOutType;
	}
	public String getInType() {
		return inType;
	}
	public void setInType(String inType) {
		this.inType = inType;
	}
	public String getNotInOrOutType() {
		return notInOrOutType;
	}
	public void setNotInOrOutType(String notInOrOutType) {
		this.notInOrOutType = notInOrOutType;
	}
	public String getIsFirstSoftwareChange() {
		return isFirstSoftwareChange;
	}
	public void setIsFirstSoftwareChange(String isFirstSoftwareChange) {
		this.isFirstSoftwareChange = isFirstSoftwareChange;
	}
	public String getIsAffectDestinationSignalingPoint() {
		return isAffectDestinationSignalingPoint;
	}
	public void setIsAffectDestinationSignalingPoint(
			String isAffectDestinationSignalingPoint) {
		this.isAffectDestinationSignalingPoint = isAffectDestinationSignalingPoint;
	}
	public String getIsAffectMonitoring() {
		return isAffectMonitoring;
	}
	public void setIsAffectMonitoring(String isAffectMonitoring) {
		this.isAffectMonitoring = isAffectMonitoring;
	}
	public Date getApplyStartTime() {
		return applyStartTime;
	}
	public void setApplyStartTime(Date applyStartTime) {
		this.applyStartTime = applyStartTime;
	}
	public Date getApplyEndTime() {
		return applyEndTime;
	}
	public void setApplyEndTime(Date applyEndTime) {
		this.applyEndTime = applyEndTime;
	}
	public String getCooperatorName() {
		return cooperatorName;
	}
	public void setCooperatorName(String cooperatorName) {
		this.cooperatorName = cooperatorName;
	}
	public String getCooperatorPhone() {
		return cooperatorPhone;
	}
	public void setCooperatorPhone(String cooperatorPhone) {
		this.cooperatorPhone = cooperatorPhone;
	}
	public String getAffectNetworkElement() {
		return affectNetworkElement;
	}
	public void setAffectNetworkElement(String affectNetworkElement) {
		this.affectNetworkElement = affectNetworkElement;
	}
	public String getEmergencyMeasure() {
		return emergencyMeasure;
	}
	public void setEmergencyMeasure(String emergencyMeasure) {
		this.emergencyMeasure = emergencyMeasure;
	}
	public String getIsNeedDialTest() {
		return isNeedDialTest;
	}
	public void setIsNeedDialTest(String isNeedDialTest) {
		this.isNeedDialTest = isNeedDialTest;
	}
	public String getProjectReservationID() {
		return projectReservationID;
	}
	public void setProjectReservationID(String projectReservationID) {
		this.projectReservationID = projectReservationID;
	}
	public String getProjectReservationResource() {
		return projectReservationResource;
	}
	public void setProjectReservationResource(String projectReservationResource) {
		this.projectReservationResource = projectReservationResource;
	}
	public String getTransmissionClassification() {
		return transmissionClassification;
	}
	public void setTransmissionClassification(String transmissionClassification) {
		this.transmissionClassification = transmissionClassification;
	}
	public String getIsNeedOpticalPowerTest() {
		return isNeedOpticalPowerTest;
	}
	public void setIsNeedOpticalPowerTest(String isNeedOpticalPowerTest) {
		this.isNeedOpticalPowerTest = isNeedOpticalPowerTest;
	}
	public Date getRealStartTime() {
		return realStartTime;
	}
	public void setRealStartTime(Date realStartTime) {
		this.realStartTime = realStartTime;
	}
	public Date getRealEndTime() {
		return realEndTime;
	}
	public void setRealEndTime(Date realEndTime) {
		this.realEndTime = realEndTime;
	}
	public Date getProjectReservationCancelTime() {
		return projectReservationCancelTime;
	}
	public void setProjectReservationCancelTime(Date projectReservationCancelTime) {
		this.projectReservationCancelTime = projectReservationCancelTime;
	}
	public String getCutoverState() {
		return cutoverState;
	}
	public void setCutoverState(String cutoverState) {
		this.cutoverState = cutoverState;
	}
	public String getUserOpertor() {
		return userOpertor;
	}
	public void setUserOpertor(String userOpertor) {
		this.userOpertor = userOpertor;
	}
	public Date getCutoverdate() {
		return cutoverdate;
	}
	public void setCutoverdate(Date cutoverdate) {
		this.cutoverdate = cutoverdate;
	}
		
}
