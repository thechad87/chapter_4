package com.example.demo.oo.interfacedemo;

import java.io.Serializable;

/**
 * 1. In java you can have MULTIPLE INHERITANCE with interfaces, but can only extend one class or abstract class.
 *
 * 2. Interface is great for creating contracts (AKA frameworks) without supplying the implementation. The benefit
 *    of not supplying the implementation is great for when you have different environments or platforms that you need
 *    to support - in which case it is up to the developer of that environment/platform to supply the implementation
 *    to fulfill the contract.
 *
 *    An example of this is where you have a banking system and you have a QA, DEV and PRODUCTION environment which
 *    requires an alternative implementation on some of the interfaces.
 *
 * 3. Overriden method can only be public. Abstract methods can be protected.
 *
 */

// 1
public class Transaction implements Serializable, Auditable, TransportService {

    private AuditService auditService;
    private TransportService transportService;

    //2
    public Transaction(AuditService auditService, TransportService transportService) {
        this.auditService = auditService;
        this.transportService = transportService;
    }

    //3
    @Override
    public void transportRequest(Request request) {
        request.validate();

        //2
        transportService.transportRequest(request);
        auditService.audit(request);
    }
}
