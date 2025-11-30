package com.I_care.Audit_Service.DTO;


public class AuditRequest {

    private Long id;
    private String serviceName;
    private String action;
    private String resourceName;
    private String resourceId;
    private String userName;
    private String timeStamp;

    private String details;

    public AuditRequest() {
    }

    public AuditRequest(Long id, String serviceName, String action, String resourceName, String resourceId, String userName, String timeStamp, String details) {
        this.id = id;
        this.serviceName = serviceName;
        this.action = action;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.userName = userName;
        this.timeStamp = timeStamp;
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
