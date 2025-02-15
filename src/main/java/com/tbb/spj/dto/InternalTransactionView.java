package com.tbb.spj.dto;

import java.math.BigDecimal;

public interface InternalTransactionView {
    Long getTransactionId();
    String getAccountingReference();
    BigDecimal getAmount();
    String getCurrency();
    String getStatus();
    Integer getInquiryCounter();
}
