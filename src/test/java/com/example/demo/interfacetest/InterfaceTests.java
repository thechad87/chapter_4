package com.example.demo.interfacetest;

import com.example.demo.oo.interfaces.QueryServ;
import com.example.demo.oo.interfaces.Request;
import com.example.demo.oo.interfaces.Transaction;
import com.example.demo.oo.interfaces.TransportServ;
import org.junit.Test;

public class InterfaceTests {

    @Test(expected = IllegalArgumentException.class)
    public void testImplementationOfInterfaceThatShouldFail() {
        QueryServ qaQueryServ = new QueryServ() {
            @Override
            public void audit(Request request) {
                System.out.println("This is QA");
            }
        };

        TransportServ qaTransportServ = new TransportServ() {
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

        Transaction qaTransaction = new Transaction(qaQueryServ, qaTransportServ);
        qaTransaction.transportRequest(someRequestThatWillFailValidation);
    }

    @Test
    public void testImplementationOfInterfaceThatWillPass() {
        QueryServ qaQueryServ = new QueryServ() {
            @Override
            public void audit(Request request) {
                System.out.println("This is QA");
            }
        };

        TransportServ qaTransportServ = new TransportServ() {
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

        Transaction qaTransaction = new Transaction(qaQueryServ, qaTransportServ);
        qaTransaction.transportRequest(someRequestThatWillFailValidation);

        assert true;
    }
}
