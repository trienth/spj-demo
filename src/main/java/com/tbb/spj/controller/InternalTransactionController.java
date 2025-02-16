package com.tbb.spj.controller;

import com.tbb.spj.dto.InternalTransactionDto;
import com.tbb.spj.dto.InternalTransactionView;
import com.tbb.spj.entities.InternalTransaction;
import com.tbb.spj.service.InternalTransactionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class InternalTransactionController {
    private final InternalTransactionService service;

    public InternalTransactionController(InternalTransactionService service) {
        this.service = service;
    }

    // 1. Normal Query (Returns Full Entity)
    @GetMapping("/normal")
    public List<InternalTransaction> getTransactions(@RequestParam String status) {
        return service.getTransactionsByStatus(status);
    }

    // 2. DTO Projection Query (Returns Selected Fields)
    @GetMapping("/close-projection")
    public List<InternalTransactionView> getTransactionDTOs(@RequestParam String status) {
        return service.getTransactionDTOsByStatus(status);
    }

    @GetMapping("/dto-projection")
    public List<InternalTransactionDto> getPendingTxns() {
        return service.getPendingTxns("PENDING");
    }

    @GetMapping("/pending")
    public ResponseEntity<Page<InternalTransactionDto>> getPendingTransactions(
            @RequestParam String status,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Order.desc("transactionId")));
        Page<InternalTransactionDto> result = service.findAllPendingTransaction(status, pageable);
        return ResponseEntity.ok(result);
    }
}