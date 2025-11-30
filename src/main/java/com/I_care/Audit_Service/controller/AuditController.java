package com.I_care.Audit_Service.controller;

import com.I_care.Audit_Service.DTO.AuditRequest;
import com.I_care.Audit_Service.service.AuditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audit")
public class AuditController {

    Logger logger = LoggerFactory.getLogger(AuditController.class);

    private AuditService auditService;

    public void saveAuditLog(@RequestBody AuditRequest auditRequest) {
        logger.info("Started Saving Log Info");
        auditService.saveLog(auditRequest);
        logger.info("Saved Logs Successfully");
    }
}
