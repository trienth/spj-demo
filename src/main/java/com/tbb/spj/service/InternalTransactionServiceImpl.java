package com.tbb.spj.service;

import com.tbb.spj.dto.InternalTransactionDto;
import com.tbb.spj.dto.InternalTransactionView;
import com.tbb.spj.entities.InternalTransaction;
import com.tbb.spj.repositories.InternalTransactionRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InternalTransactionServiceImpl implements InternalTransactionService {
    private final InternalTransactionRepository repository;

    public InternalTransactionServiceImpl(InternalTransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<InternalTransaction> getTransactionsByStatus(String status) {
        return repository.findByStatus(status);
    }

    @Override
    @Transactional(readOnly = true)
    public List<InternalTransactionView> getTransactionDTOsByStatus(String status) {
        return repository.findAllByStatus(status);
    }

    @Transactional(readOnly = true)
    @Override
    public List<InternalTransactionDto> getPendingTxns(String status) {
        return repository.findPendingTransaction(status);
    }

    @Override
    public Page<InternalTransactionDto> findAllPendingTransaction(String status, Pageable pageable){
        return repository.findAllPendingTransaction(status, pageable);
    }
}
