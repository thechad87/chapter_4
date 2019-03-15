package com.example.demo.interfacedemo;

import com.example.demo.oo.interfacedemo.AuditService;
import com.example.demo.oo.interfacedemo.Request;
import com.example.demo.oo.interfacedemo.Transaction;
import com.example.demo.oo.interfacedemo.TransportService;
import org.junit.Test;

public class InterfaceTests {

    @Test(expected = IllegalArgumentException.class)
    public void testImplementationOfInterfaceThatShouldFail() {
        AuditService qaAuditService = new AuditService() {
            @Override
            public void audit(Request request) {
                System.out.println("This is QA");
            }
        };

        TransportService qaTransportService = new TransportService() {
            @Override
            public void transportRequest(Request request) {
                System.out.println("Send this of to the QA system");
            }
        };

        Request someRequestThatWillFailValidation = new Request() {
            @Override
            public String getPayload() {
                return "Some payload stuff";
            }

            @Override
            public void validate() throws IllegalArgumentException {
                throw new IllegalArgumentException();
            }
        };

        Transaction qaTransaction = new Transaction(qaAuditService, qaTransportService);
        qaTransaction.transportRequest(someRequestThatWillFailValidation);
    }

    @Test
    public void testImplementationOfInterfaceThatWillPass() {
        AuditService qaAuditService = new AuditService() {
            @Override
            public void audit(Request request) {
                System.out.println("This is QA");
            }
        };

        TransportService qaTransportService = new TransportService() {
            @Override
            public void transportRequest(Request request) {
                System.out.println("Send this of to the QA system");
            }
        };

        Request someRequestThatWillFailValidation = new Request() {
            @Override
            public String getPayload() {
                return "Some payload stuff";
            }

            @Override
            public void validate() throws IllegalArgumentException {
               // all good!
            }
        };

        Transaction qaTransaction = new Transaction(qaAuditService, qaTransportService);
        qaTransaction.transportRequest(someRequestThatWillFailValidation);

        assert true;
    }
}
