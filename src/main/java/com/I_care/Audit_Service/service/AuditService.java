package com.I_care.Audit_Service.service;

import com.I_care.Audit_Service.DTO.AuditRequest;
import com.I_care.Audit_Service.entity.AuditLog;

public interface AuditService {

    public AuditLog saveLog(AuditRequest auditRequest) ;
}
