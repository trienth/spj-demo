package com.tbb.spj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InternalTransactionDto {
    private long transactionId;
    private String status;
    private Integer inquiryCounter;
    private String additionalInformation;
    private String accountingReference;
    private String accountingDate;
}
