package com.I_care.Audit_Service.service;

import com.I_care.Audit_Service.DTO.AuditRequest;
import com.I_care.Audit_Service.entity.AuditLog;
import com.I_care.Audit_Service.repository.AuditServiceRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuditServiceImpl implements AuditService{

    private AuditServiceRepository repository;

    @Transactional
    @Override
    public AuditLog saveLog(AuditRequest request) {
        AuditLog log = new AuditLog();
        log.setAction(request.getAction());
        log.setServiceName(request.getServiceName());
        log.setDetails(request.getDetails());
        log.setResourceName(request.getResourceName());
        log.setTimeStamp(LocalDateTime.now().toString());
        log.setResourceId(request.getResourceId());
        return repository.save(log);
    }
}
