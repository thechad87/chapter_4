package com.example.demo.oo.interfaces;

import java.io.Serializable;

// 1
public class Transaction implements Serializable, Query, TransportServ {

    private QueryServ queryServ;
    private TransportServ transportServ;

    //2
    public Transaction(QueryServ queryServ, TransportServ transportServ) {
        this.queryServ = queryServ;
        this.transportServ = transportServ;
    }

    //3
    @Override
    public void transportRequest(Request request) {
        request.validate();

        //2
        transportServ.transportRequest(request);
        queryServ.audit(request);
    }
}
