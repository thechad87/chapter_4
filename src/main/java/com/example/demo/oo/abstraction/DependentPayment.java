package com.example.demo.oo.abstraction;

import java.math.BigDecimal;

public class DependentPayment extends AbstractRequest {

    private Integer benficiaryNo;
    private BigDecimal amount;

    public DependentPayment(String sessionId, Integer benficiaryNo, BigDecimal amount) {
        super(sessionId);

        this.benficiaryNo = benficiaryNo;
        this.amount = amount;
    }

    @Override
    protected void validate() throws IllegalArgumentException {
        if (benficiaryNo == null || benficiaryNo.intValue() == 0) {
            throw new IllegalArgumentException("benefiaryNo is invalid");
        }
        if (amount == null || amount.intValue() == 0) {
            throw new IllegalArgumentException("Amount is invalid");
        }
    }
}
