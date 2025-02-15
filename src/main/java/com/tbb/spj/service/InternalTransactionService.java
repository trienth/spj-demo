package com.tbb.spj.service;

import com.tbb.spj.dto.InternalTransactionDto;
import com.tbb.spj.dto.InternalTransactionView;
import com.tbb.spj.entities.InternalTransaction;

import java.util.List;

public interface InternalTransactionService {
    List<InternalTransaction> getTransactionsByStatus(String status);

    List<InternalTransactionView> getTransactionDTOsByStatus(String status);

    List<InternalTransactionDto> getPendingTxns(String status);
}
